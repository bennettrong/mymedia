package com.qyrong.mymedia;

import android.app.Application;

import com.facebook.drawee.backends.pipeline.Fresco;


/**
 * Created by bennett on 11/22/16.
 */

public class MediaApplication extends Application{

    @Override
    public void onCreate() {
        super.onCreate();
        Fresco.initialize(this);

    }
}
