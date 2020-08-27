package au.com.domestic.cat.kaantest.ui.restaurants

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.DiffUtil
import au.com.domestic.cat.kaantest.R
import au.com.domestic.cat.kaantest.domain.restaurants.Restaurant
import au.com.domestic.cat.kaantest.domain.restaurants.RestaurantsRepository
import au.com.domestic.cat.kaantest.ui.restaurants.model.RestaurantItem
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.properties.Delegates


class RestaurantsViewModel @Inject constructor(private val restaurantsRepository: RestaurantsRepository) :
    ViewModel() {

    // Restaurants
    private val _restaurants = MutableLiveData<List<RestaurantItem>>(
        listOf(
            RestaurantItem(
                "0",
                "Ichiraku Ramen",
                "Abbotsford, Melbourne",
                R.drawable.feat0
            ),
            RestaurantItem(
                "1",
                "Burger King",
                "Abbotford, Melbourne",
                R.drawable.feat2
            ),
            RestaurantItem(
                "2",
                "KFC",
                "Abbotford, Melbourne",
                R.drawable.feat3
            ),
            RestaurantItem(
                "3",
                "UMINONO",
                "Abbotford, Melbourne",
                R.drawable.feat0
            ),
            RestaurantItem(
                "4",
                "Lentil As Anything",
                "Abbotford, Melbourne",
                R.drawable.feat3
            ),
            RestaurantItem(
                "5",
                "Rita's Abbotsford",
                "Abbotford, Melbourne",
                R.drawable.feat2
            )
        )
    )
    val restaurants: LiveData<List<RestaurantItem>> get() = _restaurants

    // RecyclerView bindings for the restaurants
    val restaurantsDiff: DiffUtil.ItemCallback<RestaurantItem> = RestaurantsDiffCallback()
    val restaurantsLayoutProvider: (RestaurantItem) -> Int = { _ -> R.layout.restaurant_item }

    //     Restaurant Favourites
    private var favourites by Delegates.observable<MutableList<Unit>>(mutableListOf()) { _, _, value ->
//        _favs.value = value
    }

    init {
        initialiseNews()
    }

    private fun initialiseNews() {
        viewModelScope.launch {
            // set loading indicator visible & reset error indicators
            //            _errorVisible.value = false
            //            _progressVisible.value = true

            try {
                _restaurants.value = restaurantsRepository.getRestaurants().map {
                    RestaurantItem(it.id, it.title, it.address, 0)
                }

                Log.d("XXX", "========================================================")
                Log.d("XXX", "========================================================")
                Log.d("XXX", restaurants.toString())
                Log.d("XXX", "========================================================")
            } catch (e: Exception) {
                // make error indicator visible
            } finally {
                // turn off the loading indicator
            }
        }
    }


    fun onRestaurantClick(restaurant: Restaurant) {
        TODO("Not yet implemented")
    }

}

class RestaurantsDiffCallback : DiffUtil.ItemCallback<RestaurantItem>() {
    override fun areItemsTheSame(oldItem: RestaurantItem, newItem: RestaurantItem) =
        oldItem.id == newItem.id

    override fun areContentsTheSame(oldItem: RestaurantItem, newItem: RestaurantItem) =
        oldItem.title == newItem.title
}
