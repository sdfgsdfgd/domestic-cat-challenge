package au.com.domestic.cat.kaantest.domain.restaurants.impl

import android.util.Log
import au.com.domestic.cat.kaantest.data.restaurants.RestaurantsResponse
import au.com.domestic.cat.kaantest.domain.restaurants.Restaurant
import com.google.common.base.Verify

/**
 * Some of the response fields are assumed to be not null and are not Verified.
 */
fun Restaurants(response: RestaurantsResponse?): List<Restaurant> {
    if(response == null)
        Log.d("XXX", "---- RESPONSE IS NULL -----")
    else
        Log.d("XXX", "----- response: ${response.toString()}")

    return Verify.verifyNotNull(Verify.verifyNotNull(response).bestRatedRestaurant).map {
        Restaurant(
            it.id!!,
            it.name!!,
            it.location!!.address!!,
            it.featuredImage!!
        )
    }
}
