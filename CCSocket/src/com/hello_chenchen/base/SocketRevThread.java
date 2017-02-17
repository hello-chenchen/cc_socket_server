package com.hello_chenchen.base;

import com.hello_chenchen.common.ICommonDefine;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.util.HashMap;

/**
 * Created by hello_chenchen on 2017/2/17.
 * jdk_version:jdk1.8.0_111
 */
public class SocketRevThread extends Thread implements ICommonDefine{

    private Socket client;
    private String revMsg;
    private int clientNum;
    private HashMap<Integer, Socket> socketHashMap = new HashMap<Integer, Socket>();

    public SocketRevThread(Socket client)
    {
        super();
        this.client = client;

        this.start();
        clientNum = CC_INIT;
        revMsg = null;

        Integer itKey = clientNum;
        socketHashMap.put(itKey, this.client);
        clientNum++;
        System.out.println("Total Client:" + socketHashMap.size());
    }

    @Override
    public void run() {
        BufferedReader revBuffer = null;
        try {
            revBuffer = new BufferedReader(new InputStreamReader(client.getInputStream()));
        } catch (IOException e) {
            e.printStackTrace();
        }

        try {
            while ((revMsg = revBuffer.readLine()) != null)
                System.out.println(revMsg);
        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            System.out.println("Client Disconnected!");
            try {
                client.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
