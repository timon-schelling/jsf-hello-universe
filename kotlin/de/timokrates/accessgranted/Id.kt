package de.timokrates.accessgranted

open class Id(private val value: String) {
    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other == null) return false
        if (other !is Id) return false
        return value == other.value
    }

    override fun hashCode() = value.hashCode()

    override fun toString() = value
}
