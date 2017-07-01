package ir.mtajik.daggertest.dagger;

import dagger.Component;
import dagger.Subcomponent;
import ir.mtajik.daggertest.MainActivity;

//@Component(dependencies = ApplicationComponent.class, modules = ServiceModule.class)
@MahdiScope
@Subcomponent(modules = ServiceModule.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

}
