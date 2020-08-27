package au.com.domestic.cat.kaantest.di;

import android.content.Context;

import javax.inject.Singleton;

import au.com.domestic.cat.kaantest.App;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class AppModule {

    @Provides
    @Singleton
    static Context provideContext(App app) {
        return app;
    }

}
