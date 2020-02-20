package de.timokrates.accessgranted.repository

import de.timokrates.accessgranted.repository.Repository
import de.timokrates.accessgranted.repository.group.ListGroupRepository
import de.timokrates.accessgranted.repository.permissions.ListPermissionRepository
import de.timokrates.accessgranted.repository.token.ListTokenRepository
import de.timokrates.accessgranted.repository.user.ListUserRepository

class ServiceRepository : Repository {
    override val tokens by lazy { ListTokenRepository() }
    override val users by lazy { ListUserRepository() }
    override val groups by lazy { ListGroupRepository() }
    override val permissions by lazy { ListPermissionRepository() }
}
