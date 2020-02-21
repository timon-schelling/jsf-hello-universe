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

    override fun add(id: GroupId): Group = Group(id, mutableListOf()).also { groups.add(it) }

    override fun remove(id: GroupId): Group? = find(id).also { groups.remove(it) }

    override fun find(id: GroupId): Group? = groups.find { it.id == id }

    override fun iterator() = groups.iterator()
}
