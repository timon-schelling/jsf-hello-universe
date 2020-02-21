package de.timokrates.accessgranted.service

import amber.collections.sync
import amber.sync.Synchronized
import de.timokrates.accessgranted.repository.group.GroupId
import de.timokrates.accessgranted.repository.user.User
import de.timokrates.accessgranted.repository.user.UserId
import de.timokrates.accessgranted.repository.user.UserRepository

class ListUserRepository(
        users: MutableList<User> = mutableListOf()
) : UserRepository, Synchronized by Synchronized() {

    private val users: MutableList<User> = users.sync(this)

    override fun add(userId: UserId, groups: List<GroupId>): User {
        return User(userId, groups.toMutableList())
                .also { users.add(it) }
    }

    override fun add(userId: UserId) = add(userId, mutableListOf())

    override fun remove(userId: UserId): User? = find(userId).also { users.remove(it) }

    override fun find(userId: UserId): User? = users.find { it.id == userId }

    override fun iterator() = users.iterator()
}
