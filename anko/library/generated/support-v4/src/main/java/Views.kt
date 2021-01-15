@file:JvmName("SupportV4ViewsKt")
package org.jetbrains.anko.support.v4

import android.app.Activity
import android.content.Context
import android.view.ViewManager
import android.widget.Space
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.custom.ankoView

@PublishedApi
internal object `$$Anko$Factories$SupportV4View` {
    val PAGER_TAB_STRIP = { ctx: Context -> androidx.viewpager.widget.PagerTabStrip(ctx) }
    val PAGER_TITLE_STRIP = { ctx: Context -> androidx.viewpager.widget.PagerTitleStrip(ctx) }
    val CONTENT_LOADING_PROGRESS_BAR = { ctx: Context -> androidx.core.widget.ContentLoadingProgressBar(ctx) }
    val SPACE = { ctx: Context -> Space(ctx) }
    val SWIPE_REFRESH_LAYOUT = { ctx: Context -> androidx.swiperefreshlayout.widget.SwipeRefreshLayout(ctx) }
}

inline fun ViewManager.pagerTabStrip(): androidx.viewpager.widget.PagerTabStrip = pagerTabStrip() {}
inline fun ViewManager.pagerTabStrip(init: (@AnkoViewDslMarker androidx.viewpager.widget.PagerTabStrip).() -> Unit): androidx.viewpager.widget.PagerTabStrip {
    return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TAB_STRIP, theme = 0) { init() }
}

inline fun ViewManager.themedPagerTabStrip(theme: Int = 0): androidx.viewpager.widget.PagerTabStrip = themedPagerTabStrip(theme) {}
inline fun ViewManager.themedPagerTabStrip(theme: Int = 0, init: (@AnkoViewDslMarker androidx.viewpager.widget.PagerTabStrip).() -> Unit): androidx.viewpager.widget.PagerTabStrip {
return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TAB_STRIP, theme) { init() }
}

inline fun Context.pagerTabStrip(): androidx.viewpager.widget.PagerTabStrip = pagerTabStrip() {}
inline fun Context.pagerTabStrip(init: (@AnkoViewDslMarker androidx.viewpager.widget.PagerTabStrip).() -> Unit): androidx.viewpager.widget.PagerTabStrip {
    return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TAB_STRIP, theme = 0) { init() }
}

inline fun Context.themedPagerTabStrip(theme: Int = 0): androidx.viewpager.widget.PagerTabStrip = themedPagerTabStrip(theme) {}
inline fun Context.themedPagerTabStrip(theme: Int = 0, init: (@AnkoViewDslMarker androidx.viewpager.widget.PagerTabStrip).() -> Unit): androidx.viewpager.widget.PagerTabStrip {
return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TAB_STRIP, theme) { init() }
}

inline fun Activity.pagerTabStrip(): androidx.viewpager.widget.PagerTabStrip = pagerTabStrip() {}
inline fun Activity.pagerTabStrip(init: (@AnkoViewDslMarker androidx.viewpager.widget.PagerTabStrip).() -> Unit): androidx.viewpager.widget.PagerTabStrip {
    return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TAB_STRIP, theme = 0) { init() }
}

inline fun Activity.themedPagerTabStrip(theme: Int = 0): androidx.viewpager.widget.PagerTabStrip = themedPagerTabStrip(theme) {}
inline fun Activity.themedPagerTabStrip(theme: Int = 0, init: (@AnkoViewDslMarker androidx.viewpager.widget.PagerTabStrip).() -> Unit): androidx.viewpager.widget.PagerTabStrip {
return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TAB_STRIP, theme) { init() }
}

inline fun ViewManager.pagerTitleStrip(): androidx.viewpager.widget.PagerTitleStrip = pagerTitleStrip() {}
inline fun ViewManager.pagerTitleStrip(init: (@AnkoViewDslMarker androidx.viewpager.widget.PagerTitleStrip).() -> Unit): androidx.viewpager.widget.PagerTitleStrip {
    return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TITLE_STRIP, theme = 0) { init() }
}

