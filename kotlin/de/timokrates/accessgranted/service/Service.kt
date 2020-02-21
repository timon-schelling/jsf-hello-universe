package de.timokrates.accessgranted.service

import de.timokrates.accessgranted.repository.group.Group
import de.timokrates.accessgranted.repository.group.GroupId
import de.timokrates.accessgranted.repository.permissions.Permission
import de.timokrates.accessgranted.repository.permissions.PermissionId
import de.timokrates.accessgranted.repository.user.User
import de.timokrates.accessgranted.repository.user.UserId

object Service {

    object Permissions {

        fun add(permissionId: PermissionId) {
            IHateGlobalState.permissions.find(permissionId) ?: IHateGlobalState.permissions.add(permissionId)
        }

        fun add(permissionId: String) = add(PermissionId(permissionId))

        fun delete(permissionId: PermissionId) = IHateGlobalState.permissions.remove(permissionId)

        fun delete(permissionId: String) = delete(PermissionId(permissionId))

        fun find(permissionId: PermissionId) = IHateGlobalState.permissions.find(permissionId)

        fun find(permissionId: String) = find(PermissionId(permissionId))

        fun all(): List<Permission> = IHateGlobalState.permissions.map { it }

        fun allIds(): List<PermissionId> = all().map { it.id }

    }

    object Users {

        fun add(userId: UserId) {
            IHateGlobalState.users.find(userId) ?: IHateGlobalState.users.add(userId)
        }

        fun add(userId: String) = add(UserId(userId))

        fun delete(userId: UserId) = IHateGlobalState.users.remove(userId)

        fun delete(userId: String) = delete(UserId(userId))

        fun find(userId: UserId) = IHateGlobalState.users.find(userId)

        fun find(userId: String) = find(UserId(userId))

        fun all(): List<User> = IHateGlobalState.users.map { it }

        fun allIds(): List<UserId> = all().map { it.id }

    }

    object Groups {

        fun add(groupId: GroupId) {
            IHateGlobalState.groups.find(groupId) ?: IHateGlobalState.groups.add(groupId)
        }

        fun add(groupId: String) = add(GroupId(groupId))

        fun delete(groupId: GroupId) = IHateGlobalState.groups.remove(groupId)

        fun delete(groupId: String) = delete(GroupId(groupId))

        fun find(groupId: GroupId) = IHateGlobalState.groups.find(groupId)

        fun find(groupId: String) = find(GroupId(groupId))

        fun all(): List<Group> = IHateGlobalState.groups.map { it }

        fun allIds(): List<GroupId> = all().map { it.id }

    }
}
