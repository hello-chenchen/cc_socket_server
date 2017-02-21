package com.hello_chenchen.Business;

import com.hello_chenchen.common.CommonData;

/**
 * Created by hello_chenchen on 2017/2/20.
 * jdk_version:jdk1.8.0_111
 */
public class HandleByteBlockQueue extends Thread {

    private HandleMain handleMain;

    public HandleByteBlockQueue(HandleMain handleMain)
    {
        super();
        this.handleMain = handleMain;
        this.start();
    }

    @Override
    public void run() {
        Byte btMsg;
        while (true)
        {
            btMsg = CommonData.TakeByteBlockQueue();
            handleMain.HandleMsg(btMsg);
        }
    }
}
