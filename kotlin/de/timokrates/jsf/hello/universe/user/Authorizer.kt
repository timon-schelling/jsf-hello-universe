package de.timokrates.jsf.hello.universe.user

interface Authorizer {
    operator fun invoke(token: Token): Boolean
}
