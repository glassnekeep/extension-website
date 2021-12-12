package extension.website.kvision.project

import io.kvision.core.Container
import io.kvision.html.*
import io.kvision.utils.px

fun Container.footer() {
    footer(className = "footer footer-dark") {
        div(className = "container") {
            div(className = "columns") {
                Footer.columns.forEach {
                    column(it)
                }
                div(className = "column") {
                    div(className = "footer-column") {
                        div(className = "footer-header") {
                            h3(Footer.contactUs.title)
                            nav(className = "level is-mobile") {
                                div(className = "level-left") {
                                    Footer.contactUs.links.forEach { (url, icon) ->
                                        link("", url, className = "level-item") {
                                            marginRight = 25.px
                                            span(className = "icon") {
                                                icon(icon)
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
    }
}

fun Container.column(footerColumn: FooterColumn) {
    div(className = "column") {
        div(className = "footer-column") {
            div(className = "footer-header") {
                h3(footerColumn.title)
            }
            ul(className = "link-list") {
                footerColumn.links.forEach { (url, title) ->
                    li(className = "contact-li") {
                        link(title, url)
                    }
                }
            }
            link("") {
                setAttribute("name", "contacts")
            }
        }
    }
}
