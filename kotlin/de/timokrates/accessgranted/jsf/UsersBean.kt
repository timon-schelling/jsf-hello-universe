package de.timokrates.accessgranted.jsf

import de.timokrates.accessgranted.service.Service
import de.timokrates.accessgranted.repository.user.UserId
import java.io.Serializable
import javax.faces.bean.ManagedBean
import javax.faces.bean.SessionScoped

@ManagedBean
@SessionScoped
class UsersBean : Serializable {

    var addUser: String = ""

    var selectedUser: String = ""
        get() = Service.Users.find(UserId(field))?.id?.value ?: ""
        set(value) {
            val user = Service.Users.find(UserId(value))
            user ?: return
            field = user.id.value
        }

    val allUsers get() = Service.Users.allIds().map { it.value }

    fun addNewUser() {
        if (addUser.isBlank()) return
        Service.Users.add(UserId(addUser))
        addUser = ""
    }

    fun deleteSelectedUser() {
        Service.Users.delete(UserId(selectedUser))
    }
}
