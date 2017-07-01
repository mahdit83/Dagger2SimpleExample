package ir.mtajik.daggertest;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

public class Database {

    private static final String TAG = "mahditajik.ir";

    @Inject
    User user;
    private Context context;

    @Inject
    public Database(Context context) {
        this.context = context;

    }

    public void initialize() {
        Log.i(TAG, "initialize with context: " + context.toString());

    }

    public void saveToDB() {
        Log.i(TAG, "saveToDB: " + user.toString());
    }
}
