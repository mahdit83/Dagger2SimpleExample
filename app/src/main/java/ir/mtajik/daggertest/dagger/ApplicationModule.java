package ir.mtajik.daggertest.dagger;

import android.app.Application;
import android.content.Context;

import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class ApplicationModule {

    private Application application;

    public ApplicationModule(Application application) {
        this.application = application;
    }

    @Singleton
    @Provides
    Context providesContext(){
        return application.getApplicationContext();
    }

    @Singleton
    @Provides
    Application providesApplication(){
        return application;
    }

}
