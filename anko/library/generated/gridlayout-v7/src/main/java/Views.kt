@file:JvmName("GridlayoutV7ViewsKt")
package org.jetbrains.anko.gridlayout.v7

import android.app.Activity
import android.content.Context
import android.view.ViewManager
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.custom.ankoView

@PublishedApi
internal object `$$Anko$Factories$GridlayoutV7ViewGroup` {
    val GRID_LAYOUT = { ctx: Context -> _GridLayout(ctx) }
}

inline fun ViewManager.gridLayout(): androidx.gridlayout.widget.GridLayout = gridLayout() {}
inline fun ViewManager.gridLayout(init: (@AnkoViewDslMarker _GridLayout).() -> Unit): androidx.gridlayout.widget.GridLayout {
    return ankoView(`$$Anko$Factories$GridlayoutV7ViewGroup`.GRID_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedGridLayout(theme: Int = 0): androidx.gridlayout.widget.GridLayout = themedGridLayout(theme) {}
inline fun ViewManager.themedGridLayout(theme: Int = 0, init: (@AnkoViewDslMarker _GridLayout).() -> Unit): androidx.gridlayout.widget.GridLayout {
return ankoView(`$$Anko$Factories$GridlayoutV7ViewGroup`.GRID_LAYOUT, theme) { init() }
}

inline fun Context.gridLayout(): androidx.gridlayout.widget.GridLayout = gridLayout() {}
inline fun Context.gridLayout(init: (@AnkoViewDslMarker _GridLayout).() -> Unit): androidx.gridlayout.widget.GridLayout {
    return ankoView(`$$Anko$Factories$GridlayoutV7ViewGroup`.GRID_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedGridLayout(theme: Int = 0): androidx.gridlayout.widget.GridLayout = themedGridLayout(theme) {}
inline fun Context.themedGridLayout(theme: Int = 0, init: (@AnkoViewDslMarker _GridLayout).() -> Unit): androidx.gridlayout.widget.GridLayout {
return ankoView(`$$Anko$Factories$GridlayoutV7ViewGroup`.GRID_LAYOUT, theme) { init() }
}

inline fun Activity.gridLayout(): androidx.gridlayout.widget.GridLayout = gridLayout() {}
inline fun Activity.gridLayout(init: (@AnkoViewDslMarker _GridLayout).() -> Unit): androidx.gridlayout.widget.GridLayout {
    return ankoView(`$$Anko$Factories$GridlayoutV7ViewGroup`.GRID_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedGridLayout(theme: Int = 0): androidx.gridlayout.widget.GridLayout = themedGridLayout(theme) {}
inline fun Activity.themedGridLayout(theme: Int = 0, init: (@AnkoViewDslMarker _GridLayout).() -> Unit): androidx.gridlayout.widget.GridLayout {
return ankoView(`$$Anko$Factories$GridlayoutV7ViewGroup`.GRID_LAYOUT, theme) { init() }
}

