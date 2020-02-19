package de.timokrates.accessgranted.group

interface GroupRepository : Iterable<Group> {
    fun add(groupId: GroupId): Group
    fun remove(groupId: GroupId): Group?
    fun find(groupId: GroupId): Group?
}
