@file:JvmName("AppcompatV7ViewsKt")
package org.jetbrains.anko.appcompat.v7

import android.app.Activity
import android.content.Context
import android.view.ViewManager
import android.widget.*
import org.jetbrains.anko.AnkoViewDslMarker
import org.jetbrains.anko.custom.ankoView

@PublishedApi
internal object `$$Anko$Factories$AppcompatV7View` {
    val ACTION_MENU_ITEM_VIEW = { ctx: Context -> androidx.appcompat.view.menu.ActionMenuItemView(ctx) }
    val EXPANDED_MENU_VIEW = { ctx: Context -> androidx.appcompat.view.menu.ExpandedMenuView(ctx, null) }
    val ACTION_BAR_CONTEXT_VIEW = { ctx: Context -> androidx.appcompat.widget.ActionBarContextView(ctx) }
    val ACTIVITY_CHOOSER_VIEW = { ctx: Context -> androidx.appcompat.widget.ActivityChooserView(ctx) }
    val TINTED_AUTO_COMPLETE_TEXT_VIEW = { ctx: Context -> AutoCompleteTextView(ctx) }
    val TINTED_BUTTON = { ctx: Context -> Button(ctx) }
    val TINTED_CHECK_BOX = { ctx: Context -> CheckBox(ctx) }
    val TINTED_CHECKED_TEXT_VIEW = { ctx: Context -> CheckedTextView(ctx) }
    val TINTED_EDIT_TEXT = { ctx: Context -> EditText(ctx) }
    val TINTED_IMAGE_BUTTON = { ctx: Context -> ImageButton(ctx) }
    val TINTED_IMAGE_VIEW = { ctx: Context -> ImageView(ctx) }
    val TINTED_MULTI_AUTO_COMPLETE_TEXT_VIEW = { ctx: Context -> MultiAutoCompleteTextView(ctx) }
    val TINTED_RADIO_BUTTON = { ctx: Context -> RadioButton(ctx) }
    val TINTED_RATING_BAR = { ctx: Context -> RatingBar(ctx) }
    val TINTED_SEEK_BAR = { ctx: Context -> SeekBar(ctx) }
    val TINTED_SPINNER = { ctx: Context -> Spinner(ctx) }
    val TINTED_TEXT_VIEW = { ctx: Context -> TextView(ctx) }
    val CONTENT_FRAME_LAYOUT = { ctx: Context -> androidx.appcompat.widget.ContentFrameLayout(ctx) }
    val DIALOG_TITLE = { ctx: Context -> androidx.appcompat.widget.DialogTitle(ctx) }
    val FIT_WINDOWS_FRAME_LAYOUT = { ctx: Context -> androidx.appcompat.widget.FitWindowsFrameLayout(ctx) }
    val FIT_WINDOWS_LINEAR_LAYOUT = { ctx: Context -> androidx.appcompat.widget.FitWindowsLinearLayout(ctx) }
    val SEARCH_VIEW = { ctx: Context -> androidx.appcompat.widget.SearchView(ctx) }
    val SWITCH_COMPAT = { ctx: Context -> androidx.appcompat.widget.SwitchCompat(ctx) }
    val VIEW_STUB_COMPAT = { ctx: Context -> androidx.appcompat.widget.ViewStubCompat(ctx, null) }
}

inline fun ViewManager.actionMenuItemView(): androidx.appcompat.view.menu.ActionMenuItemView = actionMenuItemView() {}
inline fun ViewManager.actionMenuItemView(init: (@AnkoViewDslMarker androidx.appcompat.view.menu.ActionMenuItemView).() -> Unit): androidx.appcompat.view.menu.ActionMenuItemView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTION_MENU_ITEM_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedActionMenuItemView(theme: Int = 0): androidx.appcompat.view.menu.ActionMenuItemView = themedActionMenuItemView(theme) {}
inline fun ViewManager.themedActionMenuItemView(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.view.menu.ActionMenuItemView).() -> Unit): androidx.appcompat.view.menu.ActionMenuItemView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTION_MENU_ITEM_VIEW, theme) { init() }
}

inline fun ViewManager.expandedMenuView(): androidx.appcompat.view.menu.ExpandedMenuView = expandedMenuView() {}
inline fun ViewManager.expandedMenuView(init: (@AnkoViewDslMarker androidx.appcompat.view.menu.ExpandedMenuView).() -> Unit): androidx.appcompat.view.menu.ExpandedMenuView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.EXPANDED_MENU_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedExpandedMenuView(theme: Int = 0): androidx.appcompat.view.menu.ExpandedMenuView = themedExpandedMenuView(theme) {}
inline fun ViewManager.themedExpandedMenuView(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.view.menu.ExpandedMenuView).() -> Unit): androidx.appcompat.view.menu.ExpandedMenuView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.EXPANDED_MENU_VIEW, theme) { init() }
}

inline fun Context.expandedMenuView(): androidx.appcompat.view.menu.ExpandedMenuView = expandedMenuView() {}
inline fun Context.expandedMenuView(init: (@AnkoViewDslMarker androidx.appcompat.view.menu.ExpandedMenuView).() -> Unit): androidx.appcompat.view.menu.ExpandedMenuView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.EXPANDED_MENU_VIEW, theme = 0) { init() }
}

inline fun Context.themedExpandedMenuView(theme: Int = 0): androidx.appcompat.view.menu.ExpandedMenuView = themedExpandedMenuView(theme) {}
inline fun Context.themedExpandedMenuView(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.view.menu.ExpandedMenuView).() -> Unit): androidx.appcompat.view.menu.ExpandedMenuView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.EXPANDED_MENU_VIEW, theme) { init() }
}

inline fun Activity.expandedMenuView(): androidx.appcompat.view.menu.ExpandedMenuView = expandedMenuView() {}
inline fun Activity.expandedMenuView(init: (@AnkoViewDslMarker androidx.appcompat.view.menu.ExpandedMenuView).() -> Unit): androidx.appcompat.view.menu.ExpandedMenuView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.EXPANDED_MENU_VIEW, theme = 0) { init() }
}

inline fun Activity.themedExpandedMenuView(theme: Int = 0): androidx.appcompat.view.menu.ExpandedMenuView = themedExpandedMenuView(theme) {}
inline fun Activity.themedExpandedMenuView(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.view.menu.ExpandedMenuView).() -> Unit): androidx.appcompat.view.menu.ExpandedMenuView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.EXPANDED_MENU_VIEW, theme) { init() }
}

inline fun ViewManager.actionBarContextView(): androidx.appcompat.widget.ActionBarContextView = actionBarContextView() {}
inline fun ViewManager.actionBarContextView(init: (@AnkoViewDslMarker androidx.appcompat.widget.ActionBarContextView).() -> Unit): androidx.appcompat.widget.ActionBarContextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTION_BAR_CONTEXT_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedActionBarContextView(theme: Int = 0): androidx.appcompat.widget.ActionBarContextView = themedActionBarContextView(theme) {}
inline fun ViewManager.themedActionBarContextView(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.ActionBarContextView).() -> Unit): androidx.appcompat.widget.ActionBarContextView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTION_BAR_CONTEXT_VIEW, theme) { init() }
}

inline fun Context.actionBarContextView(): androidx.appcompat.widget.ActionBarContextView = actionBarContextView() {}
inline fun Context.actionBarContextView(init: (@AnkoViewDslMarker androidx.appcompat.widget.ActionBarContextView).() -> Unit): androidx.appcompat.widget.ActionBarContextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTION_BAR_CONTEXT_VIEW, theme = 0) { init() }
}

inline fun Context.themedActionBarContextView(theme: Int = 0): androidx.appcompat.widget.ActionBarContextView = themedActionBarContextView(theme) {}
inline fun Context.themedActionBarContextView(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.ActionBarContextView).() -> Unit): androidx.appcompat.widget.ActionBarContextView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTION_BAR_CONTEXT_VIEW, theme) { init() }
}

inline fun Activity.actionBarContextView(): androidx.appcompat.widget.ActionBarContextView = actionBarContextView() {}
inline fun Activity.actionBarContextView(init: (@AnkoViewDslMarker androidx.appcompat.widget.ActionBarContextView).() -> Unit): androidx.appcompat.widget.ActionBarContextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTION_BAR_CONTEXT_VIEW, theme = 0) { init() }
}

