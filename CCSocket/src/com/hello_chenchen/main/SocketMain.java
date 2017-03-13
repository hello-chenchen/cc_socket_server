package com.hello_chenchen.main;

import com.hello_chenchen.Business.HandleData;
import com.hello_chenchen.base.ServiceManage;
import com.hello_chenchen.base.SocketServer;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.io.IOException;

/**
 * Created by hello_chenchen on 2017/2/12.
 */
public class SocketMain {

    public static void main(String[] args) throws IOException {

        Logger logger = LoggerFactory.getLogger(SocketMain.class);

        logger.trace("chenchen");
        logger.info("chenchen");
        logger.debug("chenchen");
        logger.warn("chenchen");
        logger.error("chenchen");

//        SocketServer value  = new SocketServer(8000);
//        SocketServer value1  = new SocketServer(5000);
        HandleData handleData = new HandleData();
        ServiceManage serviceManage = new ServiceManage();
//        serviceManage.InitHandleBlockQueue(handleData);
    }
}
