package de.timokrates.accessgranted.service

import amber.collections.sync
import amber.sync.Synchronized
import de.timokrates.accessgranted.repository.token.Token
import de.timokrates.accessgranted.repository.token.TokenId
import de.timokrates.accessgranted.repository.token.TokenRepository

class ListTokenRepository(
        tokens: MutableList<Token> = mutableListOf()
) : TokenRepository, Synchronized by Synchronized() {

    private val tokens: MutableList<Token> = tokens.sync(this)

    override fun add(id: TokenId): Token = Token(
            id
    ).also { tokens.add(it) }

    override fun find(id: TokenId): Token? = tokens.find { it.id == id }

    override fun remove(id: TokenId): Token? = find(id).also { tokens.remove(it) }

    override fun iterator() = tokens.iterator()
}
