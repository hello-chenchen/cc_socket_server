package com.hello_chenchen.main;

import com.hello_chenchen.Business.HandleData;
import com.hello_chenchen.base.ServiceManage;
import java.io.IOException;

/**
 * Created by hello_chenchen on 2017/2/12.
 */
public class SocketMain {

    public static void main(String[] args) throws IOException {

        HandleData handleData = new HandleData();
        ServiceManage serviceManage = new ServiceManage();
        serviceManage.InitHandleBlockQueue(handleData);
    }
}
