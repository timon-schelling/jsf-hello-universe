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

    override fun add(id: UserId, groups: List<GroupId>): User {
        return User(id, groups.toMutableList())
                .also { users.add(it) }
    }

    override fun add(id: UserId) = add(id, mutableListOf())

    override fun remove(id: UserId): User? = find(id).also { users.remove(it) }

    override fun find(id: UserId): User? = users.find { it.id == id }

    override fun iterator() = users.iterator()
}
