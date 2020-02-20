package de.timokrates.accessgranted.repository.permissions

class ListPermissionRepository(
        private val permissions: MutableList<Permission> = mutableListOf()
) : PermissionRepository {

    override fun add(permissionId: PermissionId): Permission = Permission(permissionId).also { permissions.add(it) }

    override fun remove(permissionId: PermissionId): Permission? = find(permissionId).also { permissions.remove(it) }

    override fun find(permissionId: PermissionId): Permission? = permissions.find { it.id == permissionId }

    override fun iterator() = permissions.iterator()
}
