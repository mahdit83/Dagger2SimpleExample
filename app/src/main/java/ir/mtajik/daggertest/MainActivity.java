package ir.mtajik.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import javax.inject.Inject;
import javax.inject.Named;

public class MainActivity extends AppCompatActivity {

    @Inject
    @Named("Lambo")
    public Motor motor;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        generateDaggerCode();

        createCar(motor);

    }

    private void createCar(Motor motor) {

        if (motor != null) {
            Toast.makeText(this, "car is created", Toast.LENGTH_SHORT).show();
        }

        startCar(motor);
    }

    private void startCar(Motor motor) {
        if (motor.startEngin()) {

            Toast.makeText(this, "it is started", Toast.LENGTH_SHORT).show();
            Toast.makeText(this, "motor name is:" + motor.getName(), Toast.LENGTH_SHORT).show();
        } else {
            Toast.makeText(this, "motor is not provided", Toast.LENGTH_SHORT).show();
        }
    }

    private void generateDaggerCode() {
        DaggerMotorComponent.builder().motorModule(new MotorModule
                (this, "Computer name",12, "radiator name")).build().inject(this);

    }

}
