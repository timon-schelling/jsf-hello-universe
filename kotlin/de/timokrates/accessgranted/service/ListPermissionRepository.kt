package de.timokrates.accessgranted.service

import amber.collections.sync
import amber.sync.Synchronized
import de.timokrates.accessgranted.repository.permissions.Permission
import de.timokrates.accessgranted.repository.permissions.PermissionId
import de.timokrates.accessgranted.repository.permissions.PermissionRepository

class ListPermissionRepository(
        permissions: MutableList<Permission> = mutableListOf()
) : PermissionRepository, Synchronized by Synchronized() {

    private val permissions: MutableList<Permission> = permissions.sync(this)

    override fun add(permissionId: PermissionId): Permission = Permission(
            permissionId
    ).also { permissions.add(it) }

    override fun remove(permissionId: PermissionId): Permission? = find(permissionId).also { permissions.remove(it) }

    override fun find(permissionId: PermissionId): Permission? = permissions.find { it.id == permissionId }

    override fun iterator() = permissions.iterator()
}