inline fun Activity.themedActionBarContextView(theme: Int = 0): androidx.appcompat.widget.ActionBarContextView = themedActionBarContextView(theme) {}
inline fun Activity.themedActionBarContextView(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.ActionBarContextView).() -> Unit): androidx.appcompat.widget.ActionBarContextView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTION_BAR_CONTEXT_VIEW, theme) { init() }
}

inline fun ViewManager.activityChooserView(): androidx.appcompat.widget.ActivityChooserView = activityChooserView() {}
inline fun ViewManager.activityChooserView(init: (@AnkoViewDslMarker androidx.appcompat.widget.ActivityChooserView).() -> Unit): androidx.appcompat.widget.ActivityChooserView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTIVITY_CHOOSER_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedActivityChooserView(theme: Int = 0): androidx.appcompat.widget.ActivityChooserView = themedActivityChooserView(theme) {}
inline fun ViewManager.themedActivityChooserView(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.ActivityChooserView).() -> Unit): androidx.appcompat.widget.ActivityChooserView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTIVITY_CHOOSER_VIEW, theme) { init() }
}

inline fun Context.activityChooserView(): androidx.appcompat.widget.ActivityChooserView = activityChooserView() {}
inline fun Context.activityChooserView(init: (@AnkoViewDslMarker androidx.appcompat.widget.ActivityChooserView).() -> Unit): androidx.appcompat.widget.ActivityChooserView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTIVITY_CHOOSER_VIEW, theme = 0) { init() }
}

inline fun Context.themedActivityChooserView(theme: Int = 0): androidx.appcompat.widget.ActivityChooserView = themedActivityChooserView(theme) {}
inline fun Context.themedActivityChooserView(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.ActivityChooserView).() -> Unit): androidx.appcompat.widget.ActivityChooserView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTIVITY_CHOOSER_VIEW, theme) { init() }
}

inline fun Activity.activityChooserView(): androidx.appcompat.widget.ActivityChooserView = activityChooserView() {}
inline fun Activity.activityChooserView(init: (@AnkoViewDslMarker androidx.appcompat.widget.ActivityChooserView).() -> Unit): androidx.appcompat.widget.ActivityChooserView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTIVITY_CHOOSER_VIEW, theme = 0) { init() }
}

inline fun Activity.themedActivityChooserView(theme: Int = 0): androidx.appcompat.widget.ActivityChooserView = themedActivityChooserView(theme) {}
inline fun Activity.themedActivityChooserView(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.ActivityChooserView).() -> Unit): androidx.appcompat.widget.ActivityChooserView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.ACTIVITY_CHOOSER_VIEW, theme) { init() }
}

inline fun ViewManager.tintedAutoCompleteTextView(): AutoCompleteTextView = tintedAutoCompleteTextView() {}
inline fun ViewManager.tintedAutoCompleteTextView(init: (@AnkoViewDslMarker AutoCompleteTextView).() -> Unit): AutoCompleteTextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_AUTO_COMPLETE_TEXT_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedTintedAutoCompleteTextView(theme: Int = 0): AutoCompleteTextView = themedTintedAutoCompleteTextView(theme) {}
inline fun ViewManager.themedTintedAutoCompleteTextView(theme: Int = 0, init: (@AnkoViewDslMarker AutoCompleteTextView).() -> Unit): AutoCompleteTextView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_AUTO_COMPLETE_TEXT_VIEW, theme) { init() }
}

inline fun ViewManager.tintedButton(): Button = tintedButton() {}
inline fun ViewManager.tintedButton(init: (@AnkoViewDslMarker Button).() -> Unit): Button {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_BUTTON, theme = 0) { init() }
}

inline fun ViewManager.themedTintedButton(theme: Int = 0): Button = themedTintedButton(theme) {}
inline fun ViewManager.themedTintedButton(theme: Int = 0, init: (@AnkoViewDslMarker Button).() -> Unit): Button {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_BUTTON, theme) { init() }
}

inline fun ViewManager.tintedButton(text: CharSequence?): Button {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_BUTTON, theme = 0) {
        setText(text)
    }
}
inline fun ViewManager.tintedButton(text: CharSequence?, init: (@AnkoViewDslMarker Button).() -> Unit): Button {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_BUTTON, theme = 0) {
        init()
        setText(text)
    }
}
inline fun ViewManager.themedTintedButton(text: CharSequence?, theme: Int): Button {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_BUTTON, theme) {
        setText(text)
    }
}
inline fun ViewManager.themedTintedButton(text: CharSequence?, theme: Int, init: (@AnkoViewDslMarker Button).() -> Unit): Button {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_BUTTON, theme) {
        init()
        setText(text)
    }
}

inline fun ViewManager.tintedButton(text: Int): Button {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_BUTTON, theme = 0) {
        setText(text)
    }
}
inline fun ViewManager.tintedButton(text: Int, init: (@AnkoViewDslMarker Button).() -> Unit): Button {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_BUTTON, theme = 0) {
        init()
        setText(text)
    }
}
inline fun ViewManager.themedTintedButton(text: Int, theme: Int): Button {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_BUTTON, theme) {
        setText(text)
    }
}
inline fun ViewManager.themedTintedButton(text: Int, theme: Int, init: (@AnkoViewDslMarker Button).() -> Unit): Button {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_BUTTON, theme) {
        init()
        setText(text)
    }
}

inline fun ViewManager.tintedCheckBox(): CheckBox = tintedCheckBox() {}
inline fun ViewManager.tintedCheckBox(init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme = 0) { init() }
}

inline fun ViewManager.themedTintedCheckBox(theme: Int = 0): CheckBox = themedTintedCheckBox(theme) {}
inline fun ViewManager.themedTintedCheckBox(theme: Int = 0, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme) { init() }
}

inline fun ViewManager.tintedCheckBox(text: CharSequence?): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme = 0) {
        setText(text)
    }
}
inline fun ViewManager.tintedCheckBox(text: CharSequence?, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme = 0) {
        init()
        setText(text)
    }
}
inline fun ViewManager.themedTintedCheckBox(text: CharSequence?, theme: Int): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme) {
        setText(text)
    }
}
inline fun ViewManager.themedTintedCheckBox(text: CharSequence?, theme: Int, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme) {
        init()
        setText(text)
    }
}

inline fun ViewManager.tintedCheckBox(text: Int): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme = 0) {
        setText(text)
    }
}
inline fun ViewManager.tintedCheckBox(text: Int, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme = 0) {
        init()
        setText(text)
    }
}
inline fun ViewManager.themedTintedCheckBox(text: Int, theme: Int): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme) {
        setText(text)
    }
}
inline fun ViewManager.themedTintedCheckBox(text: Int, theme: Int, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme) {
        init()
        setText(text)
    }
}

inline fun ViewManager.tintedCheckBox(text: CharSequence?, checked: Boolean): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme = 0) {
        setText(text)
        setChecked(checked)
    }
}
inline fun ViewManager.tintedCheckBox(text: CharSequence?, checked: Boolean, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme = 0) {
        init()
        setText(text)
        setChecked(checked)
    }
}
inline fun ViewManager.themedTintedCheckBox(text: CharSequence?, checked: Boolean, theme: Int): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme) {
        setText(text)
        setChecked(checked)
    }
}
inline fun ViewManager.themedTintedCheckBox(text: CharSequence?, checked: Boolean, theme: Int, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme) {
        init()
        setText(text)
        setChecked(checked)
    }
}

inline fun ViewManager.tintedCheckBox(text: Int, checked: Boolean): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme = 0) {
        setText(text)
        setChecked(checked)
    }
}
inline fun ViewManager.tintedCheckBox(text: Int, checked: Boolean, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme = 0) {
        init()
        setText(text)
        setChecked(checked)
    }
}
inline fun ViewManager.themedTintedCheckBox(text: Int, checked: Boolean, theme: Int): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme) {
        setText(text)
        setChecked(checked)
    }
}
inline fun ViewManager.themedTintedCheckBox(text: Int, checked: Boolean, theme: Int, init: (@AnkoViewDslMarker CheckBox).() -> Unit): CheckBox {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECK_BOX, theme) {
        init()
        setText(text)
        setChecked(checked)
    }
}

