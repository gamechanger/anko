@file:JvmName("DesignViewsKt")
package org.jetbrains.anko.design

import android.app.Activity
import android.content.Context
import android.view.ViewManager
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.custom.ankoView

@PublishedApi
internal object `$$Anko$Factories$DesignView` {
    val FLOATING_ACTION_BUTTON = { ctx: Context -> com.google.android.material.floatingactionbutton.FloatingActionButton(ctx) }
    val NAVIGATION_VIEW = { ctx: Context -> com.google.android.material.navigation.NavigationView(ctx) }
    val TAB_ITEM = { ctx: Context -> com.google.android.material.tabs.TabItem(ctx) }
    val TEXT_INPUT_EDIT_TEXT = { ctx: Context -> com.google.android.material.textfield.TextInputEditText(ctx) }
}

inline fun ViewManager.floatingActionButton(): com.google.android.material.floatingactionbutton.FloatingActionButton = floatingActionButton() {}
inline fun ViewManager.floatingActionButton(init: (@AnkoViewDslMarker com.google.android.material.floatingactionbutton.FloatingActionButton).() -> Unit): com.google.android.material.floatingactionbutton.FloatingActionButton {
    return ankoView(`$$Anko$Factories$DesignView`.FLOATING_ACTION_BUTTON, theme = 0) { init() }
}

inline fun ViewManager.themedFloatingActionButton(theme: Int = 0): com.google.android.material.floatingactionbutton.FloatingActionButton = themedFloatingActionButton(theme) {}
inline fun ViewManager.themedFloatingActionButton(theme: Int = 0, init: (@AnkoViewDslMarker com.google.android.material.floatingactionbutton.FloatingActionButton).() -> Unit): com.google.android.material.floatingactionbutton.FloatingActionButton {
return ankoView(`$$Anko$Factories$DesignView`.FLOATING_ACTION_BUTTON, theme) { init() }
}

