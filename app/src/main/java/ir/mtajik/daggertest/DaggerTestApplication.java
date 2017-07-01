package ir.mtajik.daggertest;

import android.app.Application;

import javax.inject.Inject;

import ir.mtajik.daggertest.dagger.ActivityComponent;
import ir.mtajik.daggertest.dagger.ApplicationComponent;
import ir.mtajik.daggertest.dagger.ApplicationModule;
import ir.mtajik.daggertest.dagger.DaggerApplicationComponent;
import ir.mtajik.daggertest.dagger.DatabaseModule;
import ir.mtajik.daggertest.dagger.UserModule;

public class DaggerTestApplication extends Application {

    @Inject
    Database database;
    private ApplicationComponent appComponent;
    private ActivityComponent activityComponent;

    @Override
    public void onCreate() {
        super.onCreate();

        wireUpDI();
        initializeDatabase();

    }

    private void initializeDatabase() {
        database.initialize();
    }

    private void wireUpDI() {
        appComponent = DaggerApplicationComponent.builder().applicationModule(new
                ApplicationModule(this)).userModule(new
                UserModule()).databaseModule(new DatabaseModule()).build();

//        DaggerApplicationComponent.builder().
//
//        activityComponent = DaggerApplicationComponent.builder().(appComponent)
//                .serviceModule(new ServiceModule())
//                .build();
//
        appComponent.inject(this);

    }

    public ApplicationComponent getAppComponent() {
        return appComponent;
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }
}
