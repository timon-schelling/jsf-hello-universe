package de.timokrates.jsf.hello.universe.user

class User(val id: UserId, private val token: Token, private val authorizer: Authorizer) {
    fun authorize(): Boolean = authorizer(token)
}
