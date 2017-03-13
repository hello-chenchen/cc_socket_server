package com.hello_chenchen.base;

import com.hello_chenchen.Business.HandleByteBlockQueue;
import com.hello_chenchen.Business.HandleData;
import com.hello_chenchen.Business.HandleMain;
import com.hello_chenchen.Business.HandleStringBlockQueue;
import com.hello_chenchen.base.SocketManage;
import com.hello_chenchen.base.SocketServer;
import com.hello_chenchen.common.CustomConfDefine;
import com.hello_chenchen.common.ICommonDefine;
import com.hello_chenchen.config.CustomConf;
import com.hello_chenchen.main.SocketMain;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

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
        customConf = new CustomConf();
        CustomConfDefine customConfDefine;

        Map<Integer , CustomConfDefine> customConfDefineHashMap
                = customConf.GetConfAll();

        Iterator iter = customConfDefineHashMap.entrySet().iterator();
        while (iter.hasNext()) {
            HashMap.Entry entry = (HashMap.Entry) iter.next();
            customConfDefine = (CustomConfDefine) entry.getValue();

            Logger logger = LoggerFactory.getLogger(ServiceManage.class);
            logger.info(Integer.toString(customConfDefine.index));

//            SocketServer value  = new SocketServer(customConfDefine.Port);
//            socketManage.AddSocketServer(customConfDefine.index, value);

//            socketManage.GetSocketServer(customConfDefine.index);
        }

        return CC_SUCCESS;
    }

    public void InitHandleBlockQueue(HandleMain handleMain)
    {
        HandleByteBlockQueue handleByteBlockQueue = new HandleByteBlockQueue(handleMain);
        HandleStringBlockQueue handleStringBlockQueue = new HandleStringBlockQueue(handleMain);
    }

}
