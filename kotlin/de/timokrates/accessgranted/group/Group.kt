package de.timokrates.accessgranted.group

import de.timokrates.accessgranted.permissions.PermissionId

class Group internal constructor(val id: GroupId, val permissions: MutableList<PermissionId>)