inline fun ViewManager.navigationView(): com.google.android.material.navigation.NavigationView = navigationView() {}
inline fun ViewManager.navigationView(init: (@AnkoViewDslMarker com.google.android.material.navigation.NavigationView).() -> Unit): com.google.android.material.navigation.NavigationView {
    return ankoView(`$$Anko$Factories$DesignView`.NAVIGATION_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedNavigationView(theme: Int = 0): com.google.android.material.navigation.NavigationView = themedNavigationView(theme) {}
inline fun ViewManager.themedNavigationView(theme: Int = 0, init: (@AnkoViewDslMarker com.google.android.material.navigation.NavigationView).() -> Unit): com.google.android.material.navigation.NavigationView {
return ankoView(`$$Anko$Factories$DesignView`.NAVIGATION_VIEW, theme) { init() }
}

inline fun Context.navigationView(): com.google.android.material.navigation.NavigationView = navigationView() {}
inline fun Context.navigationView(init: (@AnkoViewDslMarker com.google.android.material.navigation.NavigationView).() -> Unit): com.google.android.material.navigation.NavigationView {
    return ankoView(`$$Anko$Factories$DesignView`.NAVIGATION_VIEW, theme = 0) { init() }
}

inline fun Context.themedNavigationView(theme: Int = 0): com.google.android.material.navigation.NavigationView = themedNavigationView(theme) {}
inline fun Context.themedNavigationView(theme: Int = 0, init: (@AnkoViewDslMarker com.google.android.material.navigation.NavigationView).() -> Unit): com.google.android.material.navigation.NavigationView {
return ankoView(`$$Anko$Factories$DesignView`.NAVIGATION_VIEW, theme) { init() }
}

inline fun Activity.navigationView(): com.google.android.material.navigation.NavigationView = navigationView() {}
inline fun Activity.navigationView(init: (@AnkoViewDslMarker com.google.android.material.navigation.NavigationView).() -> Unit): com.google.android.material.navigation.NavigationView {
    return ankoView(`$$Anko$Factories$DesignView`.NAVIGATION_VIEW, theme = 0) { init() }
}

inline fun Activity.themedNavigationView(theme: Int = 0): com.google.android.material.navigation.NavigationView = themedNavigationView(theme) {}
inline fun Activity.themedNavigationView(theme: Int = 0, init: (@AnkoViewDslMarker com.google.android.material.navigation.NavigationView).() -> Unit): com.google.android.material.navigation.NavigationView {
return ankoView(`$$Anko$Factories$DesignView`.NAVIGATION_VIEW, theme) { init() }
}

inline fun ViewManager.tabItem(): com.google.android.material.tabs.TabItem = tabItem() {}
inline fun ViewManager.tabItem(init: (@AnkoViewDslMarker com.google.android.material.tabs.TabItem).() -> Unit): com.google.android.material.tabs.TabItem {
    return ankoView(`$$Anko$Factories$DesignView`.TAB_ITEM, theme = 0) { init() }
}

inline fun ViewManager.themedTabItem(theme: Int = 0): com.google.android.material.tabs.TabItem = themedTabItem(theme) {}
inline fun ViewManager.themedTabItem(theme: Int = 0, init: (@AnkoViewDslMarker com.google.android.material.tabs.TabItem).() -> Unit): com.google.android.material.tabs.TabItem {
return ankoView(`$$Anko$Factories$DesignView`.TAB_ITEM, theme) { init() }
}

inline fun ViewManager.textInputEditText(): com.google.android.material.textfield.TextInputEditText = textInputEditText() {}
inline fun ViewManager.textInputEditText(init: (@AnkoViewDslMarker com.google.android.material.textfield.TextInputEditText).() -> Unit): com.google.android.material.textfield.TextInputEditText {
    return ankoView(`$$Anko$Factories$DesignView`.TEXT_INPUT_EDIT_TEXT, theme = 0) { init() }
}

inline fun ViewManager.themedTextInputEditText(theme: Int = 0): com.google.android.material.textfield.TextInputEditText = themedTextInputEditText(theme) {}
inline fun ViewManager.themedTextInputEditText(theme: Int = 0, init: (@AnkoViewDslMarker com.google.android.material.textfield.TextInputEditText).() -> Unit): com.google.android.material.textfield.TextInputEditText {
return ankoView(`$$Anko$Factories$DesignView`.TEXT_INPUT_EDIT_TEXT, theme) { init() }
}

@PublishedApi
internal object `$$Anko$Factories$DesignViewGroup` {
    val APP_BAR_LAYOUT = { ctx: Context -> _AppBarLayout(ctx) }
    val BOTTOM_NAVIGATION_VIEW = { ctx: Context -> _BottomNavigationView(ctx) }
    val COLLAPSING_TOOLBAR_LAYOUT = { ctx: Context -> _CollapsingToolbarLayout(ctx) }
    val COORDINATOR_LAYOUT = { ctx: Context -> _CoordinatorLayout(ctx) }
    val TAB_LAYOUT = { ctx: Context -> _TabLayout(ctx) }
    val TEXT_INPUT_LAYOUT = { ctx: Context -> _TextInputLayout(ctx) }
}

inline fun ViewManager.appBarLayout(): com.google.android.material.appbar.AppBarLayout = appBarLayout() {}
inline fun ViewManager.appBarLayout(init: (@AnkoViewDslMarker _AppBarLayout).() -> Unit): com.google.android.material.appbar.AppBarLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.APP_BAR_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedAppBarLayout(theme: Int = 0): com.google.android.material.appbar.AppBarLayout = themedAppBarLayout(theme) {}
inline fun ViewManager.themedAppBarLayout(theme: Int = 0, init: (@AnkoViewDslMarker _AppBarLayout).() -> Unit): com.google.android.material.appbar.AppBarLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.APP_BAR_LAYOUT, theme) { init() }
}

inline fun Context.appBarLayout(): com.google.android.material.appbar.AppBarLayout = appBarLayout() {}
inline fun Context.appBarLayout(init: (@AnkoViewDslMarker _AppBarLayout).() -> Unit): com.google.android.material.appbar.AppBarLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.APP_BAR_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedAppBarLayout(theme: Int = 0): com.google.android.material.appbar.AppBarLayout = themedAppBarLayout(theme) {}
inline fun Context.themedAppBarLayout(theme: Int = 0, init: (@AnkoViewDslMarker _AppBarLayout).() -> Unit): com.google.android.material.appbar.AppBarLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.APP_BAR_LAYOUT, theme) { init() }
}

