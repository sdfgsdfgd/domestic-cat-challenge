package au.com.domestic.cat.kaantest.domain.restaurants

import android.os.Parcelable
import kotlinx.android.parcel.Parcelize


@Parcelize
data class Restaurant(
    val id: String,
    val title: String,
    val address: String,
    val featuredImage: String
) : Parcelable
