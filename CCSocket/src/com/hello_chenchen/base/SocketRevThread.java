package com.hello_chenchen.base;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;

/**
 * Created by hello_chenchen on 2017/2/17.
 * jdk_version:jdk1.8.0_111
 */
public class SocketRevThread extends Thread{

    private Socket client;
    private String revMsg;
    public SocketRevThread(Socket client)
    {
        super();
        this.client = client;

        this.start();
        revMsg = null;
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
    }
}
