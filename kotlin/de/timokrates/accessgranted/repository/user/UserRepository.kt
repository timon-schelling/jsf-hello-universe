package de.timokrates.accessgranted.repository.user

import de.timokrates.accessgranted.repository.group.GroupId

interface UserRepository : Iterable<User> {
    fun add(userId: UserId, groups: List<GroupId>): User
    fun add(userId: UserId): User
    fun remove(userId: UserId): User?
    fun find(userId: UserId): User?
}