inline fun Activity.appBarLayout(): com.google.android.material.appbar.AppBarLayout = appBarLayout() {}
inline fun Activity.appBarLayout(init: (@AnkoViewDslMarker _AppBarLayout).() -> Unit): com.google.android.material.appbar.AppBarLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.APP_BAR_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedAppBarLayout(theme: Int = 0): com.google.android.material.appbar.AppBarLayout = themedAppBarLayout(theme) {}
inline fun Activity.themedAppBarLayout(theme: Int = 0, init: (@AnkoViewDslMarker _AppBarLayout).() -> Unit): com.google.android.material.appbar.AppBarLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.APP_BAR_LAYOUT, theme) { init() }
}

inline fun ViewManager.bottomNavigationView(): com.google.android.material.bottomnavigation.BottomNavigationView = bottomNavigationView() {}
inline fun ViewManager.bottomNavigationView(init: (@AnkoViewDslMarker _BottomNavigationView).() -> Unit): com.google.android.material.bottomnavigation.BottomNavigationView {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.BOTTOM_NAVIGATION_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedBottomNavigationView(theme: Int = 0): com.google.android.material.bottomnavigation.BottomNavigationView = themedBottomNavigationView(theme) {}
inline fun ViewManager.themedBottomNavigationView(theme: Int = 0, init: (@AnkoViewDslMarker _BottomNavigationView).() -> Unit): com.google.android.material.bottomnavigation.BottomNavigationView {
return ankoView(`$$Anko$Factories$DesignViewGroup`.BOTTOM_NAVIGATION_VIEW, theme) { init() }
}

inline fun Context.bottomNavigationView(): com.google.android.material.bottomnavigation.BottomNavigationView = bottomNavigationView() {}
inline fun Context.bottomNavigationView(init: (@AnkoViewDslMarker _BottomNavigationView).() -> Unit): com.google.android.material.bottomnavigation.BottomNavigationView {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.BOTTOM_NAVIGATION_VIEW, theme = 0) { init() }
}

inline fun Context.themedBottomNavigationView(theme: Int = 0): com.google.android.material.bottomnavigation.BottomNavigationView = themedBottomNavigationView(theme) {}
inline fun Context.themedBottomNavigationView(theme: Int = 0, init: (@AnkoViewDslMarker _BottomNavigationView).() -> Unit): com.google.android.material.bottomnavigation.BottomNavigationView {
return ankoView(`$$Anko$Factories$DesignViewGroup`.BOTTOM_NAVIGATION_VIEW, theme) { init() }
}

inline fun Activity.bottomNavigationView(): com.google.android.material.bottomnavigation.BottomNavigationView = bottomNavigationView() {}
inline fun Activity.bottomNavigationView(init: (@AnkoViewDslMarker _BottomNavigationView).() -> Unit): com.google.android.material.bottomnavigation.BottomNavigationView {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.BOTTOM_NAVIGATION_VIEW, theme = 0) { init() }
}

inline fun Activity.themedBottomNavigationView(theme: Int = 0): com.google.android.material.bottomnavigation.BottomNavigationView = themedBottomNavigationView(theme) {}
inline fun Activity.themedBottomNavigationView(theme: Int = 0, init: (@AnkoViewDslMarker _BottomNavigationView).() -> Unit): com.google.android.material.bottomnavigation.BottomNavigationView {
return ankoView(`$$Anko$Factories$DesignViewGroup`.BOTTOM_NAVIGATION_VIEW, theme) { init() }
}

inline fun ViewManager.collapsingToolbarLayout(): com.google.android.material.appbar.CollapsingToolbarLayout = collapsingToolbarLayout() {}
inline fun ViewManager.collapsingToolbarLayout(init: (@AnkoViewDslMarker _CollapsingToolbarLayout).() -> Unit): com.google.android.material.appbar.CollapsingToolbarLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.COLLAPSING_TOOLBAR_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedCollapsingToolbarLayout(theme: Int = 0): com.google.android.material.appbar.CollapsingToolbarLayout = themedCollapsingToolbarLayout(theme) {}
inline fun ViewManager.themedCollapsingToolbarLayout(theme: Int = 0, init: (@AnkoViewDslMarker _CollapsingToolbarLayout).() -> Unit): com.google.android.material.appbar.CollapsingToolbarLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.COLLAPSING_TOOLBAR_LAYOUT, theme) { init() }
}

