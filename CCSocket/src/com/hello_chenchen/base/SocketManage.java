package com.hello_chenchen.base;

import com.hello_chenchen.base.SocketServer;

import java.util.HashMap;

/**
 * Created by root on 17-2-15.
 * jdk_versio:1.8
 */
public class SocketManage {

    private HashMap<Integer , SocketServer> socketMamageMap;
    private SocketServer socketServer;

    public SocketManage()
    {
        socketMamageMap = new HashMap<Integer, SocketServer>();
    }

    public void AddSocketServer(int key, SocketServer socketServer)
    {
        Integer itKey = new Integer(key);
        socketMamageMap.put(itKey, socketServer);
    }

    public SocketServer GetSocketServer(int key)
    {
        Integer itKey = new Integer(key);
        SocketServer ret = socketMamageMap.get(itKey);
        return ret;
    }
}