inline fun ViewManager.themedPagerTitleStrip(theme: Int = 0): androidx.viewpager.widget.PagerTitleStrip = themedPagerTitleStrip(theme) {}
inline fun ViewManager.themedPagerTitleStrip(theme: Int = 0, init: (@AnkoViewDslMarker androidx.viewpager.widget.PagerTitleStrip).() -> Unit): androidx.viewpager.widget.PagerTitleStrip {
return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TITLE_STRIP, theme) { init() }
}

inline fun Context.pagerTitleStrip(): androidx.viewpager.widget.PagerTitleStrip = pagerTitleStrip() {}
inline fun Context.pagerTitleStrip(init: (@AnkoViewDslMarker androidx.viewpager.widget.PagerTitleStrip).() -> Unit): androidx.viewpager.widget.PagerTitleStrip {
    return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TITLE_STRIP, theme = 0) { init() }
}

inline fun Context.themedPagerTitleStrip(theme: Int = 0): androidx.viewpager.widget.PagerTitleStrip = themedPagerTitleStrip(theme) {}
inline fun Context.themedPagerTitleStrip(theme: Int = 0, init: (@AnkoViewDslMarker androidx.viewpager.widget.PagerTitleStrip).() -> Unit): androidx.viewpager.widget.PagerTitleStrip {
return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TITLE_STRIP, theme) { init() }
}

inline fun Activity.pagerTitleStrip(): androidx.viewpager.widget.PagerTitleStrip = pagerTitleStrip() {}
inline fun Activity.pagerTitleStrip(init: (@AnkoViewDslMarker androidx.viewpager.widget.PagerTitleStrip).() -> Unit): androidx.viewpager.widget.PagerTitleStrip {
    return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TITLE_STRIP, theme = 0) { init() }
}

inline fun Activity.themedPagerTitleStrip(theme: Int = 0): androidx.viewpager.widget.PagerTitleStrip = themedPagerTitleStrip(theme) {}
inline fun Activity.themedPagerTitleStrip(theme: Int = 0, init: (@AnkoViewDslMarker androidx.viewpager.widget.PagerTitleStrip).() -> Unit): androidx.viewpager.widget.PagerTitleStrip {
return ankoView(`$$Anko$Factories$SupportV4View`.PAGER_TITLE_STRIP, theme) { init() }
}

inline fun ViewManager.contentLoadingProgressBar(): androidx.core.widget.ContentLoadingProgressBar = contentLoadingProgressBar() {}
inline fun ViewManager.contentLoadingProgressBar(init: (@AnkoViewDslMarker androidx.core.widget.ContentLoadingProgressBar).() -> Unit): androidx.core.widget.ContentLoadingProgressBar {
    return ankoView(`$$Anko$Factories$SupportV4View`.CONTENT_LOADING_PROGRESS_BAR, theme = 0) { init() }
}

inline fun ViewManager.themedContentLoadingProgressBar(theme: Int = 0): androidx.core.widget.ContentLoadingProgressBar = themedContentLoadingProgressBar(theme) {}
inline fun ViewManager.themedContentLoadingProgressBar(theme: Int = 0, init: (@AnkoViewDslMarker androidx.core.widget.ContentLoadingProgressBar).() -> Unit): androidx.core.widget.ContentLoadingProgressBar {
return ankoView(`$$Anko$Factories$SupportV4View`.CONTENT_LOADING_PROGRESS_BAR, theme) { init() }
}

inline fun ViewManager.space(): Space = space() {}
inline fun ViewManager.space(init: (@AnkoViewDslMarker Space).() -> Unit): Space {
    return ankoView(`$$Anko$Factories$SupportV4View`.SPACE, theme = 0) { init() }
}

