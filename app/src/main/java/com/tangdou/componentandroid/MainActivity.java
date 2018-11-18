package com.tangdou.componentandroid;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import com.alibaba.android.arouter.launcher.ARouter;
import com.tangdou.libplayer.PlayerActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


//        Intent intent = new Intent(this, PlayerActivity.class);
//        startActivity(intent);

    }

    // 跳转到直播组件
    public void toLiveComponent(View view) {
        ARouter.getInstance().build("/live/act/living").navigation();

    }

    // 跳转到播放器组件
    public void toPlayerComponent(View view) {
        ARouter.getInstance().build("/player/act/play").navigation();

    }
}
