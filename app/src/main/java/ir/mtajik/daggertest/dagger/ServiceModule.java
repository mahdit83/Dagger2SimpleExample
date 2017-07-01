package ir.mtajik.daggertest.dagger;

import dagger.Module;
import dagger.Provides;
import ir.mtajik.daggertest.NetworkClass;
import ir.mtajik.daggertest.User;


@Module
public class ServiceModule {

    @ActivityScope
    @Provides
    NetworkClass providesNetworkClass(User user) {
        return new NetworkClass(user);
    }
}