inline fun ViewManager.themedSpace(theme: Int = 0): Space = themedSpace(theme) {}
inline fun ViewManager.themedSpace(theme: Int = 0, init: (@AnkoViewDslMarker Space).() -> Unit): Space {
return ankoView(`$$Anko$Factories$SupportV4View`.SPACE, theme) { init() }
}

inline fun ViewManager.swipeRefreshLayout(): androidx.swiperefreshlayout.widget.SwipeRefreshLayout = swipeRefreshLayout() {}
inline fun ViewManager.swipeRefreshLayout(init: (@AnkoViewDslMarker androidx.swiperefreshlayout.widget.SwipeRefreshLayout).() -> Unit): androidx.swiperefreshlayout.widget.SwipeRefreshLayout {
    return ankoView(`$$Anko$Factories$SupportV4View`.SWIPE_REFRESH_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedSwipeRefreshLayout(theme: Int = 0): androidx.swiperefreshlayout.widget.SwipeRefreshLayout = themedSwipeRefreshLayout(theme) {}
inline fun ViewManager.themedSwipeRefreshLayout(theme: Int = 0, init: (@AnkoViewDslMarker androidx.swiperefreshlayout.widget.SwipeRefreshLayout).() -> Unit): androidx.swiperefreshlayout.widget.SwipeRefreshLayout {
return ankoView(`$$Anko$Factories$SupportV4View`.SWIPE_REFRESH_LAYOUT, theme) { init() }
}

inline fun Context.swipeRefreshLayout(): androidx.swiperefreshlayout.widget.SwipeRefreshLayout = swipeRefreshLayout() {}
inline fun Context.swipeRefreshLayout(init: (@AnkoViewDslMarker androidx.swiperefreshlayout.widget.SwipeRefreshLayout).() -> Unit): androidx.swiperefreshlayout.widget.SwipeRefreshLayout {
    return ankoView(`$$Anko$Factories$SupportV4View`.SWIPE_REFRESH_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedSwipeRefreshLayout(theme: Int = 0): androidx.swiperefreshlayout.widget.SwipeRefreshLayout = themedSwipeRefreshLayout(theme) {}
inline fun Context.themedSwipeRefreshLayout(theme: Int = 0, init: (@AnkoViewDslMarker androidx.swiperefreshlayout.widget.SwipeRefreshLayout).() -> Unit): androidx.swiperefreshlayout.widget.SwipeRefreshLayout {
return ankoView(`$$Anko$Factories$SupportV4View`.SWIPE_REFRESH_LAYOUT, theme) { init() }
}

inline fun Activity.swipeRefreshLayout(): androidx.swiperefreshlayout.widget.SwipeRefreshLayout = swipeRefreshLayout() {}
inline fun Activity.swipeRefreshLayout(init: (@AnkoViewDslMarker androidx.swiperefreshlayout.widget.SwipeRefreshLayout).() -> Unit): androidx.swiperefreshlayout.widget.SwipeRefreshLayout {
    return ankoView(`$$Anko$Factories$SupportV4View`.SWIPE_REFRESH_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedSwipeRefreshLayout(theme: Int = 0): androidx.swiperefreshlayout.widget.SwipeRefreshLayout = themedSwipeRefreshLayout(theme) {}
inline fun Activity.themedSwipeRefreshLayout(theme: Int = 0, init: (@AnkoViewDslMarker androidx.swiperefreshlayout.widget.SwipeRefreshLayout).() -> Unit): androidx.swiperefreshlayout.widget.SwipeRefreshLayout {
return ankoView(`$$Anko$Factories$SupportV4View`.SWIPE_REFRESH_LAYOUT, theme) { init() }
}

@PublishedApi
internal object `$$Anko$Factories$SupportV4ViewGroup` {
    val FRAGMENT_TAB_HOST = { ctx: Context -> _FragmentTabHost(ctx) }
    val VIEW_PAGER = { ctx: Context -> _ViewPager(ctx) }
    val DRAWER_LAYOUT = { ctx: Context -> _DrawerLayout(ctx) }
    val NESTED_SCROLL_VIEW = { ctx: Context -> _NestedScrollView(ctx) }
    val SLIDING_PANE_LAYOUT = { ctx: Context -> _SlidingPaneLayout(ctx) }
}

inline fun ViewManager.fragmentTabHost(): androidx.fragment.app.FragmentTabHost = fragmentTabHost() {}
inline fun ViewManager.fragmentTabHost(init: (@AnkoViewDslMarker _FragmentTabHost).() -> Unit): androidx.fragment.app.FragmentTabHost {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.FRAGMENT_TAB_HOST, theme = 0) { init() }
}

inline fun ViewManager.themedFragmentTabHost(theme: Int = 0): androidx.fragment.app.FragmentTabHost = themedFragmentTabHost(theme) {}
inline fun ViewManager.themedFragmentTabHost(theme: Int = 0, init: (@AnkoViewDslMarker _FragmentTabHost).() -> Unit): androidx.fragment.app.FragmentTabHost {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.FRAGMENT_TAB_HOST, theme) { init() }
}

inline fun Context.fragmentTabHost(): androidx.fragment.app.FragmentTabHost = fragmentTabHost() {}
inline fun Context.fragmentTabHost(init: (@AnkoViewDslMarker _FragmentTabHost).() -> Unit): androidx.fragment.app.FragmentTabHost {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.FRAGMENT_TAB_HOST, theme = 0) { init() }
}

inline fun Context.themedFragmentTabHost(theme: Int = 0): androidx.fragment.app.FragmentTabHost = themedFragmentTabHost(theme) {}
inline fun Context.themedFragmentTabHost(theme: Int = 0, init: (@AnkoViewDslMarker _FragmentTabHost).() -> Unit): androidx.fragment.app.FragmentTabHost {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.FRAGMENT_TAB_HOST, theme) { init() }
}

inline fun Activity.fragmentTabHost(): androidx.fragment.app.FragmentTabHost = fragmentTabHost() {}
inline fun Activity.fragmentTabHost(init: (@AnkoViewDslMarker _FragmentTabHost).() -> Unit): androidx.fragment.app.FragmentTabHost {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.FRAGMENT_TAB_HOST, theme = 0) { init() }
}

inline fun Activity.themedFragmentTabHost(theme: Int = 0): androidx.fragment.app.FragmentTabHost = themedFragmentTabHost(theme) {}
inline fun Activity.themedFragmentTabHost(theme: Int = 0, init: (@AnkoViewDslMarker _FragmentTabHost).() -> Unit): androidx.fragment.app.FragmentTabHost {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.FRAGMENT_TAB_HOST, theme) { init() }
}

