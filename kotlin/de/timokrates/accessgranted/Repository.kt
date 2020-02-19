package de.timokrates.accessgranted

import de.timokrates.accessgranted.group.GroupRepository
import de.timokrates.accessgranted.permissions.PermissionRepository
import de.timokrates.accessgranted.token.TokenRepository
import de.timokrates.accessgranted.user.UserRepository

interface Repository {
    val tokens : TokenRepository
    val users : UserRepository
    val groups : GroupRepository
    val permissions : PermissionRepository
}
