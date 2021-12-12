package extension.website.kvision.project

import io.kvision.core.Container
import io.kvision.core.Display
import io.kvision.core.onClick
import io.kvision.html.*
import io.kvision.utils.auto
import io.kvision.utils.px
import org.w3c.dom.css.CSSMarginRule

fun Container.video() {
    section(className = "video-container") {
        marginTop = 50.px
        marginBottom = 50.px
        div(className = "slider-name") {
            link("") {
                setAttribute("name", "setup-guide")
            }
            h2("How to set up the extension")
        }
        div(className = "wrapper-video") {
            link("") {
                setAttribute("name", "setup")
            }
            iframe {
                title = "Youtube video player"
                display = Display.BLOCK
                width = 980.px
                height = 560.px
                src = "https://www.youtube.com/embed/-OzlrVn4YbI?rel=0&iv_load_policy=3"
                setAttribute("franeborder", "0")
                setAttribute("allowfullscreen", "")
            }
        }
    }
}