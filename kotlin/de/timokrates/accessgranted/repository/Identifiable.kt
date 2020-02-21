package de.timokrates.accessgranted.repository

interface Identifiable<I : Id> {
    val id: I
}
