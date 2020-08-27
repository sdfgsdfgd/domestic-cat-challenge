package au.com.domestic.cat.kaantest.utils

import android.app.Activity
import android.util.TypedValue
import androidx.annotation.AttrRes

fun Activity.setStatusBarColor(@AttrRes color: Int) {
    val typedValue = TypedValue()
    val a = obtainStyledAttributes(typedValue.data, listOf(color).toIntArray())
    window.statusBarColor = a.getColor(0, 0)
    a.recycle()
}
