package ir.mtajik.daggertest.dagger;

import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.mtajik.daggertest.NetworkClass;


@Module
public class ServiceModule {

    @Singleton
    @Provides
    NetworkClass providesNetworkClass(Context context){
        return new NetworkClass(context);
    }
}
