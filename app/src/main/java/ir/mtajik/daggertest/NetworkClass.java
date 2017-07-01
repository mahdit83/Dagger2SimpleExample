package ir.mtajik.daggertest;

import android.util.Log;


public class NetworkClass {


    private static final String TAG = "mahditajik.ir";

    private User user;

    public NetworkClass(User user) {
        this.user = user;
    }

    public void request(String url) {

        //to something with user
        Log.i(TAG, "request: " + url + " user=" + user.toString());

    }
}