inline fun ViewManager.tintedCheckedTextView(): CheckedTextView = tintedCheckedTextView() {}
inline fun ViewManager.tintedCheckedTextView(init: (@AnkoViewDslMarker CheckedTextView).() -> Unit): CheckedTextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECKED_TEXT_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedTintedCheckedTextView(theme: Int = 0): CheckedTextView = themedTintedCheckedTextView(theme) {}
inline fun ViewManager.themedTintedCheckedTextView(theme: Int = 0, init: (@AnkoViewDslMarker CheckedTextView).() -> Unit): CheckedTextView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_CHECKED_TEXT_VIEW, theme) { init() }
}

inline fun ViewManager.tintedEditText(): EditText = tintedEditText() {}
inline fun ViewManager.tintedEditText(init: (@AnkoViewDslMarker EditText).() -> Unit): EditText {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_EDIT_TEXT, theme = 0) { init() }
}

inline fun ViewManager.themedTintedEditText(theme: Int = 0): EditText = themedTintedEditText(theme) {}
inline fun ViewManager.themedTintedEditText(theme: Int = 0, init: (@AnkoViewDslMarker EditText).() -> Unit): EditText {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_EDIT_TEXT, theme) { init() }
}

inline fun ViewManager.tintedEditText(text: CharSequence?): EditText {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_EDIT_TEXT, theme = 0) {
        setText(text)
    }
}
inline fun ViewManager.tintedEditText(text: CharSequence?, init: (@AnkoViewDslMarker EditText).() -> Unit): EditText {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_EDIT_TEXT, theme = 0) {
        init()
        setText(text)
    }
}
inline fun ViewManager.themedTintedEditText(text: CharSequence?, theme: Int): EditText {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_EDIT_TEXT, theme) {
        setText(text)
    }
}
inline fun ViewManager.themedTintedEditText(text: CharSequence?, theme: Int, init: (@AnkoViewDslMarker EditText).() -> Unit): EditText {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_EDIT_TEXT, theme) {
        init()
        setText(text)
    }
}

inline fun ViewManager.tintedEditText(text: Int): EditText {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_EDIT_TEXT, theme = 0) {
        setText(text)
    }
}
inline fun ViewManager.tintedEditText(text: Int, init: (@AnkoViewDslMarker EditText).() -> Unit): EditText {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_EDIT_TEXT, theme = 0) {
        init()
        setText(text)
    }
}
inline fun ViewManager.themedTintedEditText(text: Int, theme: Int): EditText {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_EDIT_TEXT, theme) {
        setText(text)
    }
}
inline fun ViewManager.themedTintedEditText(text: Int, theme: Int, init: (@AnkoViewDslMarker EditText).() -> Unit): EditText {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_EDIT_TEXT, theme) {
        init()
        setText(text)
    }
}

inline fun ViewManager.tintedImageButton(): ImageButton = tintedImageButton() {}
inline fun ViewManager.tintedImageButton(init: (@AnkoViewDslMarker ImageButton).() -> Unit): ImageButton {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_BUTTON, theme = 0) { init() }
}

inline fun ViewManager.themedTintedImageButton(theme: Int = 0): ImageButton = themedTintedImageButton(theme) {}
inline fun ViewManager.themedTintedImageButton(theme: Int = 0, init: (@AnkoViewDslMarker ImageButton).() -> Unit): ImageButton {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_BUTTON, theme) { init() }
}

inline fun ViewManager.tintedImageButton(imageDrawable: android.graphics.drawable.Drawable?): ImageButton {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_BUTTON, theme = 0) {
        setImageDrawable(imageDrawable)
    }
}
inline fun ViewManager.tintedImageButton(imageDrawable: android.graphics.drawable.Drawable?, init: (@AnkoViewDslMarker ImageButton).() -> Unit): ImageButton {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_BUTTON, theme = 0) {
        init()
        setImageDrawable(imageDrawable)
    }
}
inline fun ViewManager.themedTintedImageButton(imageDrawable: android.graphics.drawable.Drawable?, theme: Int): ImageButton {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_BUTTON, theme) {
        setImageDrawable(imageDrawable)
    }
}
inline fun ViewManager.themedTintedImageButton(imageDrawable: android.graphics.drawable.Drawable?, theme: Int, init: (@AnkoViewDslMarker ImageButton).() -> Unit): ImageButton {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_BUTTON, theme) {
        init()
        setImageDrawable(imageDrawable)
    }
}

inline fun ViewManager.tintedImageButton(imageResource: Int): ImageButton {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_BUTTON, theme = 0) {
        setImageResource(imageResource)
    }
}
inline fun ViewManager.tintedImageButton(imageResource: Int, init: (@AnkoViewDslMarker ImageButton).() -> Unit): ImageButton {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_BUTTON, theme = 0) {
        init()
        setImageResource(imageResource)
    }
}
inline fun ViewManager.themedTintedImageButton(imageResource: Int, theme: Int): ImageButton {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_BUTTON, theme) {
        setImageResource(imageResource)
    }
}
inline fun ViewManager.themedTintedImageButton(imageResource: Int, theme: Int, init: (@AnkoViewDslMarker ImageButton).() -> Unit): ImageButton {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_BUTTON, theme) {
        init()
        setImageResource(imageResource)
    }
}

inline fun ViewManager.tintedImageView(): ImageView = tintedImageView() {}
inline fun ViewManager.tintedImageView(init: (@AnkoViewDslMarker ImageView).() -> Unit): ImageView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedTintedImageView(theme: Int = 0): ImageView = themedTintedImageView(theme) {}
inline fun ViewManager.themedTintedImageView(theme: Int = 0, init: (@AnkoViewDslMarker ImageView).() -> Unit): ImageView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_VIEW, theme) { init() }
}

inline fun ViewManager.tintedImageView(imageDrawable: android.graphics.drawable.Drawable?): ImageView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_VIEW, theme = 0) {
        setImageDrawable(imageDrawable)
    }
}
inline fun ViewManager.tintedImageView(imageDrawable: android.graphics.drawable.Drawable?, init: (@AnkoViewDslMarker ImageView).() -> Unit): ImageView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_VIEW, theme = 0) {
        init()
        setImageDrawable(imageDrawable)
    }
}
inline fun ViewManager.themedTintedImageView(imageDrawable: android.graphics.drawable.Drawable?, theme: Int): ImageView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_VIEW, theme) {
        setImageDrawable(imageDrawable)
    }
}
inline fun ViewManager.themedTintedImageView(imageDrawable: android.graphics.drawable.Drawable?, theme: Int, init: (@AnkoViewDslMarker ImageView).() -> Unit): ImageView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_VIEW, theme) {
        init()
        setImageDrawable(imageDrawable)
    }
}

inline fun ViewManager.tintedImageView(imageResource: Int): ImageView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_VIEW, theme = 0) {
        setImageResource(imageResource)
    }
}
inline fun ViewManager.tintedImageView(imageResource: Int, init: (@AnkoViewDslMarker ImageView).() -> Unit): ImageView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_VIEW, theme = 0) {
        init()
        setImageResource(imageResource)
    }
}
inline fun ViewManager.themedTintedImageView(imageResource: Int, theme: Int): ImageView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_VIEW, theme) {
        setImageResource(imageResource)
    }
}
inline fun ViewManager.themedTintedImageView(imageResource: Int, theme: Int, init: (@AnkoViewDslMarker ImageView).() -> Unit): ImageView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_IMAGE_VIEW, theme) {
        init()
        setImageResource(imageResource)
    }
}

inline fun ViewManager.tintedMultiAutoCompleteTextView(): MultiAutoCompleteTextView = tintedMultiAutoCompleteTextView() {}
inline fun ViewManager.tintedMultiAutoCompleteTextView(init: (@AnkoViewDslMarker MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_MULTI_AUTO_COMPLETE_TEXT_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedTintedMultiAutoCompleteTextView(theme: Int = 0): MultiAutoCompleteTextView = themedTintedMultiAutoCompleteTextView(theme) {}
inline fun ViewManager.themedTintedMultiAutoCompleteTextView(theme: Int = 0, init: (@AnkoViewDslMarker MultiAutoCompleteTextView).() -> Unit): MultiAutoCompleteTextView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_MULTI_AUTO_COMPLETE_TEXT_VIEW, theme) { init() }
}

