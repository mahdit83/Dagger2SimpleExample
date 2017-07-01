package ir.mtajik.daggertest.dagger;

import javax.inject.Singleton;

import dagger.Component;
import ir.mtajik.daggertest.Database;
import ir.mtajik.daggertest.MainActivity;
import ir.mtajik.daggertest.NetworkClass;

@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    NetworkClass providesNetworkClass();

}
