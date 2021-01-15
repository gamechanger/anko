@file:JvmName("DesignCoroutinesListenersWithCoroutinesKt")
package org.jetbrains.anko.design.coroutines


import kotlin.coroutines.CoroutineContext
import kotlinx.coroutines.*

fun com.google.android.material.appbar.AppBarLayout.onOffsetChanged(
        context: CoroutineContext = Dispatchers.Main,
        handler: suspend CoroutineScope.(appBarLayout: com.google.android.material.appbar.AppBarLayout?, verticalOffset: Int) -> Unit
) {
    addOnOffsetChangedListener({ appBarLayout: com.google.android.material.appbar.AppBarLayout, verticalOffset: Int ->
        GlobalScope.launch(context, CoroutineStart.DEFAULT) {
            handler(appBarLayout, verticalOffset)
        }
    } as com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener)
}

fun com.google.android.material.tabs.TabLayout.onTabSelectedListener(
        context: CoroutineContext = Dispatchers.Main,
        init: __TabLayout_OnTabSelectedListener.() -> Unit
) {
    val listener = __TabLayout_OnTabSelectedListener(context)
    listener.init()
    addOnTabSelectedListener(listener)
}

class __TabLayout_OnTabSelectedListener(private val context: CoroutineContext) : com.google.android.material.tabs.TabLayout.OnTabSelectedListener {

    private var _onTabSelected: (suspend CoroutineScope.(com.google.android.material.tabs.TabLayout.Tab?) -> Unit)? = null
    

    override fun onTabSelected(tab: com.google.android.material.tabs.TabLayout.Tab?) {
        val handler = _onTabSelected ?: return
        GlobalScope.launch(context) {
            handler(tab)
        }
    }

    fun onTabSelected(
            listener: suspend CoroutineScope.(com.google.android.material.tabs.TabLayout.Tab?) -> Unit
    ) {
        _onTabSelected = listener
    }

    private var _onTabUnselected: (suspend CoroutineScope.(com.google.android.material.tabs.TabLayout.Tab?) -> Unit)? = null
    

    override fun onTabUnselected(tab: com.google.android.material.tabs.TabLayout.Tab?) {
        val handler = _onTabUnselected ?: return
        GlobalScope.launch(context) {
            handler(tab)
        }
    }

    fun onTabUnselected(
            listener: suspend CoroutineScope.(com.google.android.material.tabs.TabLayout.Tab?) -> Unit
    ) {
        _onTabUnselected = listener
    }

    private var _onTabReselected: (suspend CoroutineScope.(com.google.android.material.tabs.TabLayout.Tab?) -> Unit)? = null
    

    override fun onTabReselected(tab: com.google.android.material.tabs.TabLayout.Tab?) {
        val handler = _onTabReselected ?: return
        GlobalScope.launch(context) {
            handler(tab)
        }
    }

    fun onTabReselected(
            listener: suspend CoroutineScope.(com.google.android.material.tabs.TabLayout.Tab?) -> Unit
    ) {
        _onTabReselected = listener
    }

}fun com.google.android.material.bottomnavigation.BottomNavigationView.onNavigationItemSelected(
        context: CoroutineContext = Dispatchers.Main,
        returnValue: Boolean = false,
        handler: suspend CoroutineScope.(item: android.view.MenuItem?) -> Unit
) {
    setOnNavigationItemSelectedListener { item ->
        GlobalScope.launch(context, CoroutineStart.DEFAULT) {
            handler(item)
        }
        returnValue
    }
}

fun androidx.coordinatorlayout.widget.CoordinatorLayout.onHierarchyChangeListener(
        context: CoroutineContext = Dispatchers.Main,
        init: __ViewGroup_OnHierarchyChangeListener.() -> Unit
) {
    val listener = __ViewGroup_OnHierarchyChangeListener(context)
    listener.init()
    setOnHierarchyChangeListener(listener)
}

class __ViewGroup_OnHierarchyChangeListener(private val context: CoroutineContext) : android.view.ViewGroup.OnHierarchyChangeListener {

    private var _onChildViewAdded: (suspend CoroutineScope.(android.view.View?, android.view.View?) -> Unit)? = null
    

    override fun onChildViewAdded(parent: android.view.View?, child: android.view.View?) {
        val handler = _onChildViewAdded ?: return
        GlobalScope.launch(context) {
            handler(parent, child)
        }
    }

    fun onChildViewAdded(
            listener: suspend CoroutineScope.(android.view.View?, android.view.View?) -> Unit
    ) {
        _onChildViewAdded = listener
    }

    private var _onChildViewRemoved: (suspend CoroutineScope.(android.view.View?, android.view.View?) -> Unit)? = null
    

    override fun onChildViewRemoved(parent: android.view.View?, child: android.view.View?) {
        val handler = _onChildViewRemoved ?: return
        GlobalScope.launch(context) {
            handler(parent, child)
        }
    }

    fun onChildViewRemoved(
            listener: suspend CoroutineScope.(android.view.View?, android.view.View?) -> Unit
    ) {
        _onChildViewRemoved = listener
    }

}