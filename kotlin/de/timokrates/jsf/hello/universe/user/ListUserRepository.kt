package de.timokrates.jsf.hello.universe.user

class ListUserRepository(private val users: MutableList<User> = mutableListOf()) : UserRepository {
    override fun add(user: User) = users.add(user)

    override fun add(userId: UserId): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun remove(user: User) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun remove(userId: UserId): User {

        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun find(userId: UserId): User {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

}
