package com.abevid.abevid;

import android.app.Application;
import android.os.SystemClock;

import java.util.concurrent.TimeUnit;

public class Startup extends Application {

    @Override
    public void onCreate() {
        super.onCreate();

        // Give time for Splash Screen
        SystemClock.sleep(TimeUnit.SECONDS.toMillis(4));
    }
}