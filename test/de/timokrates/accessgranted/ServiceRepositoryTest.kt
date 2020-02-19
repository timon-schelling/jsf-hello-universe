package de.timokrates.accessgranted

import de.timokrates.accessgranted.group.GroupId
import de.timokrates.accessgranted.permissions.PermissionId
import de.timokrates.accessgranted.token.TokenId
import de.timokrates.accessgranted.user.UserId
import io.kotlintest.IsolationMode
import io.kotlintest.TestCaseOrder
import io.kotlintest.matchers.collections.shouldHaveSize
import io.kotlintest.matchers.types.shouldBeNull
import io.kotlintest.matchers.types.shouldBeSameInstanceAs
import io.kotlintest.specs.AnnotationSpec

class ServiceRepositoryTest : AnnotationSpec() {

    override fun isolationMode() = IsolationMode.InstancePerTest

    private val serviceRepository: ServiceRepository = ServiceRepository()

    @Test
    fun `add user`() {
        val userId = UserId(randomAlphanumericString(64))
        val user = serviceRepository.users.add(userId)
        user.id shouldBeSameInstanceAs userId
        serviceRepository.users.find(userId) shouldBeSameInstanceAs user
    }

    @Test
    fun `add user with groups`() {
        val userId = UserId(randomAlphanumericString(64))
        val groupIds = mutableListOf<GroupId>().apply {
            repeat(10) {
                var groupId = GroupId(randomAlphanumericString(64))
                while (contains(groupId)) {
                    groupId = GroupId(randomAlphanumericString(64))
                }
                add(groupId)
            }
        }
        val user = serviceRepository.users.add(userId, groupIds)
        user.id shouldBeSameInstanceAs userId
        serviceRepository.users.find(userId) shouldBeSameInstanceAs user
        serviceRepository.users.find(userId)!!.groups.shouldHaveSize(10)
        serviceRepository.users.find(userId)!!.groups.forEach {
            groupIds.remove(it)
        }
        groupIds.shouldHaveSize(0)
    }

    @Test
    fun `remove user`() {
        val userId = UserId(randomAlphanumericString(64))
        val user = serviceRepository.users.add(userId)
        val removedUser = serviceRepository.users.remove(userId)
        removedUser shouldBeSameInstanceAs user
        serviceRepository.users.find(userId).shouldBeNull()
    }

    @Test
    fun `find user`() {
        val userId = UserId(randomAlphanumericString(64))
        val user = serviceRepository.users.add(userId)
        serviceRepository.users.find(userId) shouldBeSameInstanceAs user
        serviceRepository.users.remove(userId)
        serviceRepository.users.find(userId).shouldBeNull()
    }

    @Test
    fun `iterate users`() {
        val userIds = mutableListOf<UserId>()
        repeat(10) {
            var userId = UserId(randomAlphanumericString(64))
            while (serviceRepository.users.find(userId) != null) {
                userId = UserId(randomAlphanumericString(64))
            }
            serviceRepository.users.add(userId)
            userIds.add(userId)
        }
        serviceRepository.users.map { it }.shouldHaveSize(10)
        serviceRepository.users.forEach {
            userIds.remove(it.id)
        }
        userIds.shouldHaveSize(0)
    }

    @Test
    fun `add group`() {
        val groupId = GroupId(randomAlphanumericString(64))
        val group = serviceRepository.groups.add(groupId)
        group.id shouldBeSameInstanceAs groupId
        serviceRepository.groups.find(groupId) shouldBeSameInstanceAs group
    }

    @Test
    fun `remove group`() {
        val groupId = GroupId(randomAlphanumericString(64))
        val group = serviceRepository.groups.add(groupId)
        val removedGroup = serviceRepository.groups.remove(groupId)
        removedGroup shouldBeSameInstanceAs group
        serviceRepository.groups.find(groupId).shouldBeNull()
    }

    @Test
    fun `find group`() {
        val groupId = GroupId(randomAlphanumericString(64))
        val group = serviceRepository.groups.add(groupId)
        serviceRepository.groups.find(groupId) shouldBeSameInstanceAs group
        serviceRepository.groups.remove(groupId)
        serviceRepository.groups.find(groupId).shouldBeNull()
    }