inline fun ViewManager.viewPager(): androidx.viewpager.widget.ViewPager = viewPager() {}
inline fun ViewManager.viewPager(init: (@AnkoViewDslMarker _ViewPager).() -> Unit): androidx.viewpager.widget.ViewPager {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.VIEW_PAGER, theme = 0) { init() }
}

inline fun ViewManager.themedViewPager(theme: Int = 0): androidx.viewpager.widget.ViewPager = themedViewPager(theme) {}
inline fun ViewManager.themedViewPager(theme: Int = 0, init: (@AnkoViewDslMarker _ViewPager).() -> Unit): androidx.viewpager.widget.ViewPager {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.VIEW_PAGER, theme) { init() }
}

inline fun Context.viewPager(): androidx.viewpager.widget.ViewPager = viewPager() {}
inline fun Context.viewPager(init: (@AnkoViewDslMarker _ViewPager).() -> Unit): androidx.viewpager.widget.ViewPager {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.VIEW_PAGER, theme = 0) { init() }
}

inline fun Context.themedViewPager(theme: Int = 0): androidx.viewpager.widget.ViewPager = themedViewPager(theme) {}
inline fun Context.themedViewPager(theme: Int = 0, init: (@AnkoViewDslMarker _ViewPager).() -> Unit): androidx.viewpager.widget.ViewPager {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.VIEW_PAGER, theme) { init() }
}

