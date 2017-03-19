package com.hello_chenchen.base;

import com.hello_chenchen.Business.HandleByteBlockQueue;
import com.hello_chenchen.Business.HandleMain;
import com.hello_chenchen.Business.HandleStringBlockQueue;
import com.hello_chenchen.common.CustomConfDefine;
import com.hello_chenchen.common.ICommonDefine;
import com.hello_chenchen.config.CustomConf;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

/**
 * Created by hello_chenchen on 2017/2/15.
 * jdk_version:jdk1.8.0_111
 */
public class ServiceManage implements ICommonDefine {

    private SocketManage socketManage;
    private CustomConf customConf;

    public ServiceManage()
    {
        InitBusCtl();
    }

    private int InitBusCtl()
    {
        socketManage = new SocketManage();
        customConf = CustomConf.getInstance();

        Map<Integer , CustomConfDefine> customConfDefineHashMap
                = customConf.GetConfAll();

        Iterator iter = customConfDefineHashMap.entrySet().iterator();
        while (iter.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry) iter.next();
            CustomConfDefine customConfDefine = (CustomConfDefine) entry.getValue();

            SocketServer value  = new SocketServer(customConfDefine.Port);
            socketManage.AddSocketServer(customConfDefine.index, value);

        }

        return CC_SUCCESS;
    }

    public void InitHandleBlockQueue(HandleMain handleMain)
    {
        HandleByteBlockQueue handleByteBlockQueue = new HandleByteBlockQueue(handleMain);
        HandleStringBlockQueue handleStringBlockQueue = new HandleStringBlockQueue(handleMain);
    }

}