inline fun ViewManager.tintedRadioButton(): RadioButton = tintedRadioButton() {}
inline fun ViewManager.tintedRadioButton(init: (@AnkoViewDslMarker RadioButton).() -> Unit): RadioButton {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_RADIO_BUTTON, theme = 0) { init() }
}

inline fun ViewManager.themedTintedRadioButton(theme: Int = 0): RadioButton = themedTintedRadioButton(theme) {}
inline fun ViewManager.themedTintedRadioButton(theme: Int = 0, init: (@AnkoViewDslMarker RadioButton).() -> Unit): RadioButton {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_RADIO_BUTTON, theme) { init() }
}

inline fun ViewManager.tintedRatingBar(): RatingBar = tintedRatingBar() {}
inline fun ViewManager.tintedRatingBar(init: (@AnkoViewDslMarker RatingBar).() -> Unit): RatingBar {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_RATING_BAR, theme = 0) { init() }
}

inline fun ViewManager.themedTintedRatingBar(theme: Int = 0): RatingBar = themedTintedRatingBar(theme) {}
inline fun ViewManager.themedTintedRatingBar(theme: Int = 0, init: (@AnkoViewDslMarker RatingBar).() -> Unit): RatingBar {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_RATING_BAR, theme) { init() }
}

inline fun ViewManager.tintedSeekBar(): SeekBar = tintedSeekBar() {}
inline fun ViewManager.tintedSeekBar(init: (@AnkoViewDslMarker SeekBar).() -> Unit): SeekBar {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_SEEK_BAR, theme = 0) { init() }
}

inline fun ViewManager.themedTintedSeekBar(theme: Int = 0): SeekBar = themedTintedSeekBar(theme) {}
inline fun ViewManager.themedTintedSeekBar(theme: Int = 0, init: (@AnkoViewDslMarker SeekBar).() -> Unit): SeekBar {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_SEEK_BAR, theme) { init() }
}

inline fun ViewManager.tintedSpinner(): Spinner = tintedSpinner() {}
inline fun ViewManager.tintedSpinner(init: (@AnkoViewDslMarker Spinner).() -> Unit): Spinner {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_SPINNER, theme = 0) { init() }
}

inline fun ViewManager.themedTintedSpinner(theme: Int = 0): Spinner = themedTintedSpinner(theme) {}
inline fun ViewManager.themedTintedSpinner(theme: Int = 0, init: (@AnkoViewDslMarker Spinner).() -> Unit): Spinner {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_SPINNER, theme) { init() }
}

inline fun Context.tintedSpinner(): Spinner = tintedSpinner() {}
inline fun Context.tintedSpinner(init: (@AnkoViewDslMarker Spinner).() -> Unit): Spinner {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_SPINNER, theme = 0) { init() }
}

inline fun Context.themedTintedSpinner(theme: Int = 0): Spinner = themedTintedSpinner(theme) {}
inline fun Context.themedTintedSpinner(theme: Int = 0, init: (@AnkoViewDslMarker Spinner).() -> Unit): Spinner {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_SPINNER, theme) { init() }
}

inline fun Activity.tintedSpinner(): Spinner = tintedSpinner() {}
inline fun Activity.tintedSpinner(init: (@AnkoViewDslMarker Spinner).() -> Unit): Spinner {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_SPINNER, theme = 0) { init() }
}

inline fun Activity.themedTintedSpinner(theme: Int = 0): Spinner = themedTintedSpinner(theme) {}
inline fun Activity.themedTintedSpinner(theme: Int = 0, init: (@AnkoViewDslMarker Spinner).() -> Unit): Spinner {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_SPINNER, theme) { init() }
}

inline fun ViewManager.tintedTextView(): TextView = tintedTextView() {}
inline fun ViewManager.tintedTextView(init: (@AnkoViewDslMarker TextView).() -> Unit): TextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_TEXT_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedTintedTextView(theme: Int = 0): TextView = themedTintedTextView(theme) {}
inline fun ViewManager.themedTintedTextView(theme: Int = 0, init: (@AnkoViewDslMarker TextView).() -> Unit): TextView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_TEXT_VIEW, theme) { init() }
}

inline fun ViewManager.tintedTextView(text: CharSequence?): TextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_TEXT_VIEW, theme = 0) {
        setText(text)
    }
}
inline fun ViewManager.tintedTextView(text: CharSequence?, init: (@AnkoViewDslMarker TextView).() -> Unit): TextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_TEXT_VIEW, theme = 0) {
        init()
        setText(text)
    }
}
inline fun ViewManager.themedTintedTextView(text: CharSequence?, theme: Int): TextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_TEXT_VIEW, theme) {
        setText(text)
    }
}
inline fun ViewManager.themedTintedTextView(text: CharSequence?, theme: Int, init: (@AnkoViewDslMarker TextView).() -> Unit): TextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_TEXT_VIEW, theme) {
        init()
        setText(text)
    }
}

inline fun ViewManager.tintedTextView(text: Int): TextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_TEXT_VIEW, theme = 0) {
        setText(text)
    }
}
inline fun ViewManager.tintedTextView(text: Int, init: (@AnkoViewDslMarker TextView).() -> Unit): TextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_TEXT_VIEW, theme = 0) {
        init()
        setText(text)
    }
}
inline fun ViewManager.themedTintedTextView(text: Int, theme: Int): TextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_TEXT_VIEW, theme) {
        setText(text)
    }
}
inline fun ViewManager.themedTintedTextView(text: Int, theme: Int, init: (@AnkoViewDslMarker TextView).() -> Unit): TextView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.TINTED_TEXT_VIEW, theme) {
        init()
        setText(text)
    }
}

inline fun ViewManager.contentFrameLayout(): androidx.appcompat.widget.ContentFrameLayout = contentFrameLayout() {}
inline fun ViewManager.contentFrameLayout(init: (@AnkoViewDslMarker androidx.appcompat.widget.ContentFrameLayout).() -> Unit): androidx.appcompat.widget.ContentFrameLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.CONTENT_FRAME_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedContentFrameLayout(theme: Int = 0): androidx.appcompat.widget.ContentFrameLayout = themedContentFrameLayout(theme) {}
inline fun ViewManager.themedContentFrameLayout(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.ContentFrameLayout).() -> Unit): androidx.appcompat.widget.ContentFrameLayout {
return ankoView(`$$Anko$Factories$AppcompatV7View`.CONTENT_FRAME_LAYOUT, theme) { init() }
}

inline fun Context.contentFrameLayout(): androidx.appcompat.widget.ContentFrameLayout = contentFrameLayout() {}
inline fun Context.contentFrameLayout(init: (@AnkoViewDslMarker androidx.appcompat.widget.ContentFrameLayout).() -> Unit): androidx.appcompat.widget.ContentFrameLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.CONTENT_FRAME_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedContentFrameLayout(theme: Int = 0): androidx.appcompat.widget.ContentFrameLayout = themedContentFrameLayout(theme) {}
inline fun Context.themedContentFrameLayout(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.ContentFrameLayout).() -> Unit): androidx.appcompat.widget.ContentFrameLayout {
return ankoView(`$$Anko$Factories$AppcompatV7View`.CONTENT_FRAME_LAYOUT, theme) { init() }
}

inline fun Activity.contentFrameLayout(): androidx.appcompat.widget.ContentFrameLayout = contentFrameLayout() {}
inline fun Activity.contentFrameLayout(init: (@AnkoViewDslMarker androidx.appcompat.widget.ContentFrameLayout).() -> Unit): androidx.appcompat.widget.ContentFrameLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.CONTENT_FRAME_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedContentFrameLayout(theme: Int = 0): androidx.appcompat.widget.ContentFrameLayout = themedContentFrameLayout(theme) {}
inline fun Activity.themedContentFrameLayout(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.ContentFrameLayout).() -> Unit): androidx.appcompat.widget.ContentFrameLayout {
return ankoView(`$$Anko$Factories$AppcompatV7View`.CONTENT_FRAME_LAYOUT, theme) { init() }
}

