package ir.mtajik.daggertest.dagger;

import javax.inject.Singleton;

import dagger.Component;
import ir.mtajik.daggertest.DaggerTestApplication;

@Singleton
@Component(modules = {ApplicationModule.class, DatabaseModule.class, UserModule.class})
public interface ApplicationComponent {

    void inject(DaggerTestApplication application);


    // Exported for child-components.

//    Context getContext();
//
//    User provideUser();
//
//    Database proDatabase();


    //sub compnent

    ActivityComponent providesActivityComponent(ServiceModule service);

}
