package com.onebitmedia.awesomeapp;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;

import timber.log.Timber;

public class App extends Application {

    private static App instance;
    private RefWatcher refWatcher;

    public static App getInstance() {
        return instance;
    }

    public static RefWatcher getRefWatcher(Context context) {
        return ((App) context.getApplicationContext()).refWatcher;
    }

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;

        initMemoryLeakWatcher();
        initLogger();
        initImageLoader();
    }

    private void initMemoryLeakWatcher() {
        LeakCanary.install(this);
    }

    private void initLogger() {
        Timber.plant(BuildConfig.DEBUG ? new Timber.DebugTree() : new Timber.Tree() {
            @Override
            protected void log(int priority, String tag, String message, Throwable t) {
                //TODO [template] add remote logger initialization (e.g. Crashlytics)
            }
        });
    }

    private void initImageLoader() {
        //TODO [template] add image loader initialization (e.g. Picasso, Glide, etc)
    }
}
