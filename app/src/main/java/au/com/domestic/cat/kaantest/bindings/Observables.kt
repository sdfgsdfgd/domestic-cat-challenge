package au.gov.vic.ptv.framework.databinding

import androidx.databinding.ObservableBoolean
import androidx.databinding.ObservableField
import androidx.databinding.ObservableInt

var <T> ObservableField<T>.value: T?
    get() = this.get()
    set(v) = this.set(v)

var ObservableBoolean.value: Boolean
    get() = this.get()
    set(v) = this.set(v)

var ObservableInt.value: Int
    get() = this.get()
    set(v) = this.set(v)
