package de.timokrates.jsf.hello.universe.user

open class Id(private val value: String) : Comparable<String> by value, CharSequence by value {
    override fun equals(other: Any?): Boolean {
        if (other === this) return true
        if (other == null) return false
        if (other !is Id) return false
        return value == other.value
    }

    override fun hashCode() = value.hashCode()
}
