package de.timokrates.accessgranted.repository.token

import de.timokrates.accessgranted.repository.IdRepository

interface TokenRepository : IdRepository<TokenId, Token> {
    override fun add(id: TokenId): Token
    override fun remove(id: TokenId): Token?
    override fun find(id: TokenId): Token?
}
