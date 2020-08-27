/*
 * Copyright 2018 Google LLC
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     https://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package au.com.domestic.cat.kaantest.bindings

import android.content.res.ColorStateList
import android.view.View
import android.view.View.*
import android.widget.ImageView
import android.widget.TextView
import androidx.annotation.DrawableRes
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter
import com.google.android.material.button.MaterialButton


/**
 * Original source
 * https://github.com/google/iosched/blob/master/mobile/src/main/java/com/google/samples/apps/iosched/util/ViewBindingAdapters.kt
 */

@BindingAdapter("invisibleUnless")
fun invisibleUnless(view: View, visible: Boolean) {
    view.visibility = if (visible) VISIBLE else INVISIBLE
}

@BindingAdapter("goneUnless")
fun goneUnless(view: View, visible: Boolean) {
    view.visibility = if (visible) VISIBLE else GONE
}

@BindingAdapter("android:maxLines")
fun setMaxLines(view: TextView, maxLines: Int) {
    view.maxLines = maxLines
}

@BindingAdapter("paddingTopSystemWindowInsets")
fun applySystemWindowBottomInset(view: View, applyTopInset: Boolean) {
    view.setOnApplyWindowInsetsListener { _, insets ->
        val paddingTop = if (applyTopInset) insets.systemWindowInsetTop else 0
        view.setPadding(
            view.paddingLeft,
            paddingTop,
            view.paddingRight,
            view.paddingBottom
        )

        insets
    }
}

@BindingAdapter("backgroundColor")
fun setBackgroundColor(view: View, color: Int) {
    view.setBackgroundColor(ContextCompat.getColor(view.context, color))
}

@BindingAdapter("tint")
fun setTint(view: ImageView, color: Int) {
    view.drawable.mutate().setTint(ContextCompat.getColor(view.context, color))
}

@BindingAdapter("iconTint")
fun setIconTint(view: MaterialButton, color: Int) {
    if (color != 0) {
        view.iconTint = ColorStateList.valueOf(ContextCompat.getColor(view.context, color))
    }
}

@BindingAdapter("icon")
fun setIcon(materialButton: MaterialButton, @DrawableRes icon: Int) {
    if (icon != 0) {
        materialButton.icon = ContextCompat.getDrawable(materialButton.context, icon)
    } else {
        materialButton.icon = null
    }
}
