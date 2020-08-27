package au.com.domestic.cat.kaantest.utils

import androidx.recyclerview.widget.DiffUtil

class NegativeDiffCallback<T> : DiffUtil.ItemCallback<T>() {

    override fun areItemsTheSame(oldItem: T, newItem: T): Boolean = false

    override fun areContentsTheSame(oldItem: T, newItem: T): Boolean = false
}
