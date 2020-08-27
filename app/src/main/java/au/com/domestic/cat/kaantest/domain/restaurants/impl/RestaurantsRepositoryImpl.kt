package au.com.domestic.cat.kaantest.domain.restaurants.impl

import au.com.domestic.cat.kaantest.data.ZomatoApi
import au.com.domestic.cat.kaantest.domain.restaurants.Restaurant
import au.com.domestic.cat.kaantest.domain.restaurants.RestaurantsRepository
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RestaurantsRepositoryImpl @Inject constructor(private val zomatoApi: ZomatoApi) :
    RestaurantsRepository {

    override suspend fun getRestaurants(): List<Restaurant> =
        withContext(Dispatchers.IO) {
            val request = zomatoApi.getRestaurants()


            request.requestHeaders.set("user-key", "527f59ce23d59e0672bdd95f4bc42d86")
            request.requestHeaders.accept = "application/json"



            println("Test ${request.entries.toString()}")
            println("Test ${request.lastResponseHeaders}")
            println("Test ${request.lastStatusMessage}")
            println("Test ${request.lastStatusCode}")
            println("Test ${request.httpContent}")
            println("Test ${request.uriTemplate}")



            try {
//                Log.d("XXX", request.lastStatusMessage)
//                Log.d("XXX", request.requestMethod)
//                Log.d("XXX", request.values.toString())
                val response = request.execute()
//                Log.d("XXX", request.lastStatusMessage)
//                Log.d("XXX", response.toString())

                Restaurants(response)       // Mapper version of Restaurants
            } catch (e: Exception) {
                e.printStackTrace()

                throw e
            }
        }
}
