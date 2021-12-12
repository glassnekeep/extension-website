package extension.website.kvision.project

import io.kvision.core.Container
import io.kvision.html.*

fun Container.browser() {
    section(className = "browsers-section") {
        div(className = "browsers") {
            h3("Supported browsers:")
            nav(className = "level is-mobile") {
                Browser.browsers.browserNames.forEach { icon ->
                    span(className = "icon") {
                        icon(icon)
                    }
                }
            }
        }
    }
}