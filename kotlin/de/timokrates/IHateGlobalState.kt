package de.timokrates

import de.timokrates.accessgranted.Repository
import de.timokrates.accessgranted.ServiceRepository

object IHateGlobalState : Repository by ServiceRepository()
