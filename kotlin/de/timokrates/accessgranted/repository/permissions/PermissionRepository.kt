package de.timokrates.accessgranted.repository.permissions

import de.timokrates.accessgranted.repository.IdRepository

interface PermissionRepository : IdRepository<PermissionId, Permission> {
    override fun add(id: PermissionId): Permission
    override fun remove(id: PermissionId): Permission?
    override fun find(id: PermissionId): Permission?
}
