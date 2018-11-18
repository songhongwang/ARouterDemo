package com.tangdou.libbase.service;


import android.net.Uri;

import com.alibaba.android.arouter.facade.template.IProvider;

/**
 * Created by vigorous on 18/11/18.
 */

public interface IPlayerService extends IProvider {

    void setVideoPath(Uri uri);
}
