package de.timokrates.accessgranted

import de.timokrates.accessgranted.group.ListGroupRepository
import de.timokrates.accessgranted.permissions.ListPermissionRepository
import de.timokrates.accessgranted.token.ListTokenRepository
import de.timokrates.accessgranted.user.ListUserRepository

class ServiceRepository {
    val tokens by lazy { ListTokenRepository() }
    val users by lazy { ListUserRepository() }
    val groups by lazy { ListGroupRepository() }
    val permissions by lazy { ListPermissionRepository() }
}