inline fun ViewManager.dialogTitle(): androidx.appcompat.widget.DialogTitle = dialogTitle() {}
inline fun ViewManager.dialogTitle(init: (@AnkoViewDslMarker androidx.appcompat.widget.DialogTitle).() -> Unit): androidx.appcompat.widget.DialogTitle {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.DIALOG_TITLE, theme = 0) { init() }
}

inline fun ViewManager.themedDialogTitle(theme: Int = 0): androidx.appcompat.widget.DialogTitle = themedDialogTitle(theme) {}
inline fun ViewManager.themedDialogTitle(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.DialogTitle).() -> Unit): androidx.appcompat.widget.DialogTitle {
return ankoView(`$$Anko$Factories$AppcompatV7View`.DIALOG_TITLE, theme) { init() }
}

inline fun ViewManager.fitWindowsFrameLayout(): androidx.appcompat.widget.FitWindowsFrameLayout = fitWindowsFrameLayout() {}
inline fun ViewManager.fitWindowsFrameLayout(init: (@AnkoViewDslMarker androidx.appcompat.widget.FitWindowsFrameLayout).() -> Unit): androidx.appcompat.widget.FitWindowsFrameLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.FIT_WINDOWS_FRAME_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedFitWindowsFrameLayout(theme: Int = 0): androidx.appcompat.widget.FitWindowsFrameLayout = themedFitWindowsFrameLayout(theme) {}
inline fun ViewManager.themedFitWindowsFrameLayout(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.FitWindowsFrameLayout).() -> Unit): androidx.appcompat.widget.FitWindowsFrameLayout {
return ankoView(`$$Anko$Factories$AppcompatV7View`.FIT_WINDOWS_FRAME_LAYOUT, theme) { init() }
}

inline fun Context.fitWindowsFrameLayout(): androidx.appcompat.widget.FitWindowsFrameLayout = fitWindowsFrameLayout() {}
inline fun Context.fitWindowsFrameLayout(init: (@AnkoViewDslMarker androidx.appcompat.widget.FitWindowsFrameLayout).() -> Unit): androidx.appcompat.widget.FitWindowsFrameLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.FIT_WINDOWS_FRAME_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedFitWindowsFrameLayout(theme: Int = 0): androidx.appcompat.widget.FitWindowsFrameLayout = themedFitWindowsFrameLayout(theme) {}
inline fun Context.themedFitWindowsFrameLayout(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.FitWindowsFrameLayout).() -> Unit): androidx.appcompat.widget.FitWindowsFrameLayout {
return ankoView(`$$Anko$Factories$AppcompatV7View`.FIT_WINDOWS_FRAME_LAYOUT, theme) { init() }
}

inline fun Activity.fitWindowsFrameLayout(): androidx.appcompat.widget.FitWindowsFrameLayout = fitWindowsFrameLayout() {}
inline fun Activity.fitWindowsFrameLayout(init: (@AnkoViewDslMarker androidx.appcompat.widget.FitWindowsFrameLayout).() -> Unit): androidx.appcompat.widget.FitWindowsFrameLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.FIT_WINDOWS_FRAME_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedFitWindowsFrameLayout(theme: Int = 0): androidx.appcompat.widget.FitWindowsFrameLayout = themedFitWindowsFrameLayout(theme) {}
inline fun Activity.themedFitWindowsFrameLayout(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.FitWindowsFrameLayout).() -> Unit): androidx.appcompat.widget.FitWindowsFrameLayout {
return ankoView(`$$Anko$Factories$AppcompatV7View`.FIT_WINDOWS_FRAME_LAYOUT, theme) { init() }
}

inline fun ViewManager.fitWindowsLinearLayout(): androidx.appcompat.widget.FitWindowsLinearLayout = fitWindowsLinearLayout() {}
inline fun ViewManager.fitWindowsLinearLayout(init: (@AnkoViewDslMarker androidx.appcompat.widget.FitWindowsLinearLayout).() -> Unit): androidx.appcompat.widget.FitWindowsLinearLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.FIT_WINDOWS_LINEAR_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedFitWindowsLinearLayout(theme: Int = 0): androidx.appcompat.widget.FitWindowsLinearLayout = themedFitWindowsLinearLayout(theme) {}
inline fun ViewManager.themedFitWindowsLinearLayout(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.FitWindowsLinearLayout).() -> Unit): androidx.appcompat.widget.FitWindowsLinearLayout {
return ankoView(`$$Anko$Factories$AppcompatV7View`.FIT_WINDOWS_LINEAR_LAYOUT, theme) { init() }
}

inline fun Context.fitWindowsLinearLayout(): androidx.appcompat.widget.FitWindowsLinearLayout = fitWindowsLinearLayout() {}
inline fun Context.fitWindowsLinearLayout(init: (@AnkoViewDslMarker androidx.appcompat.widget.FitWindowsLinearLayout).() -> Unit): androidx.appcompat.widget.FitWindowsLinearLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.FIT_WINDOWS_LINEAR_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedFitWindowsLinearLayout(theme: Int = 0): androidx.appcompat.widget.FitWindowsLinearLayout = themedFitWindowsLinearLayout(theme) {}
inline fun Context.themedFitWindowsLinearLayout(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.FitWindowsLinearLayout).() -> Unit): androidx.appcompat.widget.FitWindowsLinearLayout {
return ankoView(`$$Anko$Factories$AppcompatV7View`.FIT_WINDOWS_LINEAR_LAYOUT, theme) { init() }
}

inline fun Activity.fitWindowsLinearLayout(): androidx.appcompat.widget.FitWindowsLinearLayout = fitWindowsLinearLayout() {}
inline fun Activity.fitWindowsLinearLayout(init: (@AnkoViewDslMarker androidx.appcompat.widget.FitWindowsLinearLayout).() -> Unit): androidx.appcompat.widget.FitWindowsLinearLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.FIT_WINDOWS_LINEAR_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedFitWindowsLinearLayout(theme: Int = 0): androidx.appcompat.widget.FitWindowsLinearLayout = themedFitWindowsLinearLayout(theme) {}
inline fun Activity.themedFitWindowsLinearLayout(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.FitWindowsLinearLayout).() -> Unit): androidx.appcompat.widget.FitWindowsLinearLayout {
return ankoView(`$$Anko$Factories$AppcompatV7View`.FIT_WINDOWS_LINEAR_LAYOUT, theme) { init() }
}

inline fun ViewManager.searchView(): androidx.appcompat.widget.SearchView = searchView() {}
inline fun ViewManager.searchView(init: (@AnkoViewDslMarker androidx.appcompat.widget.SearchView).() -> Unit): androidx.appcompat.widget.SearchView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.SEARCH_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedSearchView(theme: Int = 0): androidx.appcompat.widget.SearchView = themedSearchView(theme) {}
inline fun ViewManager.themedSearchView(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.SearchView).() -> Unit): androidx.appcompat.widget.SearchView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.SEARCH_VIEW, theme) { init() }
}

inline fun Context.searchView(): androidx.appcompat.widget.SearchView = searchView() {}
inline fun Context.searchView(init: (@AnkoViewDslMarker androidx.appcompat.widget.SearchView).() -> Unit): androidx.appcompat.widget.SearchView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.SEARCH_VIEW, theme = 0) { init() }
}

inline fun Context.themedSearchView(theme: Int = 0): androidx.appcompat.widget.SearchView = themedSearchView(theme) {}
inline fun Context.themedSearchView(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.SearchView).() -> Unit): androidx.appcompat.widget.SearchView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.SEARCH_VIEW, theme) { init() }
}

inline fun Activity.searchView(): androidx.appcompat.widget.SearchView = searchView() {}
inline fun Activity.searchView(init: (@AnkoViewDslMarker androidx.appcompat.widget.SearchView).() -> Unit): androidx.appcompat.widget.SearchView {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.SEARCH_VIEW, theme = 0) { init() }
}

inline fun Activity.themedSearchView(theme: Int = 0): androidx.appcompat.widget.SearchView = themedSearchView(theme) {}
inline fun Activity.themedSearchView(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.SearchView).() -> Unit): androidx.appcompat.widget.SearchView {
return ankoView(`$$Anko$Factories$AppcompatV7View`.SEARCH_VIEW, theme) { init() }
}

