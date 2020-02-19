package de.timokrates.accessgranted.user

import de.timokrates.accessgranted.group.GroupId

data class User(val id: UserId, val groups: MutableList<GroupId>)
