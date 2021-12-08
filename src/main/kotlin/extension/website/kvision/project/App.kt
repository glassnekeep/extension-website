package extension.website.kvision.project

import io.kvision.*
import io.kvision.panel.root

class App : Application() {

    init {
        require("css/style.css")
    }

    override fun start() {
        root("kvapp") {
            hero()
            slider()
            footer()
        }
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