inline fun Context.collapsingToolbarLayout(): com.google.android.material.appbar.CollapsingToolbarLayout = collapsingToolbarLayout() {}
inline fun Context.collapsingToolbarLayout(init: (@AnkoViewDslMarker _CollapsingToolbarLayout).() -> Unit): com.google.android.material.appbar.CollapsingToolbarLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.COLLAPSING_TOOLBAR_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedCollapsingToolbarLayout(theme: Int = 0): com.google.android.material.appbar.CollapsingToolbarLayout = themedCollapsingToolbarLayout(theme) {}
inline fun Context.themedCollapsingToolbarLayout(theme: Int = 0, init: (@AnkoViewDslMarker _CollapsingToolbarLayout).() -> Unit): com.google.android.material.appbar.CollapsingToolbarLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.COLLAPSING_TOOLBAR_LAYOUT, theme) { init() }
}

inline fun Activity.collapsingToolbarLayout(): com.google.android.material.appbar.CollapsingToolbarLayout = collapsingToolbarLayout() {}
inline fun Activity.collapsingToolbarLayout(init: (@AnkoViewDslMarker _CollapsingToolbarLayout).() -> Unit): com.google.android.material.appbar.CollapsingToolbarLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.COLLAPSING_TOOLBAR_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedCollapsingToolbarLayout(theme: Int = 0): com.google.android.material.appbar.CollapsingToolbarLayout = themedCollapsingToolbarLayout(theme) {}
inline fun Activity.themedCollapsingToolbarLayout(theme: Int = 0, init: (@AnkoViewDslMarker _CollapsingToolbarLayout).() -> Unit): com.google.android.material.appbar.CollapsingToolbarLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.COLLAPSING_TOOLBAR_LAYOUT, theme) { init() }
}

inline fun ViewManager.coordinatorLayout(): androidx.coordinatorlayout.widget.CoordinatorLayout = coordinatorLayout() {}
inline fun ViewManager.coordinatorLayout(init: (@AnkoViewDslMarker _CoordinatorLayout).() -> Unit): androidx.coordinatorlayout.widget.CoordinatorLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.COORDINATOR_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedCoordinatorLayout(theme: Int = 0): androidx.coordinatorlayout.widget.CoordinatorLayout = themedCoordinatorLayout(theme) {}
inline fun ViewManager.themedCoordinatorLayout(theme: Int = 0, init: (@AnkoViewDslMarker _CoordinatorLayout).() -> Unit): androidx.coordinatorlayout.widget.CoordinatorLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.COORDINATOR_LAYOUT, theme) { init() }
}

inline fun Context.coordinatorLayout(): androidx.coordinatorlayout.widget.CoordinatorLayout = coordinatorLayout() {}
inline fun Context.coordinatorLayout(init: (@AnkoViewDslMarker _CoordinatorLayout).() -> Unit): androidx.coordinatorlayout.widget.CoordinatorLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.COORDINATOR_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedCoordinatorLayout(theme: Int = 0): androidx.coordinatorlayout.widget.CoordinatorLayout = themedCoordinatorLayout(theme) {}
inline fun Context.themedCoordinatorLayout(theme: Int = 0, init: (@AnkoViewDslMarker _CoordinatorLayout).() -> Unit): androidx.coordinatorlayout.widget.CoordinatorLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.COORDINATOR_LAYOUT, theme) { init() }
}

inline fun Activity.coordinatorLayout(): androidx.coordinatorlayout.widget.CoordinatorLayout = coordinatorLayout() {}
inline fun Activity.coordinatorLayout(init: (@AnkoViewDslMarker _CoordinatorLayout).() -> Unit): androidx.coordinatorlayout.widget.CoordinatorLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.COORDINATOR_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedCoordinatorLayout(theme: Int = 0): androidx.coordinatorlayout.widget.CoordinatorLayout = themedCoordinatorLayout(theme) {}
inline fun Activity.themedCoordinatorLayout(theme: Int = 0, init: (@AnkoViewDslMarker _CoordinatorLayout).() -> Unit): androidx.coordinatorlayout.widget.CoordinatorLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.COORDINATOR_LAYOUT, theme) { init() }
}

