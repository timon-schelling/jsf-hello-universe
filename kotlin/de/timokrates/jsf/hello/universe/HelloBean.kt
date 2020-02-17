@file:JvmName("HelloBean")
package de.timokrates.jsf.hello.universe

import java.io.Serializable
import javax.faces.bean.ManagedBean
import javax.faces.bean.SessionScoped

@ManagedBean
@SessionScoped
class HelloBean : Serializable {

    var name: String? = null

    companion object {
        private const val serialVersionUID = 1L
    }
}