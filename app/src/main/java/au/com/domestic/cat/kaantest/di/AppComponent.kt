package au.com.domestic.cat.kaantest.di

import au.com.domestic.cat.kaantest.App
import dagger.BindsInstance
import dagger.Component
import dagger.android.AndroidInjector
import dagger.android.support.AndroidSupportInjectionModule
import javax.inject.Singleton

@Singleton
@Component(
    modules = [
        AndroidSupportInjectionModule::class,
        AppModule::class,
        UiModule::class,
        DomainModule::class,
        DataModule::class
    ]
)
interface AppComponent : AndroidInjector<App> {
    //<editor-fold desc="No need to change">
    @Component.Factory
    interface Factory {
        fun create(@BindsInstance application: App): AppComponent
    }
    //</editor-fold>
}
