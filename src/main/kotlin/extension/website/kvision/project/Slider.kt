package extension.website.kvision.project

import io.kvision.core.Container
import io.kvision.core.style
import io.kvision.form.check.Radio
import io.kvision.form.check.radio
import io.kvision.form.check.radioInput
import io.kvision.html.*

fun Container.slider() {
    section {
        div(className = "slider-name") {
            link("") {
                setAttribute("name", "features")
            }
            h2("Features")
        }
        id = "slider_bl"
        div(className = "wrapper") {
            radioInput(value = true) {
                id = "slide1"
                name = "slider"
            }
            radioInput {
                id = "slide2"
                name = "slider"
            }
            radioInput {
                id = "slide3"
                name = "slider"
            }
            radioInput {
                id = "slide4"
                name = "slider"
            }
            div(className = "slider-wrapper") {
                div(className = "inner") {
                    article {
                        div(className = "info bottom-right") {
                            h4("Функции")
                        }
                        image(Images.functionality)
                    }
                    article {
                        div(className = "info bottom-right") {
                            h4("Фильтр")
                        }
                        image(Images.filter)
                    }
                    article {
                        div(className = "info bottom-right") {
                            h4("Письмо")
                        }
                        image(Images.letter)
                    }
                    article {
                        div(className = "info bottom-right") {
                            h4("Таблица")
                        }
                        image(Images.table)
                    }
                }
            }
            div(className = "slider-prev-next-control") {
                label(forId = "slide1")
                label(forId = "slide2")
                label(forId = "slide3")
                label(forId = "slide4")
            }
            div(className = "slider-dot-control") {
                label(forId = "slide1")
                label(forId = "slide2")
                label(forId = "slide3")
                label(forId = "slide4")
            }
        }
    }
}