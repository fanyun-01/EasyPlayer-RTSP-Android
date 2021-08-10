package org.easydarwin.easyplayer;

import android.app.Application;
import android.database.sqlite.SQLiteDatabase;

import org.easydarwin.easyplayer.data.EasyDBHelper;
import org.easydarwin.video.Client;

public class TheApp extends Application {

    public static SQLiteDatabase sDB;
    public static int activeDays = 9999;

    @Override
    public void onCreate() {
        super.onCreate();

        activeDays = Client.getActiveDays(this, BuildConfig.RTSP_KEY);
        sDB = new EasyDBHelper(this).getWritableDatabase();
    }
}
