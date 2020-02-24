package de.timokrates.accessgranted.service

class ServiceRepository : Repositories {
    override val tokens by lazy { ListTokenRepository() }
    override val users by lazy { ListUserRepository() }
    override val groups by lazy { ListGroupRepository() }
    override val permissions by lazy { ListPermissionRepository() }
}
