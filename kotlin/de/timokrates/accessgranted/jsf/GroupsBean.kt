package de.timokrates.accessgranted.jsf

import de.timokrates.accessgranted.service.Service
import de.timokrates.accessgranted.repository.group.GroupId
import java.io.Serializable
import javax.faces.bean.ManagedBean
import javax.faces.bean.SessionScoped

@ManagedBean
@SessionScoped
class GroupsBean : Serializable {

    var addGroup: String = ""

    var selectedGroup: String = ""
        get() = Service.Groups.find(GroupId(field))?.id?.value ?: ""
        set(value) {
            val group = Service.Groups.find(GroupId(value))
            group ?: return
            field = group.id.value
        }

    val allGroups get() = Service.Groups.allIds().map { it.value }

    fun addNewGroup() {
        if (addGroup.isBlank()) return
        Service.Groups.add(GroupId(addGroup))
        addGroup = ""
    }

    fun deleteSelectedGroup() {
        Service.Groups.delete(GroupId(selectedGroup))
    }
}