inline fun ViewManager.switchCompat(): androidx.appcompat.widget.SwitchCompat = switchCompat() {}
inline fun ViewManager.switchCompat(init: (@AnkoViewDslMarker androidx.appcompat.widget.SwitchCompat).() -> Unit): androidx.appcompat.widget.SwitchCompat {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.SWITCH_COMPAT, theme = 0) { init() }
}

inline fun ViewManager.themedSwitchCompat(theme: Int = 0): androidx.appcompat.widget.SwitchCompat = themedSwitchCompat(theme) {}
inline fun ViewManager.themedSwitchCompat(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.SwitchCompat).() -> Unit): androidx.appcompat.widget.SwitchCompat {
return ankoView(`$$Anko$Factories$AppcompatV7View`.SWITCH_COMPAT, theme) { init() }
}

inline fun ViewManager.viewStubCompat(): androidx.appcompat.widget.ViewStubCompat = viewStubCompat() {}
inline fun ViewManager.viewStubCompat(init: (@AnkoViewDslMarker androidx.appcompat.widget.ViewStubCompat).() -> Unit): androidx.appcompat.widget.ViewStubCompat {
    return ankoView(`$$Anko$Factories$AppcompatV7View`.VIEW_STUB_COMPAT, theme = 0) { init() }
}

inline fun ViewManager.themedViewStubCompat(theme: Int = 0): androidx.appcompat.widget.ViewStubCompat = themedViewStubCompat(theme) {}
inline fun ViewManager.themedViewStubCompat(theme: Int = 0, init: (@AnkoViewDslMarker androidx.appcompat.widget.ViewStubCompat).() -> Unit): androidx.appcompat.widget.ViewStubCompat {
return ankoView(`$$Anko$Factories$AppcompatV7View`.VIEW_STUB_COMPAT, theme) { init() }
}

@PublishedApi
internal object `$$Anko$Factories$AppcompatV7ViewGroup` {
    val LIST_MENU_ITEM_VIEW = { ctx: Context -> _ListMenuItemView(ctx, null) }
    val ACTION_BAR_CONTAINER = { ctx: Context -> _ActionBarContainer(ctx) }
    val ACTION_BAR_OVERLAY_LAYOUT = { ctx: Context -> _ActionBarOverlayLayout(ctx) }
    val ACTION_MENU_VIEW = { ctx: Context -> _ActionMenuView(ctx) }
    val ALERT_DIALOG_LAYOUT = { ctx: Context -> _AlertDialogLayout(ctx) }
    val BUTTON_BAR_LAYOUT = { ctx: Context -> _ButtonBarLayout(ctx, null) }
    val LINEAR_LAYOUT_COMPAT = { ctx: Context -> _LinearLayoutCompat(ctx) }
    val SCROLLING_TAB_CONTAINER_VIEW = { ctx: Context -> _ScrollingTabContainerView(ctx) }
    val TOOLBAR = { ctx: Context -> _Toolbar(ctx) }
}

inline fun ViewManager.listMenuItemView(): androidx.appcompat.view.menu.ListMenuItemView = listMenuItemView() {}
inline fun ViewManager.listMenuItemView(init: (@AnkoViewDslMarker _ListMenuItemView).() -> Unit): androidx.appcompat.view.menu.ListMenuItemView {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.LIST_MENU_ITEM_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedListMenuItemView(theme: Int = 0): androidx.appcompat.view.menu.ListMenuItemView = themedListMenuItemView(theme) {}
inline fun ViewManager.themedListMenuItemView(theme: Int = 0, init: (@AnkoViewDslMarker _ListMenuItemView).() -> Unit): androidx.appcompat.view.menu.ListMenuItemView {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.LIST_MENU_ITEM_VIEW, theme) { init() }
}

inline fun Context.listMenuItemView(): androidx.appcompat.view.menu.ListMenuItemView = listMenuItemView() {}
inline fun Context.listMenuItemView(init: (@AnkoViewDslMarker _ListMenuItemView).() -> Unit): androidx.appcompat.view.menu.ListMenuItemView {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.LIST_MENU_ITEM_VIEW, theme = 0) { init() }
}

inline fun Context.themedListMenuItemView(theme: Int = 0): androidx.appcompat.view.menu.ListMenuItemView = themedListMenuItemView(theme) {}
inline fun Context.themedListMenuItemView(theme: Int = 0, init: (@AnkoViewDslMarker _ListMenuItemView).() -> Unit): androidx.appcompat.view.menu.ListMenuItemView {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.LIST_MENU_ITEM_VIEW, theme) { init() }
}

inline fun Activity.listMenuItemView(): androidx.appcompat.view.menu.ListMenuItemView = listMenuItemView() {}
inline fun Activity.listMenuItemView(init: (@AnkoViewDslMarker _ListMenuItemView).() -> Unit): androidx.appcompat.view.menu.ListMenuItemView {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.LIST_MENU_ITEM_VIEW, theme = 0) { init() }
}

inline fun Activity.themedListMenuItemView(theme: Int = 0): androidx.appcompat.view.menu.ListMenuItemView = themedListMenuItemView(theme) {}
inline fun Activity.themedListMenuItemView(theme: Int = 0, init: (@AnkoViewDslMarker _ListMenuItemView).() -> Unit): androidx.appcompat.view.menu.ListMenuItemView {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.LIST_MENU_ITEM_VIEW, theme) { init() }
}

inline fun ViewManager.actionBarContainer(): androidx.appcompat.widget.ActionBarContainer = actionBarContainer() {}
inline fun ViewManager.actionBarContainer(init: (@AnkoViewDslMarker _ActionBarContainer).() -> Unit): androidx.appcompat.widget.ActionBarContainer {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_BAR_CONTAINER, theme = 0) { init() }
}

inline fun ViewManager.themedActionBarContainer(theme: Int = 0): androidx.appcompat.widget.ActionBarContainer = themedActionBarContainer(theme) {}
inline fun ViewManager.themedActionBarContainer(theme: Int = 0, init: (@AnkoViewDslMarker _ActionBarContainer).() -> Unit): androidx.appcompat.widget.ActionBarContainer {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_BAR_CONTAINER, theme) { init() }
}

inline fun Context.actionBarContainer(): androidx.appcompat.widget.ActionBarContainer = actionBarContainer() {}
inline fun Context.actionBarContainer(init: (@AnkoViewDslMarker _ActionBarContainer).() -> Unit): androidx.appcompat.widget.ActionBarContainer {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_BAR_CONTAINER, theme = 0) { init() }
}

inline fun Context.themedActionBarContainer(theme: Int = 0): androidx.appcompat.widget.ActionBarContainer = themedActionBarContainer(theme) {}
inline fun Context.themedActionBarContainer(theme: Int = 0, init: (@AnkoViewDslMarker _ActionBarContainer).() -> Unit): androidx.appcompat.widget.ActionBarContainer {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_BAR_CONTAINER, theme) { init() }
}

inline fun Activity.actionBarContainer(): androidx.appcompat.widget.ActionBarContainer = actionBarContainer() {}
inline fun Activity.actionBarContainer(init: (@AnkoViewDslMarker _ActionBarContainer).() -> Unit): androidx.appcompat.widget.ActionBarContainer {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_BAR_CONTAINER, theme = 0) { init() }
}

inline fun Activity.themedActionBarContainer(theme: Int = 0): androidx.appcompat.widget.ActionBarContainer = themedActionBarContainer(theme) {}
inline fun Activity.themedActionBarContainer(theme: Int = 0, init: (@AnkoViewDslMarker _ActionBarContainer).() -> Unit): androidx.appcompat.widget.ActionBarContainer {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_BAR_CONTAINER, theme) { init() }
}

inline fun ViewManager.actionBarOverlayLayout(): androidx.appcompat.widget.ActionBarOverlayLayout = actionBarOverlayLayout() {}
inline fun ViewManager.actionBarOverlayLayout(init: (@AnkoViewDslMarker _ActionBarOverlayLayout).() -> Unit): androidx.appcompat.widget.ActionBarOverlayLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_BAR_OVERLAY_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedActionBarOverlayLayout(theme: Int = 0): androidx.appcompat.widget.ActionBarOverlayLayout = themedActionBarOverlayLayout(theme) {}
inline fun ViewManager.themedActionBarOverlayLayout(theme: Int = 0, init: (@AnkoViewDslMarker _ActionBarOverlayLayout).() -> Unit): androidx.appcompat.widget.ActionBarOverlayLayout {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_BAR_OVERLAY_LAYOUT, theme) { init() }
}

