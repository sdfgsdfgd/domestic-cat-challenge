package au.com.domestic.cat.kaantest.data.restaurants

import au.com.domestic.cat.kaantest.data.ZomatoApi
import com.google.api.client.http.HttpMethods


class RestaurantsRequest(private val client: ZomatoApi) : ZomatoApiRequest<RestaurantsResponse>(
    client,
    HttpMethods.GET,
    "/api/v2.1/location_details?entity_id=98284&entity_type=subzone",
    null,
    RestaurantsResponse::class.java
)
