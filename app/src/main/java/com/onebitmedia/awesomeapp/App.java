package com.onebitmedia.awesomeapp;

import android.app.Application;
import android.content.Context;

import com.squareup.leakcanary.LeakCanary;
import com.squareup.leakcanary.RefWatcher;
import com.squareup.okhttp.OkHttpClient;
import com.squareup.picasso.OkHttpDownloader;
import com.squareup.picasso.Picasso;

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
                //TODO [template] add remote logger code here (e.g. Crashlytics)
            }
        });
    }

    private void initImageLoader() {
        OkHttpClient okHttpClient = new OkHttpClient();
        Picasso.setSingletonInstance(new Picasso.Builder(this)
            .downloader(new OkHttpDownloader(okHttpClient))
            .build());
    }
}
