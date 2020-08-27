package au.com.domestic.cat.kaantest.data.restaurants

import au.com.domestic.cat.kaantest.data.ZomatoApi
import com.google.api.client.http.HttpMethods

class ZomatoRequest(private val client: ZomatoApi) : ZomatoApiRequest<RestaurantsResponse>(
        client,
        HttpMethods.GET,
        "",
        null,
        RestaurantsResponse::class.java
)
