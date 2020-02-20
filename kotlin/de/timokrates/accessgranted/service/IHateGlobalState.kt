package de.timokrates.accessgranted.service

import de.timokrates.accessgranted.repository.Repository
import de.timokrates.accessgranted.repository.ServiceRepository

object IHateGlobalState : Repository by ServiceRepository()
