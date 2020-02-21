package de.timokrates.accessgranted.repository.group

import de.timokrates.accessgranted.repository.IdRepository

interface GroupRepository : IdRepository<GroupId, Group> {
    override fun add(id: GroupId): Group
    override fun remove(id: GroupId): Group?
    override fun find(id: GroupId): Group?
}
