package ir.mtajik.daggertest.dagger;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Component;
import ir.mtajik.daggertest.DaggerTestApplication;
import ir.mtajik.daggertest.Database;
import ir.mtajik.daggertest.User;

@Singleton
@Component(modules = {ApplicationModule.class,UserModule.class})
public interface ApplicationComponent {

    void inject(DaggerTestApplication application);


    // Exported for child-components.

    User provideUser();

    Database provideDatabase();

    Context getContext();

    Application getApplication();


}
