package de.timokrates.accessgranted

import de.timokrates.accessgranted.group.ListGroupRepository
import de.timokrates.accessgranted.permissions.ListPermissionRepository
import de.timokrates.accessgranted.token.ListTokenRepository
import de.timokrates.accessgranted.user.ListUserRepository

class ServiceRepository : Repository {
    override val tokens by lazy { ListTokenRepository() }
    override val users by lazy { ListUserRepository() }
    override val groups by lazy { ListGroupRepository() }
    override val permissions by lazy { ListPermissionRepository() }
}
