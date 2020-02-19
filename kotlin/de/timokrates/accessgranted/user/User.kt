package de.timokrates.accessgranted.user

import de.timokrates.accessgranted.group.GroupId

data class User internal constructor(val id: UserId, val groups: MutableList<GroupId>)
