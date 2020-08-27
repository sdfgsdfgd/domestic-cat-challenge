package au.com.domestic.cat.kaantest.ui.favourites

import androidx.lifecycle.ViewModel
import javax.inject.Inject

class FavouritesViewModel @Inject constructor() : ViewModel() {

//    private val _locateFavAddressRequested = MutableLiveData<Event<AddressWayPoint>>()
//    val locateFavAddressRequested: LiveData<Event<AddressWayPoint>> get() = _locateFavAddressRequested
//
//    private val _navigateToNextDepRequested = MutableLiveData<Event<Departure>>()
//    val navigateToNextDepRequested: LiveData<Event<Departure>> get() = _navigateToNextDepRequested
//
//    private val _navigateToRouteRequested = MutableLiveData<Event<Route>>()
//    val navigateToRouteRequested: LiveData<Event<Route>> get() = _navigateToRouteRequested
//
//
//    private var fav by Delegates.observable<MutableList<BaseFavouriteItem>>(mutableListOf()) { _, _, value ->
//        _favs.value = value
//    }


//    val favsDiff: DiffUtil.ItemCallback<BaseFavouriteItem> = FavouriteDiffCallback()

//    val favsLayoutProvider: (BaseFavouriteItem) -> Int = { item ->
//        when (item) {
//            is StandardFavouriteItem -> R.layout.favourite_standard_item
//            is StopFavouriteItem -> R.layout.favourite_stop_item
//        }
//    }
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
