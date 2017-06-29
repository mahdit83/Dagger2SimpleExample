package ir.mtajik.daggertest.dagger;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;
import ir.mtajik.daggertest.User;

@Module
public class UserModule {

    @Provides
    @Singleton
    User providesUser() {
        return new User("Farhad", "Majidi");
    }
}