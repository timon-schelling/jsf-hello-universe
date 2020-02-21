package de.timokrates.accessgranted.repository

import de.timokrates.accessgranted.repository.group.GroupId
import de.timokrates.accessgranted.repository.permissions.PermissionId
import de.timokrates.accessgranted.repository.token.TokenId
import de.timokrates.accessgranted.repository.user.UserId
import io.kotlintest.matchers.boolean.shouldBeTrue
import io.kotlintest.specs.AnnotationSpec

class IdTest : AnnotationSpec() {

    @Test
    fun `INT - TokenId`() {
        val tokenId1 = TokenId("123456")
        val tokenId2 = TokenId("123456")

        (tokenId1 !== tokenId2).shouldBeTrue()

        (tokenId1 == tokenId2).shouldBeTrue()
    }

    @Test
    fun `INT - GroupId`() {
        val groupId1 = GroupId("123456")
        val groupId2 = GroupId("123456")

        (groupId1 !== groupId2).shouldBeTrue()

        (groupId1 == groupId2).shouldBeTrue()
    }

    @Test
    fun `INT - UserId`() {
        val userId1 = UserId("123456")
        val userId2 = UserId("123456")

        (userId1 !== userId2).shouldBeTrue()

        (userId1 == userId2).shouldBeTrue()
    }

    @Test
    fun `INT - PermissionId`() {
        val permissionId1 = PermissionId("123456")
        val permissionId2 = PermissionId("123456")

        (permissionId1 !== permissionId2).shouldBeTrue()

        (permissionId1 == permissionId2).shouldBeTrue()
    }
}
