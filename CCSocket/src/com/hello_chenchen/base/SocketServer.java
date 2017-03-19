package com.hello_chenchen.base;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by hello_chenchen on 2017/2/12.
 * jdk_version:jdk1.8.0_111
 */
public class SocketServer extends Thread {

    private int socketServerPort;           //socket连接port
    private ServerSocket serverSocket;  //服务器socket
    private Socket revSocket;


    /**
     * 构造函数初始化时，实例化ServerScoket
     * @param Port 监听的端口
     */
    public SocketServer(int Port){
        super();
        this.socketServerPort = Port;

        try {
            serverSocket = new ServerSocket(socketServerPort);
            System.out.println("Start Server socketServerPort:" + socketServerPort);
        } catch (IOException e) {
            e.printStackTrace();
        }

        this.start();
    }

    @Override
    public void run() {

            try {
                while (true) {
                    revSocket = serverSocket.accept();
                    System.out.println("Accept...");
                    new SocketRevThread(revSocket);
                }
            } catch (IOException e){
                System.out.println("client disconnected!");
                e.printStackTrace();
            } finally {
                System.out.println("Server disconnected!");
                try {
                    serverSocket.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }

//        }
    }

}
