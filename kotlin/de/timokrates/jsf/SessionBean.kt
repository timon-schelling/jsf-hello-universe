package de.timokrates.jsf

import de.timokrates.Service
import javax.faces.bean.ManagedBean
import javax.faces.bean.SessionScoped

@ManagedBean
@SessionScoped
class Bean {
    val allPermissions
        get() = Service.allPermissions()
}