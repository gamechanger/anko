@file:JvmName("DesignListenersListenersKt")
package org.jetbrains.anko.design.listeners

import com.google.android.material.appbar.AppBarLayout


inline fun com.google.android.material.appbar.AppBarLayout.onOffsetChanged(noinline l: (appBarLayout: com.google.android.material.appbar.AppBarLayout, verticalOffset: Int) -> Unit) {
    addOnOffsetChangedListener(l as AppBarLayout.OnOffsetChangedListener)
}

fun com.google.android.material.tabs.TabLayout.onTabSelectedListener(init: __TabLayout_OnTabSelectedListener.() -> Unit) {
    val listener = __TabLayout_OnTabSelectedListener()
    listener.init()
    addOnTabSelectedListener(listener)
}

class __TabLayout_OnTabSelectedListener : com.google.android.material.tabs.TabLayout.OnTabSelectedListener {

    private var _onTabSelected: ((com.google.android.material.tabs.TabLayout.Tab?) -> Unit)? = null

    override fun onTabSelected(tab: com.google.android.material.tabs.TabLayout.Tab?) {
        _onTabSelected?.invoke(tab)
    }

    fun onTabSelected(listener: (com.google.android.material.tabs.TabLayout.Tab?) -> Unit) {
        _onTabSelected = listener
    }

    private var _onTabUnselected: ((com.google.android.material.tabs.TabLayout.Tab?) -> Unit)? = null

    override fun onTabUnselected(tab: com.google.android.material.tabs.TabLayout.Tab?) {
        _onTabUnselected?.invoke(tab)
    }

    fun onTabUnselected(listener: (com.google.android.material.tabs.TabLayout.Tab?) -> Unit) {
        _onTabUnselected = listener
    }

    private var _onTabReselected: ((com.google.android.material.tabs.TabLayout.Tab?) -> Unit)? = null

    override fun onTabReselected(tab: com.google.android.material.tabs.TabLayout.Tab?) {
        _onTabReselected?.invoke(tab)
    }

    fun onTabReselected(listener: (com.google.android.material.tabs.TabLayout.Tab?) -> Unit) {
        _onTabReselected = listener
    }

}

inline fun com.google.android.material.bottomnavigation.BottomNavigationView.onNavigationItemSelected(noinline l: (item: android.view.MenuItem?) -> Boolean) {
    setOnNavigationItemSelectedListener(l)
}

fun androidx.coordinatorlayout.widget.CoordinatorLayout.onHierarchyChangeListener(init: __ViewGroup_OnHierarchyChangeListener.() -> Unit) {
    val listener = __ViewGroup_OnHierarchyChangeListener()
    listener.init()
    setOnHierarchyChangeListener(listener)
}

class __ViewGroup_OnHierarchyChangeListener : android.view.ViewGroup.OnHierarchyChangeListener {

    private var _onChildViewAdded: ((android.view.View?, android.view.View?) -> Unit)? = null

    override fun onChildViewAdded(parent: android.view.View?, child: android.view.View?) {
        _onChildViewAdded?.invoke(parent, child)
    }

    fun onChildViewAdded(listener: (android.view.View?, android.view.View?) -> Unit) {
        _onChildViewAdded = listener
    }

    private var _onChildViewRemoved: ((android.view.View?, android.view.View?) -> Unit)? = null

    override fun onChildViewRemoved(parent: android.view.View?, child: android.view.View?) {
        _onChildViewRemoved?.invoke(parent, child)
    }

    fun onChildViewRemoved(listener: (android.view.View?, android.view.View?) -> Unit) {
        _onChildViewRemoved = listener
    }

}

