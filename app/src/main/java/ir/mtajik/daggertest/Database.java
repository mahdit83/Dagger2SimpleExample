package ir.mtajik.daggertest;

import android.util.Log;

import javax.inject.Inject;

public class Database {

    private static final String TAG = "mahditajik.ir";
    @Inject
    User user;

    public void saveToDB(){
        Log.i(TAG, "saveToDB: "+user.toString());
    }
}
