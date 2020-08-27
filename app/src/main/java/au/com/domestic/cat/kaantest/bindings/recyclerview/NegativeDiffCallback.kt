package au.com.domestic.cat.kaantest.bindings.recyclerview

import androidx.recyclerview.widget.DiffUtil

/**
 * The DiffUtil callback that treats all items as different.
 *
 */
class NegativeDiffCallback<T> : DiffUtil.ItemCallback<T>() {

    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean = false

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean = false
}
