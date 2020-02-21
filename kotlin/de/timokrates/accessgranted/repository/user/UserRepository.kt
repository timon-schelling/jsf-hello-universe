package de.timokrates.accessgranted.repository.user

import de.timokrates.accessgranted.repository.IdRepository
import de.timokrates.accessgranted.repository.group.GroupId

interface UserRepository : IdRepository<UserId, User> {
    fun add(userId: UserId, groups: List<GroupId>): User
    override fun add(id: UserId): User
    override fun remove(id: UserId): User?
    override fun find(id: UserId): User?
}
