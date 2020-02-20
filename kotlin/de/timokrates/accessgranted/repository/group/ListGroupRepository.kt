package de.timokrates.accessgranted.repository.group

class ListGroupRepository(
        private val groups: MutableList<Group> = mutableListOf()
) : GroupRepository {

    override fun add(groupId: GroupId): Group = Group(groupId, mutableListOf()).also { groups.add(it) }

    override fun remove(groupId: GroupId): Group? = find(groupId).also { groups.remove(it) }

    override fun find(groupId: GroupId): Group? = groups.find { it.id == groupId }

    override fun iterator() = groups.iterator()
}
