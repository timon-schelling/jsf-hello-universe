package de.timokrates.accessgranted

import de.timokrates.accessgranted.token.TokenId
import io.kotlintest.matchers.boolean.shouldBeTrue
import io.kotlintest.specs.AnnotationSpec

class IdTest : AnnotationSpec() {

    @Test
    fun `equal`() {
        val tokenId1 = TokenId("123456")
        val tokenId2 = TokenId("123456")

        (tokenId1 !== tokenId2).shouldBeTrue()

        (tokenId1 == tokenId2).shouldBeTrue()
    }
}
