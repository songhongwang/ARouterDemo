package com.tangdou.liblive;

import android.app.Activity;
import android.app.Fragment;
import android.net.Uri;
import android.os.Bundle;
import android.os.PersistableBundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.alibaba.android.arouter.launcher.ARouter;
import com.tangdou.libbase.service.IPlayerService;

/**
 * Created by vigorous on 18/11/4.
 */

@Route(path = "/live/act/living")
public class LiveActivity extends AppCompatActivity {
    private IPlayerService mIPlayerService;
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);


        setContentView(R.layout.live_activity);

        mIPlayerService = (IPlayerService) ARouter.getInstance().build("/player/frag/play").navigation();
        getFragmentManager().beginTransaction().add(R.id.fl_container, (Fragment) mIPlayerService).commit();

        Uri mUri = Uri.parse("http://covertness.qiniudn.com/android_zaixianyingyinbofangqi_test_baseline.mp4");

        mIPlayerService.setVideoPath(mUri);

    }


}