inline fun Activity.viewPager(): androidx.viewpager.widget.ViewPager = viewPager() {}
inline fun Activity.viewPager(init: (@AnkoViewDslMarker _ViewPager).() -> Unit): androidx.viewpager.widget.ViewPager {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.VIEW_PAGER, theme = 0) { init() }
}

inline fun Activity.themedViewPager(theme: Int = 0): androidx.viewpager.widget.ViewPager = themedViewPager(theme) {}
inline fun Activity.themedViewPager(theme: Int = 0, init: (@AnkoViewDslMarker _ViewPager).() -> Unit): androidx.viewpager.widget.ViewPager {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.VIEW_PAGER, theme) { init() }
}

inline fun ViewManager.drawerLayout(): androidx.drawerlayout.widget.DrawerLayout = drawerLayout() {}
inline fun ViewManager.drawerLayout(init: (@AnkoViewDslMarker _DrawerLayout).() -> Unit): androidx.drawerlayout.widget.DrawerLayout {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.DRAWER_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedDrawerLayout(theme: Int = 0): androidx.drawerlayout.widget.DrawerLayout = themedDrawerLayout(theme) {}
inline fun ViewManager.themedDrawerLayout(theme: Int = 0, init: (@AnkoViewDslMarker _DrawerLayout).() -> Unit): androidx.drawerlayout.widget.DrawerLayout {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.DRAWER_LAYOUT, theme) { init() }
}

inline fun Context.drawerLayout(): androidx.drawerlayout.widget.DrawerLayout = drawerLayout() {}
inline fun Context.drawerLayout(init: (@AnkoViewDslMarker _DrawerLayout).() -> Unit): androidx.drawerlayout.widget.DrawerLayout {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.DRAWER_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedDrawerLayout(theme: Int = 0): androidx.drawerlayout.widget.DrawerLayout = themedDrawerLayout(theme) {}
inline fun Context.themedDrawerLayout(theme: Int = 0, init: (@AnkoViewDslMarker _DrawerLayout).() -> Unit): androidx.drawerlayout.widget.DrawerLayout {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.DRAWER_LAYOUT, theme) { init() }
}

inline fun Activity.drawerLayout(): androidx.drawerlayout.widget.DrawerLayout = drawerLayout() {}
inline fun Activity.drawerLayout(init: (@AnkoViewDslMarker _DrawerLayout).() -> Unit): androidx.drawerlayout.widget.DrawerLayout {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.DRAWER_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedDrawerLayout(theme: Int = 0): androidx.drawerlayout.widget.DrawerLayout = themedDrawerLayout(theme) {}
inline fun Activity.themedDrawerLayout(theme: Int = 0, init: (@AnkoViewDslMarker _DrawerLayout).() -> Unit): androidx.drawerlayout.widget.DrawerLayout {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.DRAWER_LAYOUT, theme) { init() }
}

inline fun ViewManager.nestedScrollView(): androidx.core.widget.NestedScrollView = nestedScrollView() {}
inline fun ViewManager.nestedScrollView(init: (@AnkoViewDslMarker _NestedScrollView).() -> Unit): androidx.core.widget.NestedScrollView {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.NESTED_SCROLL_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedNestedScrollView(theme: Int = 0): androidx.core.widget.NestedScrollView = themedNestedScrollView(theme) {}
inline fun ViewManager.themedNestedScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _NestedScrollView).() -> Unit): androidx.core.widget.NestedScrollView {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.NESTED_SCROLL_VIEW, theme) { init() }
}

inline fun Context.nestedScrollView(): androidx.core.widget.NestedScrollView = nestedScrollView() {}
inline fun Context.nestedScrollView(init: (@AnkoViewDslMarker _NestedScrollView).() -> Unit): androidx.core.widget.NestedScrollView {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.NESTED_SCROLL_VIEW, theme = 0) { init() }
}

