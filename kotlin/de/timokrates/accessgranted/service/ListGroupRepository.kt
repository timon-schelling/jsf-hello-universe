package de.timokrates.accessgranted.service

import amber.collections.sync
import amber.sync.Synchronized
import de.timokrates.accessgranted.repository.group.Group
import de.timokrates.accessgranted.repository.group.GroupId
import de.timokrates.accessgranted.repository.group.GroupRepository

class ListGroupRepository(
        groups: MutableList<Group> = mutableListOf()
) : GroupRepository, Synchronized by Synchronized() {

    private val groups: MutableList<Group> = groups.sync(this)

    override fun add(groupId: GroupId): Group = Group(
            groupId,
            mutableListOf()
    ).also { groups.add(it) }

    override fun remove(groupId: GroupId): Group? = find(groupId).also { groups.remove(it) }

    override fun find(groupId: GroupId): Group? = groups.find { it.id == groupId }

    override fun iterator() = groups.iterator()
}
