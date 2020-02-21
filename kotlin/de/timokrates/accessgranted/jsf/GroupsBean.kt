package de.timokrates.accessgranted.jsf

import de.timokrates.accessgranted.service.Service
import de.timokrates.accessgranted.repository.group.GroupId
import de.timokrates.accessgranted.repository.permissions.PermissionId
import java.io.Serializable
import javax.faces.bean.ManagedBean
import javax.faces.bean.SessionScoped

@ManagedBean
@SessionScoped
class GroupsBean : Serializable {

    var addGroup: String = ""

    var selectedGroup: String = ""
        get() = Service.Groups.find(field)?.id?.value ?: ""
        set(value) {
            val group = Service.Groups.find(value)
            group ?: return
            field = group.id.value
        }

    val allGroups get() = Service.Groups.allIds().map { it.value }

    fun addNewGroup() {
        if (addGroup.isBlank()) return
        Service.Groups.add(addGroup)
        addGroup = ""
    }

    fun deleteSelectedGroup() {
        Service.Groups.delete(selectedGroup)
    }

    var addPermission: String = ""

    var selectedPermission: String = ""
        get() = Service.Permissions.find(field)?.id?.value ?: ""
        set(value) {
            val permission = Service.Permissions.find(value)
            permission ?: return
            field = permission.id.value
        }

    val availablePermissions: List<String>
        get() {
            val allIds = Service.Permissions.allIds()
            val filteredIds = allIds.filter { permission ->
                Service.Groups.find(selectedGroup)?.permissions?.none { it == permission } ?: false
            }
            return filteredIds.map { it.value }
        }

    val groupPermissions: List<String>
        get() {
            val allIds = Service.Permissions.allIds()
            val filteredIds = allIds.filter { permission ->
                Service.Groups.find(selectedGroup)?.permissions?.any { it == permission } ?: false
            }
            return filteredIds.map { it.value }
        }


    fun openGroup() {

    }

    fun addNewPermission() {
        if (addPermission.isBlank()) return
        Service.Groups.find(selectedGroup)?.also { it.permissions.add(PermissionId(addPermission)) }
        addPermission = ""
    }

    fun removeSelectedPermission() {
        Service.Groups.find(selectedGroup)?.also { it.permissions.remove(PermissionId(selectedPermission)) }
        selectedPermission = ""
    }
}
