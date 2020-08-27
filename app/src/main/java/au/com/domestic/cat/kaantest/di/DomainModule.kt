package au.com.domestic.cat.kaantest.di

import au.com.domestic.cat.kaantest.domain.restaurants.RestaurantsRepository
import au.com.domestic.cat.kaantest.domain.restaurants.impl.RestaurantsRepositoryImpl
import dagger.Binds
import dagger.Module
import javax.inject.Singleton

@Module
abstract class DomainModule {
    @Binds
    @Singleton
    abstract fun bindRestaurantsRepository(impl: RestaurantsRepositoryImpl): RestaurantsRepository

}
