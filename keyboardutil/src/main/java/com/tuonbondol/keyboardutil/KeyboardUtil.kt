package com.tuonbondol.keyboardutil

import android.app.Activity
import android.content.Context
import android.view.View
import android.view.inputmethod.InputMethodManager

/****
 *
 * @author TUON BONDOL Date: 10/9/17.
 *
 */

fun Activity.hideSoftKeyboard() {
    val mInputMethodManager = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    mInputMethodManager.hideSoftInputFromWindow(this.window.decorView.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
}

fun Context.hideSoftKeyboard() {
    val mInputMethodManager = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    val mActivity = this as Activity
    mInputMethodManager.hideSoftInputFromWindow(mActivity.window.decorView.windowToken, InputMethodManager.HIDE_NOT_ALWAYS)
}

fun Activity.showSoftKeyboard(view: View) {
    val mInputMethodManager = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    mInputMethodManager.showSoftInput(view, InputMethodManager.SHOW_IMPLICIT)
}

fun Context.showSoftKeyboard(view: View) {
    val mInputMethodManager = this.getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
    val mActivity = this as Activity
    mInputMethodManager.hideSoftInputFromWindow(mActivity.window.decorView.windowToken, InputMethodManager.SHOW_FORCED)
}