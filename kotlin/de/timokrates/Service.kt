package de.timokrates

import de.timokrates.accessgranted.group.Group
import de.timokrates.accessgranted.group.GroupId
import de.timokrates.accessgranted.permissions.Permission
import de.timokrates.accessgranted.permissions.PermissionId
import de.timokrates.accessgranted.user.User
import de.timokrates.accessgranted.user.UserId

object Service {

    fun addPermission(permissionId: PermissionId) {
        IHateGlobalState.permissions.find(permissionId) ?: IHateGlobalState.permissions.add(permissionId)
    }

    fun deletePermission(permissionId: PermissionId) = IHateGlobalState.permissions.remove(permissionId)

    fun findPermission(permissionId: PermissionId) = IHateGlobalState.permissions.find(permissionId)

    fun allPermissions(): List<Permission> = IHateGlobalState.permissions.map { it }

    fun allPermissionIds(): List<PermissionId> = allPermissions().map { it.id }


    fun addUser(userId: UserId) {
        IHateGlobalState.users.find(userId) ?: IHateGlobalState.users.add(userId)
    }

    fun deleteUser(userId: UserId) = IHateGlobalState.users.remove(userId)

    fun findUser(userId: UserId) = IHateGlobalState.users.find(userId)

    fun allUsers(): List<User> = IHateGlobalState.users.map { it }

    fun allUserIds(): List<UserId> = allUsers().map { it.id }


    fun addGroup(groupId: GroupId) {
        IHateGlobalState.groups.find(groupId) ?: IHateGlobalState.groups.add(groupId)
    }

    fun deleteGroup(groupId: GroupId) = IHateGlobalState.groups.remove(groupId)

    fun findGroup(groupId: GroupId) = IHateGlobalState.groups.find(groupId)

    fun allGroups(): List<Group> = IHateGlobalState.groups.map { it }

    fun allGroupIds(): List<GroupId> = allGroups().map { it.id }
}