inline fun Context.actionBarOverlayLayout(): androidx.appcompat.widget.ActionBarOverlayLayout = actionBarOverlayLayout() {}
inline fun Context.actionBarOverlayLayout(init: (@AnkoViewDslMarker _ActionBarOverlayLayout).() -> Unit): androidx.appcompat.widget.ActionBarOverlayLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_BAR_OVERLAY_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedActionBarOverlayLayout(theme: Int = 0): androidx.appcompat.widget.ActionBarOverlayLayout = themedActionBarOverlayLayout(theme) {}
inline fun Context.themedActionBarOverlayLayout(theme: Int = 0, init: (@AnkoViewDslMarker _ActionBarOverlayLayout).() -> Unit): androidx.appcompat.widget.ActionBarOverlayLayout {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_BAR_OVERLAY_LAYOUT, theme) { init() }
}

inline fun Activity.actionBarOverlayLayout(): androidx.appcompat.widget.ActionBarOverlayLayout = actionBarOverlayLayout() {}
inline fun Activity.actionBarOverlayLayout(init: (@AnkoViewDslMarker _ActionBarOverlayLayout).() -> Unit): androidx.appcompat.widget.ActionBarOverlayLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_BAR_OVERLAY_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedActionBarOverlayLayout(theme: Int = 0): androidx.appcompat.widget.ActionBarOverlayLayout = themedActionBarOverlayLayout(theme) {}
inline fun Activity.themedActionBarOverlayLayout(theme: Int = 0, init: (@AnkoViewDslMarker _ActionBarOverlayLayout).() -> Unit): androidx.appcompat.widget.ActionBarOverlayLayout {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_BAR_OVERLAY_LAYOUT, theme) { init() }
}

inline fun ViewManager.actionMenuView(): androidx.appcompat.widget.ActionMenuView = actionMenuView() {}
inline fun ViewManager.actionMenuView(init: (@AnkoViewDslMarker _ActionMenuView).() -> Unit): androidx.appcompat.widget.ActionMenuView {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_MENU_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedActionMenuView(theme: Int = 0): androidx.appcompat.widget.ActionMenuView = themedActionMenuView(theme) {}
inline fun ViewManager.themedActionMenuView(theme: Int = 0, init: (@AnkoViewDslMarker _ActionMenuView).() -> Unit): androidx.appcompat.widget.ActionMenuView {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_MENU_VIEW, theme) { init() }
}

inline fun Context.actionMenuView(): androidx.appcompat.widget.ActionMenuView = actionMenuView() {}
inline fun Context.actionMenuView(init: (@AnkoViewDslMarker _ActionMenuView).() -> Unit): androidx.appcompat.widget.ActionMenuView {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_MENU_VIEW, theme = 0) { init() }
}

inline fun Context.themedActionMenuView(theme: Int = 0): androidx.appcompat.widget.ActionMenuView = themedActionMenuView(theme) {}
inline fun Context.themedActionMenuView(theme: Int = 0, init: (@AnkoViewDslMarker _ActionMenuView).() -> Unit): androidx.appcompat.widget.ActionMenuView {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_MENU_VIEW, theme) { init() }
}

inline fun Activity.actionMenuView(): androidx.appcompat.widget.ActionMenuView = actionMenuView() {}
inline fun Activity.actionMenuView(init: (@AnkoViewDslMarker _ActionMenuView).() -> Unit): androidx.appcompat.widget.ActionMenuView {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_MENU_VIEW, theme = 0) { init() }
}

inline fun Activity.themedActionMenuView(theme: Int = 0): androidx.appcompat.widget.ActionMenuView = themedActionMenuView(theme) {}
inline fun Activity.themedActionMenuView(theme: Int = 0, init: (@AnkoViewDslMarker _ActionMenuView).() -> Unit): androidx.appcompat.widget.ActionMenuView {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ACTION_MENU_VIEW, theme) { init() }
}

inline fun ViewManager.alertDialogLayout(): androidx.appcompat.widget.AlertDialogLayout = alertDialogLayout() {}
inline fun ViewManager.alertDialogLayout(init: (@AnkoViewDslMarker _AlertDialogLayout).() -> Unit): androidx.appcompat.widget.AlertDialogLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ALERT_DIALOG_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedAlertDialogLayout(theme: Int = 0): androidx.appcompat.widget.AlertDialogLayout = themedAlertDialogLayout(theme) {}
inline fun ViewManager.themedAlertDialogLayout(theme: Int = 0, init: (@AnkoViewDslMarker _AlertDialogLayout).() -> Unit): androidx.appcompat.widget.AlertDialogLayout {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ALERT_DIALOG_LAYOUT, theme) { init() }
}

inline fun Context.alertDialogLayout(): androidx.appcompat.widget.AlertDialogLayout = alertDialogLayout() {}
inline fun Context.alertDialogLayout(init: (@AnkoViewDslMarker _AlertDialogLayout).() -> Unit): androidx.appcompat.widget.AlertDialogLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ALERT_DIALOG_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedAlertDialogLayout(theme: Int = 0): androidx.appcompat.widget.AlertDialogLayout = themedAlertDialogLayout(theme) {}
inline fun Context.themedAlertDialogLayout(theme: Int = 0, init: (@AnkoViewDslMarker _AlertDialogLayout).() -> Unit): androidx.appcompat.widget.AlertDialogLayout {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ALERT_DIALOG_LAYOUT, theme) { init() }
}

inline fun Activity.alertDialogLayout(): androidx.appcompat.widget.AlertDialogLayout = alertDialogLayout() {}
inline fun Activity.alertDialogLayout(init: (@AnkoViewDslMarker _AlertDialogLayout).() -> Unit): androidx.appcompat.widget.AlertDialogLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ALERT_DIALOG_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedAlertDialogLayout(theme: Int = 0): androidx.appcompat.widget.AlertDialogLayout = themedAlertDialogLayout(theme) {}
inline fun Activity.themedAlertDialogLayout(theme: Int = 0, init: (@AnkoViewDslMarker _AlertDialogLayout).() -> Unit): androidx.appcompat.widget.AlertDialogLayout {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.ALERT_DIALOG_LAYOUT, theme) { init() }
}

inline fun ViewManager.buttonBarLayout(): androidx.appcompat.widget.ButtonBarLayout = buttonBarLayout() {}
inline fun ViewManager.buttonBarLayout(init: (@AnkoViewDslMarker _ButtonBarLayout).() -> Unit): androidx.appcompat.widget.ButtonBarLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.BUTTON_BAR_LAYOUT, theme = 0) { init() }
}

inline fun ViewManager.themedButtonBarLayout(theme: Int = 0): androidx.appcompat.widget.ButtonBarLayout = themedButtonBarLayout(theme) {}
inline fun ViewManager.themedButtonBarLayout(theme: Int = 0, init: (@AnkoViewDslMarker _ButtonBarLayout).() -> Unit): androidx.appcompat.widget.ButtonBarLayout {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.BUTTON_BAR_LAYOUT, theme) { init() }
}

inline fun Context.buttonBarLayout(): androidx.appcompat.widget.ButtonBarLayout = buttonBarLayout() {}
inline fun Context.buttonBarLayout(init: (@AnkoViewDslMarker _ButtonBarLayout).() -> Unit): androidx.appcompat.widget.ButtonBarLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.BUTTON_BAR_LAYOUT, theme = 0) { init() }
}

inline fun Context.themedButtonBarLayout(theme: Int = 0): androidx.appcompat.widget.ButtonBarLayout = themedButtonBarLayout(theme) {}
inline fun Context.themedButtonBarLayout(theme: Int = 0, init: (@AnkoViewDslMarker _ButtonBarLayout).() -> Unit): androidx.appcompat.widget.ButtonBarLayout {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.BUTTON_BAR_LAYOUT, theme) { init() }
}

