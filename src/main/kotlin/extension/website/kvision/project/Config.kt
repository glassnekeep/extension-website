package extension.website.kvision.project

object Navbar {
    val title = "Friendly home.mephi"
    val menu =
        mapOf("features" to "Features", "setup" to "Set Up", "contacts" to "Contacts")
    val starLabel = "Star glassnekeep/extension_for_home.mephi on GitHub"
}

object Hero {
    val version = "1.0.0"
    val releasesUrl = "https://github.com/glassnekeep/extension_for_home.mephi/releases/tag/production-ready"

    @Suppress("UnsafeCastFromDynamic")
    val logo: String = io.kvision.require("logos/mifi_logo.png")
    val logoAlt = "Mephi logo"
    val title = "\"Friendly home mephi\" - расширение для home.mephi.ru"
    val subtitle =
        "Build modern web applications with the full power of the Kotlin language. Choose **yourself** the preferred way."
    val buttonText = "Download"
    val buttonLink = "extension_for_home.mephi.rar"
}

object Images {
    @Suppress("UnsafeCastFromDynamic")
    val letter: String = io.kvision.require("logos/letter.jpg")
    @Suppress("UnsafeCastFromDynamic")
    val filter: String = io.kvision.require("logos/filter.jpg")
    @Suppress("UnsafeCastFromDynamic")
    val table: String = io.kvision.require("logos/table.jpg")
    @Suppress("UnsafeCastFromDynamic")
    val functionality: String = io.kvision.require("logos/functions.jpg")
}

data class FooterColumn(val title: String, val links: Map<String, String>)

data class BrowserLine(val title: String, val browserNames: List<String>)

object Footer {
    val logo: String = io.kvision.require("logos/extension_logo.png")
    val columns =
        listOf(
            FooterColumn(
                "Created by",
                mapOf(
                    "https://vk.com/glassnekeep" to "Legkodukh Kirill",
                    "https://vk.com/kondratmsk" to "Kondrashkin Andrey",
                )
            ),
        )
    val contactUs = FooterColumn(
        "Contact Us",
        mapOf(
            "https://github.com/glassnekeep/extension_for_home.mephi" to "fa fa-github fa-2x",
            "mailto: glassnekeep@yandex.ru" to "fa fa-email fa-2x",
        )
    )
}

object Browser {
    val browsers = BrowserLine(
        "Supported Browsers",
        listOf(
            "fa fa-chrome fa-2x",
            "fa fa-firefox fa-2x",
            "fa fa-edge fa-2x"
        )
    )
}
