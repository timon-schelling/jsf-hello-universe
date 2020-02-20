package de.timokrates.jsf

import de.timokrates.Service
import de.timokrates.accessgranted.user.UserId
import java.io.Serializable
import javax.faces.bean.ManagedBean
import javax.faces.bean.SessionScoped

@ManagedBean
@SessionScoped
class UsersBean : Serializable {

    var addUser: String = ""

    var selectedUser: String = ""
        get() = Service.findUser(UserId(field))?.id?.value ?: ""
        set(value) {
            val user = Service.findUser(UserId(value))
            user ?: return
            field = user.id.value
        }

    val allUsers get() = Service.allUserIds().map { it.value }

    fun addNewUser() {
        if (addUser.isBlank()) return
        Service.addUser(UserId(addUser))
        addUser = ""
    }

    fun deleteSelectedUser() {
        Service.deleteUser(UserId(selectedUser))
    }
}