inline fun ViewManager.tabLayout(): com.google.android.material.tabs.TabLayout = tabLayout() {}
inline fun ViewManager.tabLayout(init: (@AnkoViewDslMarker _TabLayout).() -> Unit): com.google.android.material.tabs.TabLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.TAB_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedTabLayout(theme: Int = 0): com.google.android.material.tabs.TabLayout = themedTabLayout(theme) {}
inline fun ViewManager.themedTabLayout(theme: Int = 0, init: (@AnkoViewDslMarker _TabLayout).() -> Unit): com.google.android.material.tabs.TabLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.TAB_LAYOUT, theme) { init() }
}

inline fun Context.tabLayout(): com.google.android.material.tabs.TabLayout = tabLayout() {}
inline fun Context.tabLayout(init: (@AnkoViewDslMarker _TabLayout).() -> Unit): com.google.android.material.tabs.TabLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.TAB_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedTabLayout(theme: Int = 0): com.google.android.material.tabs.TabLayout = themedTabLayout(theme) {}
inline fun Context.themedTabLayout(theme: Int = 0, init: (@AnkoViewDslMarker _TabLayout).() -> Unit): com.google.android.material.tabs.TabLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.TAB_LAYOUT, theme) { init() }
}

inline fun Activity.tabLayout(): com.google.android.material.tabs.TabLayout = tabLayout() {}
inline fun Activity.tabLayout(init: (@AnkoViewDslMarker _TabLayout).() -> Unit): com.google.android.material.tabs.TabLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.TAB_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedTabLayout(theme: Int = 0): com.google.android.material.tabs.TabLayout = themedTabLayout(theme) {}
inline fun Activity.themedTabLayout(theme: Int = 0, init: (@AnkoViewDslMarker _TabLayout).() -> Unit): com.google.android.material.tabs.TabLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.TAB_LAYOUT, theme) { init() }
}

inline fun ViewManager.textInputLayout(): com.google.android.material.textfield.TextInputLayout = textInputLayout() {}
inline fun ViewManager.textInputLayout(init: (@AnkoViewDslMarker _TextInputLayout).() -> Unit): com.google.android.material.textfield.TextInputLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.TEXT_INPUT_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedTextInputLayout(theme: Int = 0): com.google.android.material.textfield.TextInputLayout = themedTextInputLayout(theme) {}
inline fun ViewManager.themedTextInputLayout(theme: Int = 0, init: (@AnkoViewDslMarker _TextInputLayout).() -> Unit): com.google.android.material.textfield.TextInputLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.TEXT_INPUT_LAYOUT, theme) { init() }
}

inline fun Context.textInputLayout(): com.google.android.material.textfield.TextInputLayout = textInputLayout() {}
inline fun Context.textInputLayout(init: (@AnkoViewDslMarker _TextInputLayout).() -> Unit): com.google.android.material.textfield.TextInputLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.TEXT_INPUT_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedTextInputLayout(theme: Int = 0): com.google.android.material.textfield.TextInputLayout = themedTextInputLayout(theme) {}
inline fun Context.themedTextInputLayout(theme: Int = 0, init: (@AnkoViewDslMarker _TextInputLayout).() -> Unit): com.google.android.material.textfield.TextInputLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.TEXT_INPUT_LAYOUT, theme) { init() }
}

inline fun Activity.textInputLayout(): com.google.android.material.textfield.TextInputLayout = textInputLayout() {}
inline fun Activity.textInputLayout(init: (@AnkoViewDslMarker _TextInputLayout).() -> Unit): com.google.android.material.textfield.TextInputLayout {
    return ankoView(`$$Anko$Factories$DesignViewGroup`.TEXT_INPUT_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedTextInputLayout(theme: Int = 0): com.google.android.material.textfield.TextInputLayout = themedTextInputLayout(theme) {}
inline fun Activity.themedTextInputLayout(theme: Int = 0, init: (@AnkoViewDslMarker _TextInputLayout).() -> Unit): com.google.android.material.textfield.TextInputLayout {
return ankoView(`$$Anko$Factories$DesignViewGroup`.TEXT_INPUT_LAYOUT, theme) { init() }
}

