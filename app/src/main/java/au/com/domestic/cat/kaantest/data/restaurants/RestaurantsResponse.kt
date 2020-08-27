package au.com.domestic.cat.kaantest.data.restaurants

import com.google.api.client.util.Key

class RestaurantsResponse {
    @Key("best_rated_restaurant")
    var bestRatedRestaurant: List<Restaurant>? = null
}

class Restaurant {
    @Key("id")
    var id: String? = null

    @Key("name")
    var name: String? = null

    @Key("location")
    var location: Location? = null

    @Key("featured_image")
    var featuredImage: String? = null
}

class Location {
    @Key("address")
    var address: String? = null
}
