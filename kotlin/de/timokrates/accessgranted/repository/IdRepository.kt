package de.timokrates.accessgranted.repository

interface IdRepository<I : Id, T> : Iterable<T> {
    fun add(id: I): T
    fun remove(id: I): T?
    fun find(id: I): T?
}
