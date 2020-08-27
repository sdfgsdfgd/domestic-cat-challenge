package au.com.domestic.cat.kaantest.ui.restaurants

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModelProvider
import au.com.domestic.cat.kaantest.bindings.recyclerview.MultiDataBoundListAdapter
import au.com.domestic.cat.kaantest.databinding.RestaurantsFragmentBinding
import dagger.android.support.DaggerFragment
import javax.inject.Inject


class RestaurantsFragment : DaggerFragment() {
    @Inject                                                   // ?
    lateinit var viewModelFactory: ViewModelProvider.Factory  // ?

    private lateinit var binding: RestaurantsFragmentBinding

    private val viewModel: RestaurantsViewModel by viewModels { viewModelFactory }   // ?

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = RestaurantsFragmentBinding.inflate(inflater, container, false)

        binding.restaurantsList.adapter = MultiDataBoundListAdapter(
            viewModel.restaurants,
            viewModel.restaurantsLayoutProvider,
            viewModel.restaurantsDiff
        )

        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.viewModel = viewModel
        binding.lifecycleOwner = this
    }
}
