package de.timokrates.accessgranted.token

class ListTokenRepository(private val tokens: MutableList<Token> = mutableListOf()) : TokenRepository {

    override fun add(tokenId: TokenId): Token = Token(tokenId).also { tokens.add(it) }

    override fun find(tokenId: TokenId): Token? = tokens.find { it.id == tokenId }

    override fun remove(tokenId: TokenId): Token? = find(tokenId).also { tokens.remove(it) }

    override fun iterator() = tokens.iterator()
}
