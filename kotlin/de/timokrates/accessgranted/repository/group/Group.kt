package de.timokrates.accessgranted.repository.group

import de.timokrates.accessgranted.repository.permissions.PermissionId

class Group internal constructor(val id: GroupId, val permissions: MutableList<PermissionId>)
