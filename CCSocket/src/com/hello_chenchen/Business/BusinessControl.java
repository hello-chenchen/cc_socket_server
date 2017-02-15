package com.hello_chenchen.Business;

import com.hello_chenchen.common.CustomConfDefine;
import com.hello_chenchen.common.ICommonDefine;
import com.hello_chenchen.config.CustomConf;

import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by hello_chenchen on 2017/2/15.
 * jdk_version:jdk1.8.0_111
 */
public class BusinessControl implements Runnable, ICommonDefine {

    private SocketManage socketManage;
    private CustomConf customConf;

    public BusinessControl()
    {
        InitBusCtl();
    }

    public int InitBusCtl()
    {
        socketManage = new SocketManage();
        customConf = new CustomConf();
        CustomConfDefine customConfDefine;

        HashMap<Integer , CustomConfDefine> customConfDefineHashMap
                = customConf.GetConfAll();

        Iterator iter = customConfDefineHashMap.keySet().iterator();
        while (iter.hasNext()) {
            customConfDefine = customConfDefineHashMap.get(iter.next());
            socketManage.AddSocketServer(customConfDefine.Port);
        }

        return CC_SUCCESS;
    }

    @Override
    public void run() {

    }
}