inline fun Context.themedNestedScrollView(theme: Int = 0): androidx.core.widget.NestedScrollView = themedNestedScrollView(theme) {}
inline fun Context.themedNestedScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _NestedScrollView).() -> Unit): androidx.core.widget.NestedScrollView {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.NESTED_SCROLL_VIEW, theme) { init() }
}

inline fun Activity.nestedScrollView(): androidx.core.widget.NestedScrollView = nestedScrollView() {}
inline fun Activity.nestedScrollView(init: (@AnkoViewDslMarker _NestedScrollView).() -> Unit): androidx.core.widget.NestedScrollView {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.NESTED_SCROLL_VIEW, theme = 0) { init() }
}

inline fun Activity.themedNestedScrollView(theme: Int = 0): androidx.core.widget.NestedScrollView = themedNestedScrollView(theme) {}
inline fun Activity.themedNestedScrollView(theme: Int = 0, init: (@AnkoViewDslMarker _NestedScrollView).() -> Unit): androidx.core.widget.NestedScrollView {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.NESTED_SCROLL_VIEW, theme) { init() }
}

inline fun ViewManager.slidingPaneLayout(): androidx.slidingpanelayout.widget.SlidingPaneLayout = slidingPaneLayout() {}
inline fun ViewManager.slidingPaneLayout(init: (@AnkoViewDslMarker _SlidingPaneLayout).() -> Unit): androidx.slidingpanelayout.widget.SlidingPaneLayout {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.SLIDING_PANE_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedSlidingPaneLayout(theme: Int = 0): androidx.slidingpanelayout.widget.SlidingPaneLayout = themedSlidingPaneLayout(theme) {}
inline fun ViewManager.themedSlidingPaneLayout(theme: Int = 0, init: (@AnkoViewDslMarker _SlidingPaneLayout).() -> Unit): androidx.slidingpanelayout.widget.SlidingPaneLayout {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.SLIDING_PANE_LAYOUT, theme) { init() }
}

inline fun Context.slidingPaneLayout(): androidx.slidingpanelayout.widget.SlidingPaneLayout = slidingPaneLayout() {}
inline fun Context.slidingPaneLayout(init: (@AnkoViewDslMarker _SlidingPaneLayout).() -> Unit): androidx.slidingpanelayout.widget.SlidingPaneLayout {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.SLIDING_PANE_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedSlidingPaneLayout(theme: Int = 0): androidx.slidingpanelayout.widget.SlidingPaneLayout = themedSlidingPaneLayout(theme) {}
inline fun Context.themedSlidingPaneLayout(theme: Int = 0, init: (@AnkoViewDslMarker _SlidingPaneLayout).() -> Unit): androidx.slidingpanelayout.widget.SlidingPaneLayout {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.SLIDING_PANE_LAYOUT, theme) { init() }
}

inline fun Activity.slidingPaneLayout(): androidx.slidingpanelayout.widget.SlidingPaneLayout = slidingPaneLayout() {}
inline fun Activity.slidingPaneLayout(init: (@AnkoViewDslMarker _SlidingPaneLayout).() -> Unit): androidx.slidingpanelayout.widget.SlidingPaneLayout {
    return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.SLIDING_PANE_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedSlidingPaneLayout(theme: Int = 0): androidx.slidingpanelayout.widget.SlidingPaneLayout = themedSlidingPaneLayout(theme) {}
inline fun Activity.themedSlidingPaneLayout(theme: Int = 0, init: (@AnkoViewDslMarker _SlidingPaneLayout).() -> Unit): androidx.slidingpanelayout.widget.SlidingPaneLayout {
return ankoView(`$$Anko$Factories$SupportV4ViewGroup`.SLIDING_PANE_LAYOUT, theme) { init() }
}

