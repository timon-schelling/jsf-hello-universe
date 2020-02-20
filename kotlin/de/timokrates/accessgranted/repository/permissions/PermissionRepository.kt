package de.timokrates.accessgranted.repository.permissions

interface PermissionRepository : Iterable<Permission> {
    fun add(permissionId: PermissionId): Permission
    fun remove(permissionId: PermissionId): Permission?
    fun find(permissionId: PermissionId): Permission?
}
