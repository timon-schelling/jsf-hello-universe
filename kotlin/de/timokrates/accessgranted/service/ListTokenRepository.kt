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

    override fun add(tokenId: TokenId): Token = Token(
            tokenId
    ).also { tokens.add(it) }

    override fun find(tokenId: TokenId): Token? = tokens.find { it.id == tokenId }

    override fun remove(tokenId: TokenId): Token? = find(tokenId).also { tokens.remove(it) }

    override fun iterator() = tokens.iterator()
}
