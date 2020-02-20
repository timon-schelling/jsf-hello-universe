package de.timokrates.accessgranted.repository

import de.timokrates.accessgranted.repository.group.GroupRepository
import de.timokrates.accessgranted.repository.permissions.PermissionRepository
import de.timokrates.accessgranted.repository.token.TokenRepository
import de.timokrates.accessgranted.repository.user.UserRepository

interface Repository {
    val tokens: TokenRepository
    val users: UserRepository
    val groups: GroupRepository
    val permissions: PermissionRepository
}
