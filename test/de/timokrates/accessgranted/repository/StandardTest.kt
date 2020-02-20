package de.timokrates.accessgranted.repository

import de.timokrates.accessgranted.repository.randomAlphanumericString
import io.kotlintest.matchers.boolean.shouldBeTrue
import io.kotlintest.matchers.string.shouldHaveLength
import io.kotlintest.specs.AnnotationSpec

class StandardTest : AnnotationSpec() {

    @Test
    fun `generate random alphanumeric string`() {
        val str1 = randomAlphanumericString(16)
        str1.shouldHaveLength(16)
        val str2 = randomAlphanumericString(256)
        str2.shouldHaveLength(256)
        (str1 !== str2).shouldBeTrue()
    }
}
