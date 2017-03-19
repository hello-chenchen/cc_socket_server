package com.hello_chenchen.common;

import com.hello_chenchen.config.CustomConf;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by root on 17-2-21.
 */
public class CommonData implements ICommonDefine{

    private static int cap = CustomConf.getInstance().GetCap();
    private static BlockingQueue<String> strBlockQueue = new ArrayBlockingQueue<String>(cap);
    private static BlockingQueue<Byte> btBlockQueue = new ArrayBlockingQueue<Byte>(cap);

    public static int PutStringBlockQueue(String strValue)
    {
        try {
            strBlockQueue.put(strValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return CC_FAIL;
        }
        return CC_SUCCESS;
    }

    public static String TakeStringBlockQueue()
    {
        String strRet = "Init";
        try {
            strRet = strBlockQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return "Error";
        }
        return strRet;
    }

    public static int PutByteBlockQueue(Byte btValue)
    {
        try {
            btBlockQueue.put(btValue);
        } catch (InterruptedException e) {
            e.printStackTrace();
            return CC_FAIL;
        }
        return CC_SUCCESS;
    }

    public static Byte TakeByteBlockQueue()
    {
        Byte btRet = 0;
        try {
            btRet = btBlockQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
            return 1;
        }
        return btRet;
    }
}
