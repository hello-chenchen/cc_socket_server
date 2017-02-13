package com.hello_chenchen.base;

import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

/**
 * Created by hello_chenchen on 2017/2/12.
 */
public class SocketServer implements Runnable {

    private int port;           //socket连接port
    private ServerSocket serverSocket;  //服务器socket
    private Socket revSocket;

    public SocketServer(int Port){
        this.port   = Port;

        try {
            serverSocket = new ServerSocket(port);
            System.out.println("Start Server port:" + port);
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    @Override
    public void run() {

        while (true) {
            try {
                revSocket = serverSocket.accept();
                System.out.println("Accept...");
            } catch (IOException e) {
                e.printStackTrace();
            }

            BufferedReader revBuffer = null;
            try {
                revBuffer = new BufferedReader(new InputStreamReader(revSocket.getInputStream()));
            } catch (IOException e) {
                e.printStackTrace();
            }

            String revMsg = null;

            try {
                while ((revMsg = revBuffer.readLine()) != null)
                    System.out.println(revMsg);
            } catch (IOException e) {
                e.printStackTrace();
            }
        }

    }
}
