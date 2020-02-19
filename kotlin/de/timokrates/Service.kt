package de.timokrates

import de.timokrates.accessgranted.permissions.Permission
import de.timokrates.accessgranted.permissions.PermissionId
import de.timokrates.accessgranted.randomAlphanumericString

object Service {

    init {
        //todo load json into repos

        //todo remove after implementing json loading
        repeat(100) {
            IHateGlobalState.permissions.add(PermissionId(randomAlphanumericString(64)))
        }
    }

    fun allPermissions(): List<Permission> = IHateGlobalState.permissions.map { it }
    fun allPermissionIds(): List<PermissionId> = allPermissions().map { it.id }
}
