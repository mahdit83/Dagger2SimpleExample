package ir.mtajik.daggertest;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;

import javax.inject.Inject;

public class MainActivity extends AppCompatActivity {

    @Inject
    NetworkClass networkClass;

    @Inject
    Database database;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        initialize();
        webRequest();

    }

    private void webRequest() {

        networkClass.request("https://google.com");
        database.saveToDB();
    }

    private void initialize() {

        ((DaggerTestApplication) getApplicationContext()).getActivityComponent().inject(this);
    }


}
