package au.com.domestic.cat.kaantest.data

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
        false) {

        override fun build(): ZomatoApi = ZomatoApi(this)
    }

//    fun outlets() = Outlets(this)
//    fun stops() = Stops(this)
//    fun journeyPlans() = JourneyPlanner(this)
//    fun search() = Search(this)
//    fun departures() = Departures(this)
//    fun routes() = DepartureRoute(this)
//    fun route() = Route(this)
//    fun directions() = Directions(this)
//    fun routeStops() = RouteStops(this)
//    fun patterns() = Patterns(this)
//    fun operators() = Operators(this)
//    fun disruptions() = Disruptions(this)
}
