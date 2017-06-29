package ir.mtajik.daggertest;

import android.app.Application;

import ir.mtajik.daggertest.dagger.ActivityComponent;
import ir.mtajik.daggertest.dagger.ApplicationComponent;

public class DaggerTestApplication extends Application {

    private ApplicationComponent appComponent;
    private ActivityComponent activityComponent;

    @Override
    public void onCreate() {
        super.onCreate();

    }

    public ApplicationComponent getAppComponent() {
        return appComponent;
    }

    public ActivityComponent getActivityComponent() {
        return activityComponent;
    }
}
