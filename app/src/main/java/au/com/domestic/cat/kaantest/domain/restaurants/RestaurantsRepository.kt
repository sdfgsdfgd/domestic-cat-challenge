package au.com.domestic.cat.kaantest.domain.restaurants

interface RestaurantsRepository {

    suspend fun getRestaurants(): List<Restaurant>
}
