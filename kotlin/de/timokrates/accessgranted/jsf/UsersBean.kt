package de.timokrates.accessgranted.jsf

import de.timokrates.accessgranted.repository.group.GroupId
import de.timokrates.accessgranted.service.Service
import java.io.Serializable
import javax.faces.bean.ManagedBean
import javax.faces.bean.SessionScoped

@ManagedBean
@SessionScoped
class UsersBean : Serializable {

    var addUserText: String = ""

    var selectedUser: String = ""
        get() = Service.Users.find(field)?.id?.value ?: ""
        set(value) {
            val user = Service.Users.find(value)
            user ?: return
            field = user.id.value
        }

    val allUsers get() = Service.Users.allIds().map { it.value }

    var addGroupText: String = ""

    var selectedGroup: String = ""
        get() = Service.Groups.find(field)?.id?.value ?: ""
        set(value) {
            val group = Service.Groups.find(value)
            group ?: return
            field = group.id.value
        }

    val availableGroups: List<String>
        get() {
            return Service.Users.find(selectedUser)?.groups?.map { it.value } ?: emptyList()
        }

    val userGroups: List<String>
        get() {
            val allIds = Service.Groups.allIds()
            val filteredIds = allIds.filter {
                !(Service.Users.find(selectedUser)?.groups?.contains(it) ?: false)
            }
            return filteredIds.map { it.value }
        }

    fun addUser() {
        if (addUserText.isBlank()) return
        Service.Users.add(addUserText)
        addUserText = ""
    }

    fun deleteSelectedUser() {
        Service.Users.delete(selectedUser)
    }


    fun openUser() { }

    fun addGroup() {
        if (addGroupText.isBlank()) return
        Service.Users.addGroup(selectedUser, addGroupText)
        addGroupText = ""
    }

    fun removeSelectedGroup() {
        Service.Users.removeGroup(selectedUser, selectedGroup)
        selectedGroup = ""
    }
}
