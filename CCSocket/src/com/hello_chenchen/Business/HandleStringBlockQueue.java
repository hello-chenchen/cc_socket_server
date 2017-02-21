package com.hello_chenchen.Business;

import com.hello_chenchen.common.CommonData;

/**
 * Created by hello_chenchen on 2017/2/20.
 * jdk_version:jdk1.8.0_111
 */
public class HandleStringBlockQueue extends Thread {

    private HandleMain handleMain;

    public HandleStringBlockQueue(HandleMain handleMain)
    {
        super();
        this.handleMain = handleMain;
        this.start();
    }

    @Override
    public void run() {
        String strMsg;
        while (true)
        {
            strMsg = CommonData.TakeStringBlockQueue();
            handleMain.HandleMsg(strMsg);
        }
    }
}
