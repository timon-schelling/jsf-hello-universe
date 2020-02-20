package de.timokrates.accessgranted.jsf

import de.timokrates.accessgranted.service.Service
import de.timokrates.accessgranted.repository.permissions.PermissionId
import java.io.Serializable
import javax.faces.bean.ManagedBean
import javax.faces.bean.SessionScoped

@ManagedBean
@SessionScoped
class PermissionsBean : Serializable {

    var addPermission: String = ""

    var selectedPermission: String = ""
        get() = Service.findPermission(PermissionId(field))?.id?.value ?: ""
        set(value) {
            val permission = Service.findPermission(PermissionId(value))
            permission ?: return
            field = permission.id.value
        }

    val allPermissions get() = Service.allPermissionIds().map { it.value }

    fun addNewPermission() {
        if (addPermission.isBlank()) return
        Service.addPermission(PermissionId(addPermission))
        addPermission = ""
    }

    fun deleteSelectedPermission() {
        Service.deletePermission(PermissionId(selectedPermission))
    }
}
