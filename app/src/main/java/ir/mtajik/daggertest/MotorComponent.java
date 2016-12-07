package ir.mtajik.daggertest;




import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MotorModule.class})
public interface MotorComponent {

    void  inject(MainActivity activty);

}
