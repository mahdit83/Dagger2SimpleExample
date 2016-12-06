package ir.mtajik.daggertest;

import android.content.Context;

import javax.inject.Named;
import javax.inject.Singleton;

import dagger.Module;
import dagger.Provides;

@Module
public class MotorModule {

    Context context;
    String motoName;
    String computerName;
    String radiatorName;
    int voltage;

    public MotorModule(Context context, String computerName, int voltage , String radiatorName) {
        this.context = context;
        this.radiatorName = radiatorName;
        this.computerName = computerName;
        this.voltage = voltage;
    }

    @Provides
    @Singleton
    Motor provideMotor(Computer computer,Radiator radiator) {
        return new Motor(motoName , computer, radiator);
    }

    @Provides
    @Singleton
    @Named("Lambo")
    Motor provideLamburginiMotor(Computer computer,Radiator radiator){
        return new Motor("Lamburgini",computer, radiator);
    }

    @Provides
    @Singleton
    Computer provideComputer() {
        return new Computer(computerName, voltage);
    }


    @Provides
    @Singleton
    Radiator provideRadiator(){
        return new Radiator(radiatorName);
    }

    @Provides
    @Singleton
    Context provideContext() {
        return this.context;
    }

}
