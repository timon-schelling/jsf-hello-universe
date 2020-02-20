package de.timokrates.accessgranted.repository.user

import de.timokrates.accessgranted.repository.group.GroupId

data class User internal constructor(val id: UserId, val groups: MutableList<GroupId>)
