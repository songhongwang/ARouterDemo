package com.tangdou.libplayer;

import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v7.app.AppCompatActivity;

import com.alibaba.android.arouter.facade.annotation.Route;

/**
 * Created by vigorous on 18/11/4.
 */

@Route(path = "/player/act/play")
public class PlayerActivity extends AppCompatActivity {

    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        setContentView(R.layout.player_activity);

        initUI();
    }

    private void initUI() {

        Uri mUri = Uri.parse("http://www.w3school.com.cn/example/html5/mov_bbb.mp4");

        PlayerFragment playerFragment = new PlayerFragment();
        playerFragment.setVideoPath(mUri);


        getFragmentManager().beginTransaction().replace(R.id.fl_player_container, playerFragment).commit();
    }
}
