package ir.mtajik.daggertest;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

public class Database {

    private static final String TAG = "mahditajik.ir";

    @Inject
    User user;
    private Context context;

    public Database(Context context) {
        this.context = context;

        //this line added for using field injection (User)
        ((DaggerTestApplication)context.getApplicationContext()).getAppComponent().inject(this);

    }

    public void initialize() {
        Log.i(TAG, "initialize with context: " + context.toString());

    }

    public void saveToDB() {
        Log.i(TAG, "saveToDB: " + user.toString());
    }
}
