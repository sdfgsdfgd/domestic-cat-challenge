package au.com.domestic.cat.kaantest.ui.restaurants

import android.graphics.Movie
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.RecyclerView
import au.com.domestic.cat.kaantest.R
import au.com.domestic.cat.kaantest.domain.restaurants.Restaurant
import au.com.domestic.cat.kaantest.ui.restaurants.model.RestaurantItem
import kotlinx.coroutines.launch
import javax.inject.Inject
import kotlin.properties.Delegates


class RestaurantsViewModel @Inject constructor(/* TODO: Restaurants Repository & API calls */) :
    ViewModel() {

    // Restaurants
    private val _restaurants = MutableLiveData<List<RestaurantItem>>(
        listOf(
            RestaurantItem(
                0, "Abbotsford",
                "random thumbnail URL"
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
//        _restaurants.value =
    }

    private fun initialiseNews() {
        viewModelScope.launch {
//            _errorVisible.value = false
//            _progressVisible.value = true

//            try {
//                setNewsItems(restaurantsRepository.getNews())
//            } catch (e: ApplicationException) {
//                _errorVisible.value = true
//            } finally {
//                _progressVisible.value = false
//            }
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
        oldItem.title == newItem.title &&
                oldItem.contentDescription == newItem.contentDescription
}


//private class FavouriteDiffCallback : DiffUtil.ItemCallback<BaseFavouriteItem>() {
//    override fun areItemsTheSame(oldItem: BaseFavouriteItem, newItem: BaseFavouriteItem): Boolean {
//        val oldFavData = oldItem.favouriteData
//        val newFavData = newItem.favouriteData
//        return when (oldFavData) {
//            is StopFavourite -> {
//                newFavData is StopFavourite &&
//                        oldFavData.stop.id == newFavData.stop.id &&
//                        oldFavData.runDestinationName == newFavData.runDestinationName
//            }
//            is RouteFavourite -> {
//                newFavData is RouteFavourite &&
//                        oldFavData.route.id == newFavData.route.id
//            }
//            else -> oldFavData == newFavData
//        }
//    }
//
//    override fun areContentsTheSame(oldItem: BaseFavouriteItem, newItem: BaseFavouriteItem): Boolean =
//            oldItem.favouriteData == newItem.favouriteData
//}
