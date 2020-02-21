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

        fun delete(permissionId: PermissionId) = IHateGlobalState.permissions.remove(permissionId)

        fun find(permissionId: PermissionId) = IHateGlobalState.permissions.find(permissionId)

        fun all(): List<Permission> = IHateGlobalState.permissions.map { it }

        fun allIds(): List<PermissionId> = all().map { it.id }
    }

    object Users {
        fun add(userId: UserId) {
            IHateGlobalState.users.find(userId) ?: IHateGlobalState.users.add(userId)
        }

        fun delete(userId: UserId) = IHateGlobalState.users.remove(userId)

        fun find(userId: UserId) = IHateGlobalState.users.find(userId)

        fun all(): List<User> = IHateGlobalState.users.map { it }

        fun allIds(): List<UserId> = all().map { it.id }
    }

    object Groups {
        fun add(groupId: GroupId) {
            IHateGlobalState.groups.find(groupId) ?: IHateGlobalState.groups.add(groupId)
        }

        fun delete(groupId: GroupId) = IHateGlobalState.groups.remove(groupId)

        fun find(groupId: GroupId) = IHateGlobalState.groups.find(groupId)

        fun all(): List<Group> = IHateGlobalState.groups.map { it }

        fun allIds(): List<GroupId> = all().map { it.id }
    }
}
