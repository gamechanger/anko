@file:JvmName("SupportV4ListenersKt")
package org.jetbrains.anko.support.v4


fun androidx.drawerlayout.widget.DrawerLayout.drawerListener(init: __DrawerLayout_DrawerListener.() -> Unit) {
    val listener = __DrawerLayout_DrawerListener()
    listener.init()
    addDrawerListener(listener)
}

class __DrawerLayout_DrawerListener : androidx.drawerlayout.widget.DrawerLayout.DrawerListener {
    private var _onDrawerSlide: ((android.view.View?, Float) -> Unit)? = null
    private var _onDrawerOpened: ((android.view.View?) -> Unit)? = null
    private var _onDrawerClosed: ((android.view.View?) -> Unit)? = null
    private var _onDrawerStateChanged: ((Int) -> Unit)? = null

    override fun onDrawerSlide(drawerView: android.view.View, slideOffset: Float) {
        _onDrawerSlide?.invoke(drawerView, slideOffset)
    }

    fun onDrawerSlide(listener: (android.view.View?, Float) -> Unit) {
        _onDrawerSlide = listener
    }

    override fun onDrawerOpened(drawerView: android.view.View) {
        _onDrawerOpened?.invoke(drawerView)
    }

    fun onDrawerOpened(listener: (android.view.View?) -> Unit) {
        _onDrawerOpened = listener
    }

    override fun onDrawerClosed(drawerView: android.view.View) {
        _onDrawerClosed?.invoke(drawerView)
    }

    fun onDrawerClosed(listener: (android.view.View?) -> Unit) {
        _onDrawerClosed = listener
    }

    override fun onDrawerStateChanged(newState: Int) {
        _onDrawerStateChanged?.invoke(newState)
    }

    fun onDrawerStateChanged(listener: (Int) -> Unit) {
        _onDrawerStateChanged = listener
    }

}

inline fun androidx.viewpager.widget.ViewPager.onAdapterChange(noinline l: (viewPager: androidx.viewpager.widget.ViewPager?, oldAdapter: androidx.viewpager.widget.PagerAdapter?, newAdapter: androidx.viewpager.widget.PagerAdapter?) -> Unit) {
    addOnAdapterChangeListener(l)
}

fun androidx.viewpager.widget.ViewPager.onPageChangeListener(init: __ViewPager_OnPageChangeListener.() -> Unit) {
    val listener = __ViewPager_OnPageChangeListener()
    listener.init()
    addOnPageChangeListener(listener)
}

class __ViewPager_OnPageChangeListener : androidx.viewpager.widget.ViewPager.OnPageChangeListener {
    private var _onPageScrolled: ((Int, Float, Int) -> Unit)? = null
    private var _onPageSelected: ((Int) -> Unit)? = null
    private var _onPageScrollStateChanged: ((Int) -> Unit)? = null

    override fun onPageScrolled(position: Int, positionOffset: Float, positionOffsetPixels: Int) {
        _onPageScrolled?.invoke(position, positionOffset, positionOffsetPixels)
    }

    fun onPageScrolled(listener: (Int, Float, Int) -> Unit) {
        _onPageScrolled = listener
    }

    override fun onPageSelected(position: Int) {
        _onPageSelected?.invoke(position)
    }

    fun onPageSelected(listener: (Int) -> Unit) {
        _onPageSelected = listener
    }

    override fun onPageScrollStateChanged(state: Int) {
        _onPageScrollStateChanged?.invoke(state)
    }

    fun onPageScrollStateChanged(listener: (Int) -> Unit) {
        _onPageScrollStateChanged = listener
    }

}

inline fun androidx.fragment.app.FragmentTabHost.onTabChanged(noinline l: (tabId: String?) -> Unit) {
    setOnTabChangedListener(l)
}

inline fun androidx.core.widget.NestedScrollView.onScrollChange(noinline l: (v: androidx.core.widget.NestedScrollView?, scrollX: Int, scrollY: Int, oldScrollX: Int, oldScrollY: Int) -> Unit) {
    setOnScrollChangeListener(l)
}

inline fun androidx.swiperefreshlayout.widget.SwipeRefreshLayout.onRefresh(noinline l: () -> Unit) {
    setOnRefreshListener(l)
}

