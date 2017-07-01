package ir.mtajik.daggertest.dagger;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.mtajik.daggertest.Database;
import ir.mtajik.daggertest.User;

@Module
public class DatabaseModule {

    @Singleton
    @Provides
    Database providesDatabase(Context context,User user){
        return new Database(context,user);
    }
}
