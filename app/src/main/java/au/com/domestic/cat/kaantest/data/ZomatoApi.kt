package au.com.domestic.cat.kaantest.data

import au.com.domestic.cat.kaantest.data.restaurants.RestaurantsRequest
import com.google.api.client.googleapis.services.json.AbstractGoogleJsonClient
import com.google.api.client.http.HttpRequestInitializer
import com.google.api.client.http.HttpTransport
import com.google.api.client.json.JsonFactory

class ZomatoApi(builder: Builder) : AbstractGoogleJsonClient(builder) {

    class Builder(
        httpTransport: HttpTransport,
        jsonFactory: JsonFactory,
        rootUrl: String,
        httpRequestInitializer: HttpRequestInitializer?
    ) : AbstractGoogleJsonClient.Builder(
        httpTransport,
        jsonFactory,
        rootUrl,
        "",
        httpRequestInitializer,
        false
    ) {

        override fun build(): ZomatoApi = ZomatoApi(this)
    }

    fun getRestaurants() = RestaurantsRequest(this)
}

//                      https://developers.zomato.com/api
// TODO:  API Key           527f59ce23d59e0672bdd95f4bc42d86
