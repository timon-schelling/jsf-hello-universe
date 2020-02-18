package de.timokrates.jsf.hello.universe.user

interface UserRepository {
    fun add(user: User)
    fun put(userId: UserId): User
    fun remove(user: User)
    fun remove(userId: UserId): User
    fun find(userId: UserId): User
}