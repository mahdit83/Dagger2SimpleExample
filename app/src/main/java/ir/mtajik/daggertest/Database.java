package ir.mtajik.daggertest;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;

public class Database {

    private static final String TAG = "mahditajik.ir";
    private Context context;

    @Inject
    public Database(Context context, User user) {
        this.context = context;
        this.user = user;

        ((DaggerTestApplication)context.getApplicationContext()).getActivityComponent().inject(this);
    }

    @Inject
    User user;

    public void initialize(){
        Log.i(TAG, "initialize with context: "+context.toString());

    }

    public void saveToDB(){
        Log.i(TAG, "saveToDB: "+user.toString());
    }
}
