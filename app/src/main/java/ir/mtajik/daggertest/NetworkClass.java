package ir.mtajik.daggertest;

import android.content.Context;
import android.util.Log;

import javax.inject.Inject;


public class NetworkClass {


    @Inject
    User user;

    private static final String TAG = "mahditajik.ir";
    private Context context;

    public NetworkClass(Context context) {
        this.context = context;
    }

    public void request(String url) {

        //to something with user
        Log.i(TAG, "request: " + url+" user="+user.toString());

    }
}
