package au.com.domestic.cat.kaantest.di;

import com.google.api.client.extensions.android.json.AndroidJsonFactory;
import com.google.api.client.http.HttpTransport;
import com.google.api.client.http.javanet.NetHttpTransport;

import java.util.logging.Level;
import java.util.logging.Logger;

import javax.inject.Singleton;

import au.com.domestic.cat.kaantest.data.ZomatoApi;
import dagger.Module;
import dagger.Provides;

@Module
public abstract class DataModule {

    @Provides
    @Singleton
    static ZomatoApi provideZomatoApi() {
        // Enable Google Http Client logging
        Logger.getLogger(HttpTransport.class.getName()).setLevel(Level.CONFIG);

        ZomatoApi.Builder builder = new ZomatoApi.Builder(
                new NetHttpTransport(),
                AndroidJsonFactory.getDefaultInstance(),
                "https://developers.zomato.com/api",
                null
        );
        return builder.build();
    }

    // TODO: Room database
//    @Provides
//    @Singleton
//    static FavouriteDao provideFavouriteDao(AppDatabase database) {
//        return database.favouriteDao();
//    }
//
//    @Provides
//    @Singleton
//    static CommonDao provideCommonDao(AppDatabase database) {
//        return database.commonDao();
//    }
//
//    @Provides
//    @Singleton
//    static RecentDao provideRecentDao(AppDatabase database) {
//        return database.recentDao();
//    }
}
