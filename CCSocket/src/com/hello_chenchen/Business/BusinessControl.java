package com.hello_chenchen.Business;

import com.hello_chenchen.base.SocketServer;

/**
 * Created by hello_chenchen on 2017/2/15.
 * jdk_version:jdk1.8.0_111
 */
public class BusinessControl implements Runnable {

    private SocketManage socketManage;

    public BusinessControl()
    {
        socketManage = new SocketManage();
    }

    @Override
    public void run() {

    }
}
