package au.com.domestic.cat.kaantest.ui

import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.findNavController
import androidx.navigation.ui.setupWithNavController
import au.com.domestic.cat.kaantest.R
import au.com.domestic.cat.kaantest.databinding.MainActivityBinding
import dagger.android.support.DaggerAppCompatActivity


class MainActivity : DaggerAppCompatActivity() {
    private lateinit var binding: MainActivityBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.main_activity)

        setupBottomNavigationBar()
    }


    private fun setupBottomNavigationBar() {
        val navController = findNavController(R.id.nav_host_container)

        binding.bottomNav.setupWithNavController(navController)
    }

//    private fun setupBottomNavigationBar() {
//        // Setup the bottom navigation view with a list of navigation graphs
//        val currentNavController: LiveData<NavController> =
//            binding.bottomNav.setupWithNavController(
//                navGraphIds = listOf(R.navigation.nav_main),
////                navGraphIds = listOf(
////                    R.navigation.restaurants, R.navigation.fav
////                ),
//                fragmentManager = supportFragmentManager,
//                containerId = R.id.nav_host_container,
//                intent = intent
//            )
//
//        // Whenever the selected controller changes, setup the action bar.
//        currentNavController.observe(this) { navController ->
//            val graphId = navController.graph.id
////            if (!isNavControllerSetup[graphId]) {
////                setupNavController(navController)
////                isNavControllerSetup[graphId] = true
////            }
//        }
//
//        binding.bottomNav.selectedItemId = R.id.restaurantsFragment
//    }

//    private fun setupNavController(navController: NavController) {
//        navController.addOnDestinationChangedListener { _, destination, _ ->
//            if (destination.navigatorName != "dialog") {
//                val hide = when (destination.id) {
//                    R.id.restaurantsFragment,
//                    R.id.favouritesFragment -> false
//                    else -> true
//                }
//                binding.bottomNav.isGone = hide
//            }
//        }
//    }


//    override fun onRestoreInstanceState(savedInstanceState: Bundle) {
//        super.onRestoreInstanceState(savedInstanceState)
//        // Now that BottomNavigationBar has restored its instance state
//        // and its selectedItemId, we can proceed with setting up the
//        // BottomNavigationBar with Navigation
//        setupBottomNavigationBar()
//    }
}
