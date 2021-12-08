package extension.website.kvision.project

object Navbar {
    val title = "Friendly home.mephi"
    val menu =
        mapOf("download" to "Download", "features" to "Features", "source code" to "Source code")
    val starLabel = "Star glassnekeep/extension_for_home.mephi on GitHub"
}

object Hero {
    val version = "0.0.1"
    val releasesUrl = "https://github.com/glassnekeep/extension_for_home.mephi/releases/tag/v0.0.1"

    @Suppress("UnsafeCastFromDynamic")
    val logo: String = io.kvision.require("logos/extension_logo.png")
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
    val filter1: String = io.kvision.require("logos/filter1.jpg")
    @Suppress("UnsafeCastFromDynamic")
    val functionality: String = io.kvision.require("logos/functionality.jpg")
}

data class FooterColumn(val title: String, val links: Map<String, String>)

object Footer {
    val logo: String = io.kvision.require("logos/extension_logo.png")
    val columns =
        listOf(
            FooterColumn(
                "Created by",
                mapOf(
                    "https://github.com/glassnekeep" to "Legkodukh Kirill",
                    "https://github.com/marsek4" to "Kondrashkin Andrey",
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
