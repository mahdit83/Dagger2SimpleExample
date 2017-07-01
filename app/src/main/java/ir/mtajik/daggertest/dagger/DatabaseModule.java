package ir.mtajik.daggertest.dagger;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.mtajik.daggertest.Database;

@Module
public class DatabaseModule {

    @Singleton
    @Provides
    Database providesDatabase(Context context){
        return new Database(context);
    }
}
