package com.hello_chenchen.base;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.HashMap;

/**
 * Created by hello_chenchen on 2017/2/12.
 * jdk_version:jdk1.8.0_111
 */
public class SocketServer implements Runnable {

    private int socketServerPort;           //socket连接port
    private ServerSocket serverSocket;  //服务器socket
    private Socket revSocket;
    private int clientNum;
    private HashMap<Integer, Socket> socketHashMap;


    /**
     * 构造函数初始化时，实例化ServerScoket
     * @param Port 监听的端口
     */
    public SocketServer(int Port){
        this.socketServerPort = Port;

        try {
            serverSocket = new ServerSocket(socketServerPort);
            System.out.println("Start Server socketServerPort:" + socketServerPort);
        } catch (IOException e) {
            e.printStackTrace();
        }

        clientNum = 0;
    }

    @Override
    public void run() {

        while (true){
            try {
                revSocket = serverSocket.accept();
                System.out.println("Accept...");
                new SocketRevThread(revSocket);

                Integer itKey = clientNum;
                socketHashMap.put(itKey, revSocket);
                clientNum++;
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    /**
     * 获取接收到的消息，有可能是null
     * @return String接收到的消息
     */
//    public String getReceiveMsg()
//    {
//        return revMsg;
//    }
}
