package com.example.dellayush.intentproject;

import android.app.IntentService;
import android.content.Intent;
import android.util.Log;

public class IntentServiceExample extends IntentService {

    private static final String TAG="com.example.dellayush.intentproject";

    public IntentServiceExample(String name) {
        super("IntentServiceExample");
    }

    @Override
    protected void onHandleIntent(Intent intent) {
        Log.i(TAG,"The Service which does nothing has started");
    }
}
