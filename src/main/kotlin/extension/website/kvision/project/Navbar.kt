package extension.website.kvision.project

import io.kvision.core.Container
import io.kvision.core.style
import io.kvision.html.*
import io.kvision.utils.px

fun Container.navbar(primary: Boolean = true) {
    nav(className = "navbar is-fresh is-transparent") {
        if (primary) {
            addCssClass("no-shadow")
        } else {
            id = "navbar-clone"
        }
        role = "navigation"
        setAttribute("aria-label", "main navigation")
        div(className = "container") {
            div(className = "navbar-brand") {
                link(Navbar.title, "#", className = "navbar-item is-secondary")
                link("", className = "navbar-burger") {
                    role = "button"
                    setAttribute("aria-label", "menu")
                    setAttribute("aria-expanded", "false")
                    if (primary) {
                        setAttribute("data-target", "navbar-menu")
                    } else {
                        setAttribute("data-target", "cloned-navbar-menu")
                    }
                    span {
                        setAttribute("aria-hidden", "true")
                    }
                    span {
                        setAttribute("aria-hidden", "true")
                    }
                    span {
                        setAttribute("aria-hidden", "true")
                    }
                }
            }
            div(className = "navbar-menu") {
                if (primary) {
                    id = "navbar-menu"
                    addCssClass("is-static")
                } else {
                    id = "cloned-navbar-menu"
                    addCssClass("is-fixed")
                }
                div(className = "navbar-end") {
                    Navbar.menu.forEach { (url, label) ->
                        link(label, "#$url", className = "navbar-item is-secondary")
                    }
                    div {
                        marginTop = 15.px
                        marginLeft = 180.px
                        link("Star", "https://github.com/glassnekeep/extension_for_home.mephi/", className = "github-button") {
                            setAttribute("data-icon", "octicon-star")
                            setAttribute("data-size", "large")
                            setAttribute("data-show-count", "true")
                            setAttribute("aria-label", Navbar.starLabel)
                        }
                    }
                }
            }
        }
    }
}