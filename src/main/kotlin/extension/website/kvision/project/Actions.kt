package extension.website.kvision.project

import io.kvision.jquery.invoke
import io.kvision.jquery.jQuery
import io.kvision.utils.obj

fun onLoad() {
    jQuery("#status").fadeOut()
    jQuery("#preloader").delay(350).fadeOut("slow")
    @Suppress("UnsafeCastFromDynamic")
    jQuery("body").delay(350).css(obj { overflow = "visible" })
}