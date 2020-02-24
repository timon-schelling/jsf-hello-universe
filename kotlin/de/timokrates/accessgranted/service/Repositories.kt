package de.timokrates.accessgranted.service

import de.timokrates.accessgranted.repository.group.GroupRepository
import de.timokrates.accessgranted.repository.permissions.PermissionRepository
import de.timokrates.accessgranted.repository.token.TokenRepository
import de.timokrates.accessgranted.repository.user.UserRepository

interface Repositories {
    val tokens: TokenRepository
    val users: UserRepository
    val groups: GroupRepository
    val permissions: PermissionRepository
}
