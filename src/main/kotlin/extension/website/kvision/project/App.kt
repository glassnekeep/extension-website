package extension.website.kvision.project

import io.kvision.*
import io.kvision.html.div
import io.kvision.panel.root
import kotlinx.browser.window

class App : Application() {

    init {
        require("css/style.css")
    }

    override fun start() {
        root("kvapp") {
            hero()
            browser()
            slider()
            video()
            footer()
            div {
                addAfterInsertHook {
                    SmoothScroll("a[href*=\"#\"]")
                }
            }
        }
        window.onload = { onLoad() }
    }

    override fun dispose(): Map<String, Any> {
        return mapOf()
    }
}

fun main() {
    startApplication(
        ::App,
        module.hot,
        BootstrapModule,
        BootstrapCssModule,
        CoreModule
    )
}
