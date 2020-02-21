package de.timokrates.accessgranted.service

import de.timokrates.accessgranted.repository.Repository

class ServiceRepository : Repository {
    override val tokens by lazy { ListTokenRepository() }
    override val users by lazy { ListUserRepository() }
    override val groups by lazy { ListGroupRepository() }
    override val permissions by lazy { ListPermissionRepository() }
}
