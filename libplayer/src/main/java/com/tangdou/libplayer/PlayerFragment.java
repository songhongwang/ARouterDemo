package com.tangdou.libplayer;

import android.app.Fragment;
import android.content.Context;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.util.TypedValue;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.RelativeLayout;
import android.widget.TextView;

import com.alibaba.android.arouter.facade.annotation.Route;
import com.dl7.player.media.IjkPlayerView;
import com.tangdou.libbase.service.IPlayerService;

/**
 * Created by vigorous on 18/11/4.
 */

@Route(path = "/player/frag/play")
public class PlayerFragment extends Fragment implements IPlayerService{
    private IjkPlayerView mPlayerView;
    private Uri mUri;

    @Nullable
    @Override
    public View onCreateView(LayoutInflater inflater, @Nullable ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.player_fragment, null);
        return view;
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        super.onViewCreated(view, savedInstanceState);

        mPlayerView = new IjkPlayerView(getActivity());

        LinearLayout playerContainer = view.findViewById(R.id.ll_player_container);
        playerContainer.addView(mPlayerView);


        mPlayerView.init()
                .setVideoPath(mUri)
                .setMediaQuality(IjkPlayerView.MEDIA_QUALITY_HIGH)
                .enableDanmaku()
                .start();
    }

    @Override
    public void setVideoPath(Uri uri) {
        mUri = uri;
    }

    @Override
    public void init(Context context) {

    }


    @Override
    public void onPause() {
        super.onPause();
        mPlayerView.onPause();
    }

    @Override
    public void onResume() {
        super.onResume();
        mPlayerView.onResume();
    }
}
