package com.hello_chenchen.main;

import com.hello_chenchen.base.SocketServer;

import java.io.IOException;

/**
 * Created by hello_chenchen on 2017/2/12.
 */
public class SocketMain {

    public static void main(String[] args) throws IOException {
        SocketServer serverSocket = new SocketServer(5000);
        Thread serverThread = new Thread(serverSocket);
        serverThread.start();
    }
}
