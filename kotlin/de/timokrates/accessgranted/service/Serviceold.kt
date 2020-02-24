package de.timokrates.accessgranted.service

import de.timokrates.accessgranted.repository.Repository
import de.timokrates.accessgranted.repository.group.Group
import de.timokrates.accessgranted.repository.group.GroupId
import de.timokrates.accessgranted.repository.permissions.Permission
import de.timokrates.accessgranted.repository.permissions.PermissionId
import de.timokrates.accessgranted.repository.user.User
import de.timokrates.accessgranted.repository.user.UserId

object Service : Repository by ServiceRepository() {

    object Permissions {

        fun add(permissionId: PermissionId) {
            permissions.find(permissionId) ?: permissions.add(permissionId)
        }

        fun add(permissionId: String) = add(PermissionId(permissionId))

        fun delete(permissionId: PermissionId) = permissions.remove(permissionId)

        fun delete(permissionId: String) = delete(PermissionId(permissionId))

        fun find(permissionId: PermissionId) = permissions.find(permissionId)

        fun find(permissionId: String) = find(PermissionId(permissionId))

        fun all(): List<Permission> = permissions.map { it }

        fun allIds(): List<PermissionId> = all().map { it.id }

    }

    object Users {

        fun add(userId: UserId) {
            users.find(userId) ?: users.add(userId)
        }

        fun add(userId: String) = add(UserId(userId))

        fun delete(userId: UserId) = users.remove(userId)

        fun delete(userId: String) = delete(UserId(userId))

        fun find(userId: UserId) = users.find(userId)

        fun find(userId: String) = find(UserId(userId))

        fun all(): List<User> = users.map { it }

        fun allIds(): List<UserId> = all().map { it.id }

        fun addGroup(userId: UserId, groupId: GroupId) {
            find(userId)?.also { it.groups.add(groupId) }
        }

        fun addGroup(userId: String, groupId: String) {
            addGroup(UserId(userId), GroupId(groupId))
        }

        fun removeGroup(userId: UserId, groupId: GroupId) {
            find(userId)?.also { it.groups.remove(groupId) }
        }

        fun removeGroup(userId: String, groupId: String) {
            removeGroup(UserId(userId), GroupId(groupId))
        }

    }

    object Groups {

        fun add(groupId: GroupId) {
            groups.find(groupId) ?: groups.add(groupId)
        }

        fun add(groupId: String) = add(GroupId(groupId))

        fun delete(groupId: GroupId) = groups.remove(groupId)

        fun delete(groupId: String) = delete(GroupId(groupId))

        fun find(groupId: GroupId) = groups.find(groupId)

        fun find(groupId: String) = find(GroupId(groupId))

        fun all(): List<Group> = groups.map { it }

        fun allIds(): List<GroupId> = all().map { it.id }

        fun addPermission(groupId: GroupId, permissionId: PermissionId) {
            find(groupId)?.also { it.permissions.add(permissionId) }
        }

        fun addPermission(groupId: String, permissionId: String) {
            addPermission(GroupId(groupId), PermissionId(permissionId))
        }

        fun removePermission(groupId: GroupId, permissionId: PermissionId) {
            find(groupId)?.also { it.permissions.remove(permissionId) }
        }

        fun removePermission(groupId: String, permissionId: String) {
            removePermission(GroupId(groupId), PermissionId(permissionId))
        }

    }
}
