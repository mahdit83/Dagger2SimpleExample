package ir.mtajik.daggertest;




import javax.inject.Singleton;

import dagger.Component;

@Singleton
@Component(modules = {MotorModule.class})
public interface MotorComponent {

//    Motor getMotor();
//    Computer getComputer();
//    WaterPump getWaterPump();

    void inject(MainActivity activty);
//    void inject(Motor moto);


}