    @Test
    fun `iterate groups`() {
        val groupIds = mutableListOf<GroupId>()
        repeat(10) {
            var groupId = GroupId(randomAlphanumericString(64))
            while (serviceRepository.groups.find(groupId) != null) {
                groupId = GroupId(randomAlphanumericString(64))
            }
            serviceRepository.groups.add(groupId)
            groupIds.add(groupId)
        }
        serviceRepository.groups.map { it }.shouldHaveSize(10)
        serviceRepository.groups.forEach {
            groupIds.remove(it.id)
        }
        groupIds.shouldHaveSize(0)
    }

    @Test
    fun `add permission`() {
        val permissionId = PermissionId(randomAlphanumericString(64))
        val permission = serviceRepository.permissions.add(permissionId)
        permission.id shouldBeSameInstanceAs permissionId
        serviceRepository.permissions.find(permissionId) shouldBeSameInstanceAs permission
    }

    @Test
    fun `remove permission`() {
        val permissionId = PermissionId(randomAlphanumericString(64))
        val permission = serviceRepository.permissions.add(permissionId)
        val removedPermission = serviceRepository.permissions.remove(permissionId)
        removedPermission shouldBeSameInstanceAs permission
        serviceRepository.permissions.find(permissionId).shouldBeNull()
    }

    @Test
    fun `find permission`() {
        val permissionId = PermissionId(randomAlphanumericString(64))
        val permission = serviceRepository.permissions.add(permissionId)
        serviceRepository.permissions.find(permissionId) shouldBeSameInstanceAs permission
        serviceRepository.permissions.remove(permissionId)
        serviceRepository.permissions.find(permissionId).shouldBeNull()
    }

    @Test
    fun `iterate permissions`() {
        val permissionIds = mutableListOf<PermissionId>()
        repeat(10) {
            var permissionId = PermissionId(randomAlphanumericString(64))
            while (serviceRepository.permissions.find(permissionId) != null) {
                permissionId = PermissionId(randomAlphanumericString(64))
            }
            serviceRepository.permissions.add(permissionId)
            permissionIds.add(permissionId)
        }
        serviceRepository.permissions.map { it }.shouldHaveSize(10)
        serviceRepository.permissions.forEach {
            permissionIds.remove(it.id)
        }
        permissionIds.shouldHaveSize(0)
    }

    @Test
    fun `add token`() {
        val tokenId = TokenId(randomAlphanumericString(64))
        val token = serviceRepository.tokens.add(tokenId)
        token.id shouldBeSameInstanceAs tokenId
        serviceRepository.tokens.find(tokenId) shouldBeSameInstanceAs token
    }

    @Test
    fun `remove token`() {
        val tokenId = TokenId(randomAlphanumericString(64))
        val token = serviceRepository.tokens.add(tokenId)
        val removedToken = serviceRepository.tokens.remove(tokenId)
        removedToken shouldBeSameInstanceAs token
        serviceRepository.tokens.find(tokenId).shouldBeNull()
    }

    @Test
    fun `find token`() {
        val tokenId = TokenId(randomAlphanumericString(64))
        val token = serviceRepository.tokens.add(tokenId)
        serviceRepository.tokens.find(tokenId) shouldBeSameInstanceAs token
        serviceRepository.tokens.remove(tokenId)
        serviceRepository.tokens.find(tokenId).shouldBeNull()
    }

    @Test
    fun `iterate tokens`() {
        val tokenIds = mutableListOf<TokenId>()
        repeat(10) {
            var tokenId = TokenId(randomAlphanumericString(64))
            while (serviceRepository.tokens.find(tokenId) != null) {
                tokenId = TokenId(randomAlphanumericString(64))
            }
            serviceRepository.tokens.add(tokenId)
            tokenIds.add(tokenId)
        }
        serviceRepository.tokens.map { it }.shouldHaveSize(10)
        serviceRepository.tokens.forEach {
            tokenIds.remove(it.id)
        }
        tokenIds.shouldHaveSize(0)
    }
}