inline fun Activity.buttonBarLayout(): androidx.appcompat.widget.ButtonBarLayout = buttonBarLayout() {}
inline fun Activity.buttonBarLayout(init: (@AnkoViewDslMarker _ButtonBarLayout).() -> Unit): androidx.appcompat.widget.ButtonBarLayout {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.BUTTON_BAR_LAYOUT, theme = 0) { init() }
}

inline fun Activity.themedButtonBarLayout(theme: Int = 0): androidx.appcompat.widget.ButtonBarLayout = themedButtonBarLayout(theme) {}
inline fun Activity.themedButtonBarLayout(theme: Int = 0, init: (@AnkoViewDslMarker _ButtonBarLayout).() -> Unit): androidx.appcompat.widget.ButtonBarLayout {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.BUTTON_BAR_LAYOUT, theme) { init() }
}

inline fun ViewManager.linearLayoutCompat(): androidx.appcompat.widget.LinearLayoutCompat = linearLayoutCompat() {}
inline fun ViewManager.linearLayoutCompat(init: (@AnkoViewDslMarker _LinearLayoutCompat).() -> Unit): androidx.appcompat.widget.LinearLayoutCompat {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.LINEAR_LAYOUT_COMPAT, theme = 0) { init() }
}

inline fun ViewManager.themedLinearLayoutCompat(theme: Int = 0): androidx.appcompat.widget.LinearLayoutCompat = themedLinearLayoutCompat(theme) {}
inline fun ViewManager.themedLinearLayoutCompat(theme: Int = 0, init: (@AnkoViewDslMarker _LinearLayoutCompat).() -> Unit): androidx.appcompat.widget.LinearLayoutCompat {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.LINEAR_LAYOUT_COMPAT, theme) { init() }
}

inline fun Context.linearLayoutCompat(): androidx.appcompat.widget.LinearLayoutCompat = linearLayoutCompat() {}
inline fun Context.linearLayoutCompat(init: (@AnkoViewDslMarker _LinearLayoutCompat).() -> Unit): androidx.appcompat.widget.LinearLayoutCompat {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.LINEAR_LAYOUT_COMPAT, theme = 0) { init() }
}

inline fun Context.themedLinearLayoutCompat(theme: Int = 0): androidx.appcompat.widget.LinearLayoutCompat = themedLinearLayoutCompat(theme) {}
inline fun Context.themedLinearLayoutCompat(theme: Int = 0, init: (@AnkoViewDslMarker _LinearLayoutCompat).() -> Unit): androidx.appcompat.widget.LinearLayoutCompat {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.LINEAR_LAYOUT_COMPAT, theme) { init() }
}

inline fun Activity.linearLayoutCompat(): androidx.appcompat.widget.LinearLayoutCompat = linearLayoutCompat() {}
inline fun Activity.linearLayoutCompat(init: (@AnkoViewDslMarker _LinearLayoutCompat).() -> Unit): androidx.appcompat.widget.LinearLayoutCompat {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.LINEAR_LAYOUT_COMPAT, theme = 0) { init() }
}

inline fun Activity.themedLinearLayoutCompat(theme: Int = 0): androidx.appcompat.widget.LinearLayoutCompat = themedLinearLayoutCompat(theme) {}
inline fun Activity.themedLinearLayoutCompat(theme: Int = 0, init: (@AnkoViewDslMarker _LinearLayoutCompat).() -> Unit): androidx.appcompat.widget.LinearLayoutCompat {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.LINEAR_LAYOUT_COMPAT, theme) { init() }
}

inline fun ViewManager.scrollingTabContainerView(): androidx.appcompat.widget.ScrollingTabContainerView = scrollingTabContainerView() {}
inline fun ViewManager.scrollingTabContainerView(init: (@AnkoViewDslMarker _ScrollingTabContainerView).() -> Unit): androidx.appcompat.widget.ScrollingTabContainerView {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.SCROLLING_TAB_CONTAINER_VIEW, theme = 0) { init() }
}

inline fun ViewManager.themedScrollingTabContainerView(theme: Int = 0): androidx.appcompat.widget.ScrollingTabContainerView = themedScrollingTabContainerView(theme) {}
inline fun ViewManager.themedScrollingTabContainerView(theme: Int = 0, init: (@AnkoViewDslMarker _ScrollingTabContainerView).() -> Unit): androidx.appcompat.widget.ScrollingTabContainerView {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.SCROLLING_TAB_CONTAINER_VIEW, theme) { init() }
}

inline fun Context.scrollingTabContainerView(): androidx.appcompat.widget.ScrollingTabContainerView = scrollingTabContainerView() {}
inline fun Context.scrollingTabContainerView(init: (@AnkoViewDslMarker _ScrollingTabContainerView).() -> Unit): androidx.appcompat.widget.ScrollingTabContainerView {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.SCROLLING_TAB_CONTAINER_VIEW, theme = 0) { init() }
}

inline fun Context.themedScrollingTabContainerView(theme: Int = 0): androidx.appcompat.widget.ScrollingTabContainerView = themedScrollingTabContainerView(theme) {}
inline fun Context.themedScrollingTabContainerView(theme: Int = 0, init: (@AnkoViewDslMarker _ScrollingTabContainerView).() -> Unit): androidx.appcompat.widget.ScrollingTabContainerView {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.SCROLLING_TAB_CONTAINER_VIEW, theme) { init() }
}

inline fun Activity.scrollingTabContainerView(): androidx.appcompat.widget.ScrollingTabContainerView = scrollingTabContainerView() {}
inline fun Activity.scrollingTabContainerView(init: (@AnkoViewDslMarker _ScrollingTabContainerView).() -> Unit): androidx.appcompat.widget.ScrollingTabContainerView {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.SCROLLING_TAB_CONTAINER_VIEW, theme = 0) { init() }
}

inline fun Activity.themedScrollingTabContainerView(theme: Int = 0): androidx.appcompat.widget.ScrollingTabContainerView = themedScrollingTabContainerView(theme) {}
inline fun Activity.themedScrollingTabContainerView(theme: Int = 0, init: (@AnkoViewDslMarker _ScrollingTabContainerView).() -> Unit): androidx.appcompat.widget.ScrollingTabContainerView {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.SCROLLING_TAB_CONTAINER_VIEW, theme) { init() }
}

inline fun ViewManager.toolbar(): androidx.appcompat.widget.Toolbar = toolbar() {}
inline fun ViewManager.toolbar(init: (@AnkoViewDslMarker _Toolbar).() -> Unit): androidx.appcompat.widget.Toolbar {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.TOOLBAR, theme = 0) { init() }
}

inline fun ViewManager.themedToolbar(theme: Int = 0): androidx.appcompat.widget.Toolbar = themedToolbar(theme) {}
inline fun ViewManager.themedToolbar(theme: Int = 0, init: (@AnkoViewDslMarker _Toolbar).() -> Unit): androidx.appcompat.widget.Toolbar {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.TOOLBAR, theme) { init() }
}

inline fun Context.toolbar(): androidx.appcompat.widget.Toolbar = toolbar() {}
inline fun Context.toolbar(init: (@AnkoViewDslMarker _Toolbar).() -> Unit): androidx.appcompat.widget.Toolbar {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.TOOLBAR, theme = 0) { init() }
}

inline fun Context.themedToolbar(theme: Int = 0): androidx.appcompat.widget.Toolbar = themedToolbar(theme) {}
inline fun Context.themedToolbar(theme: Int = 0, init: (@AnkoViewDslMarker _Toolbar).() -> Unit): androidx.appcompat.widget.Toolbar {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.TOOLBAR, theme) { init() }
}

inline fun Activity.toolbar(): androidx.appcompat.widget.Toolbar = toolbar() {}
inline fun Activity.toolbar(init: (@AnkoViewDslMarker _Toolbar).() -> Unit): androidx.appcompat.widget.Toolbar {
    return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.TOOLBAR, theme = 0) { init() }
}

inline fun Activity.themedToolbar(theme: Int = 0): androidx.appcompat.widget.Toolbar = themedToolbar(theme) {}
inline fun Activity.themedToolbar(theme: Int = 0, init: (@AnkoViewDslMarker _Toolbar).() -> Unit): androidx.appcompat.widget.Toolbar {
return ankoView(`$$Anko$Factories$AppcompatV7ViewGroup`.TOOLBAR, theme) { init() }
}

