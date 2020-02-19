package de.timokrates.accessgranted.user

import de.timokrates.accessgranted.group.GroupId
import de.timokrates.accessgranted.token.TokenRepository

class ListUserRepository(private val users: MutableList<User> = mutableListOf()) : UserRepository {

    override fun add(userId: UserId, groups: List<GroupId>): User {
        return User(userId, groups.toMutableList()).also { users.add(it) }
    }

    override fun add(userId: UserId) = add(userId, mutableListOf())

    override fun remove(userId: UserId): User? = find(userId).also { users.remove(it) }

    override fun find(userId: UserId): User? = users.find { it.id == userId }

    override fun iterator() = users.iterator()
}
