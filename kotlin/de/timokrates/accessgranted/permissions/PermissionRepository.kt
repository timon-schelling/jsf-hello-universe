package de.timokrates.accessgranted.permissions

interface PermissionRepository : Iterable<Permission> {
    fun add(permissionId: PermissionId): Permission
    fun remove(permissionId: PermissionId): Permission?
    fun find(permissionId: PermissionId): Permission?
}
