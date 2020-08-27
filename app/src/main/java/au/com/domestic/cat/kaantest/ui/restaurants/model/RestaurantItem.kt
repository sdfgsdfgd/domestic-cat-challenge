package au.com.domestic.cat.kaantest.ui.restaurants.model

import androidx.annotation.DrawableRes

class RestaurantItem(
    val id: String,
    val title: String,
    val address: String,
    @DrawableRes
    val drawable: Int
//    private val onClickHandler: (Restaurant) -> Unit,
//    private val restaurant: Restaurant
) {

    // TODO: Disabled until the API is complete
//    fun onClick() {
//        onClickHandler.invoke(restaurant)
//    }
}
