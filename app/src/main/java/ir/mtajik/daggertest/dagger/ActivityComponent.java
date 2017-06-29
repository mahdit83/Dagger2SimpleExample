package ir.mtajik.daggertest.dagger;

import dagger.Component;
import ir.mtajik.daggertest.Database;
import ir.mtajik.daggertest.MainActivity;
import ir.mtajik.daggertest.NetworkClass;

@ActivityScope
@Component(dependencies = ApplicationComponent.class)
public interface ActivityComponent {

    void inject(MainActivity activity);

    void inject(Database database);

}
