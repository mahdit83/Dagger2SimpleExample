package ir.mtajik.daggertest.dagger;

import dagger.Component;
import ir.mtajik.daggertest.MainActivity;

@ActivityScope
@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);


}
