package extension.website.kvision.project

import io.kvision.core.Container
import io.kvision.core.JustifyContent
import io.kvision.html.*
import io.kvision.navbar.navbar
import io.kvision.panel.hPanel
import io.kvision.utils.perc
import io.kvision.utils.px
import io.kvision.utils.rem

external var MarketplaceWidget: dynamic

fun Container.hero() {
    section(className = "hero is-default is-bold") {
        navbar()
        navbar(false)
        hPanel(justify = JustifyContent.FLEXEND, className = "container") {
            div {
                marginRight = (-1).rem
                id = "marketplace"
            }
        }
        div(className = "hero-body") {
            div(className = "container") {
                div(className = "has-text-centered") {
                    tag(TAG.FIGURE, className = "image is-96x96 is-inline-block") {
                        image(Hero.logo, Hero.logoAlt) {
                            width = 240.px
                            height = 130.px
                        }
                    }
                    h1(Hero.title, className = "title is-1 is-bold is-spaced")
                    //h2(markedInline(Hero.subtitle), rich = true, className = "subtitle is-5 is-muted")
                    h3(className = "latest-release") {
                        link("Latest release: ${Hero.version}", Hero.releasesUrl, target = "_blank")
                    }
                    p(className = "link-paragraph") {
                        link(
                            Hero.buttonText,
                            Hero.buttonLink,
                            className = "button cta is-large rounded secondary-btn raised",
                        ) {
                            setAttribute("name", "download")
                        }
                    }
                }
                div(className = "columns") {
                    /*div(className = "column is-half") {
                        tag(TAG.CODE, Hero.reactiveHello, className = "code-blocks-selector") {
                            width = 100.perc
                            setAttribute("data-highlight-only", "nocursor")
                            setAttribute("theme", "darcula")
                            setAttribute("auto-indent", "true")
                            setAttribute("mode", "kotlin")
                            setAttribute("lines", "true")
                        }
                    }
                    div(className = "column is-half") {
                        tag(TAG.CODE, Hero.imperativeHello, className = "code-blocks-selector") {
                            width = 100.perc
                            setAttribute("data-highlight-only", "nocursor")
                            setAttribute("theme", "idea")
                            setAttribute("auto-indent", "true")
                            setAttribute("mode", "kotlin")
                            setAttribute("lines", "true")
                        }
                    }*/
                }
            }
        }
    }
}
