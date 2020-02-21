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

    override fun add(id: PermissionId): Permission = Permission(id).also { permissions.add(it) }

    override fun remove(id: PermissionId): Permission? = find(id).also { permissions.remove(it) }

    override fun find(id: PermissionId): Permission? = permissions.find { it.id == id }

    override fun iterator() = permissions.iterator()
}
