package xyz.doikki.dkplayer.app;

import android.app.Application;

import xyz.doikki.videoplayer.BuildConfig;
import xyz.doikki.videoplayer.ijk.IjkPlayerFactory;
import xyz.doikki.videoplayer.player.VideoViewConfig;
import xyz.doikki.videoplayer.player.VideoViewManager;

/**
 * app
 * Created by Doikki on 2017/4/22.
 */

public class MyApplication extends Application {

    private static MyApplication instance;

    @Override
    public void onCreate() {
        super.onCreate();
        instance = this;
        //播放器配置，注意：此为全局配置，按需开启
        VideoViewManager.setConfig(VideoViewConfig.newBuilder()
                .setLogEnabled(BuildConfig.DEBUG)//调试的时候请打开日志，方便排错
                .setPlayerFactory(IjkPlayerFactory.create())
//                .setPlayerFactory(ExoMediaPlayerFactory.create())
//                .setRenderViewFactory(SurfaceRenderViewFactory.create())
//                .setEnableOrientation(true)
//                .setEnableAudioFocus(false)
//                .setScreenScaleType(VideoView.SCREEN_SCALE_MATCH_PARENT)
//                .setAdaptCutout(false)
//                .setPlayOnMobileNetwork(true)
//                .setProgressManager(new ProgressManagerImpl())
                .build());

//        if (BuildConfig.DEBUG) {
//            StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectAll().penaltyLog().build());
//            StrictMode.setVmPolicy(new StrictMode.VmPolicy.Builder().detectAll().penaltyLog().build());
//        }
    }

    public static MyApplication getInstance() {
        return instance;
    }
}