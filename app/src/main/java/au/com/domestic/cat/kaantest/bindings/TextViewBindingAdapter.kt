package au.com.domestic.cat.kaantest.bindings

import android.graphics.drawable.Drawable
import android.widget.TextView
import androidx.core.content.ContextCompat
import androidx.databinding.BindingAdapter

@BindingAdapter("android:textColor")
fun TextView.setAndroidTextColor(color: Int) {
    this.setTextColor(ContextCompat.getColor(this.context, color))
}


/**
 * From this SO answer provided by Google:
 * https://stackoverflow.com/a/44161515
 */
@BindingAdapter("android:drawableLeft")
fun TextView.setDrawableLeft(resourceId: Int) {
    val drawable: Drawable? = ContextCompat.getDrawable(context, resourceId)
    drawable?.setBounds(0, 0, drawable.intrinsicWidth, drawable.intrinsicHeight)
    val drawables: Array<Drawable> = compoundDrawables
    setCompoundDrawables(drawable, drawables[1], drawables[2], drawables[3])
}
