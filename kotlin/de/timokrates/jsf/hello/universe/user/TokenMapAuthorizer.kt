package de.timokrates.jsf.hello.universe.user

class TokenMapAuthorizer(private val tokens: List<Token>) : Authorizer {
    override fun invoke(token: Token): Boolean = tokens.any { it == token }
}