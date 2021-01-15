@file:JvmName("RecyclerviewV7ListenersListenersKt")
package org.jetbrains.anko.recyclerview.v7.listeners


fun androidx.recyclerview.widget.RecyclerView.onChildAttachStateChangeListener(init: __RecyclerView_OnChildAttachStateChangeListener.() -> Unit) {
    val listener = __RecyclerView_OnChildAttachStateChangeListener()
    listener.init()
    addOnChildAttachStateChangeListener(listener)
}

class __RecyclerView_OnChildAttachStateChangeListener : androidx.recyclerview.widget.RecyclerView.OnChildAttachStateChangeListener {

    private var _onChildViewAttachedToWindow: ((android.view.View?) -> Unit)? = null

    override fun onChildViewAttachedToWindow(view: android.view.View) {
        _onChildViewAttachedToWindow?.invoke(view)
    }

    fun onChildViewAttachedToWindow(listener: (android.view.View?) -> Unit) {
        _onChildViewAttachedToWindow = listener
    }

    private var _onChildViewDetachedFromWindow: ((android.view.View?) -> Unit)? = null

    override fun onChildViewDetachedFromWindow(view: android.view.View) {
        _onChildViewDetachedFromWindow?.invoke(view)
    }

    fun onChildViewDetachedFromWindow(listener: (android.view.View?) -> Unit) {
        _onChildViewDetachedFromWindow = listener
    }

}

fun androidx.recyclerview.widget.RecyclerView.onItemTouchListener(init: __RecyclerView_OnItemTouchListener.() -> Unit) {
    val listener = __RecyclerView_OnItemTouchListener()
    listener.init()
    addOnItemTouchListener(listener)
}

class __RecyclerView_OnItemTouchListener : androidx.recyclerview.widget.RecyclerView.OnItemTouchListener {

    private var _onInterceptTouchEvent: ((androidx.recyclerview.widget.RecyclerView?, android.view.MotionEvent?) -> Boolean)? = null

    override fun onInterceptTouchEvent(rv: androidx.recyclerview.widget.RecyclerView, e: android.view.MotionEvent) = _onInterceptTouchEvent?.invoke(rv, e) ?: false

    fun onInterceptTouchEvent(listener: (androidx.recyclerview.widget.RecyclerView?, android.view.MotionEvent?) -> Boolean) {
        _onInterceptTouchEvent = listener
    }

    private var _onTouchEvent: ((androidx.recyclerview.widget.RecyclerView?, android.view.MotionEvent?) -> Unit)? = null

    override fun onTouchEvent(rv: androidx.recyclerview.widget.RecyclerView, e: android.view.MotionEvent) {
        _onTouchEvent?.invoke(rv, e)
    }

    fun onTouchEvent(listener: (androidx.recyclerview.widget.RecyclerView?, android.view.MotionEvent?) -> Unit) {
        _onTouchEvent = listener
    }

    private var _onRequestDisallowInterceptTouchEvent: ((Boolean) -> Unit)? = null

    override fun onRequestDisallowInterceptTouchEvent(disallowIntercept: Boolean) {
        _onRequestDisallowInterceptTouchEvent?.invoke(disallowIntercept)
    }

    fun onRequestDisallowInterceptTouchEvent(listener: (Boolean) -> Unit) {
        _onRequestDisallowInterceptTouchEvent = listener
    }

}

