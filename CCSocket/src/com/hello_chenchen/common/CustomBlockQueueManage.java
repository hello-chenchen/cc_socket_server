package com.hello_chenchen.common;

import java.util.Objects;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.BlockingQueue;

/**
 * Created by hello_chenchen on 2017/2/20.
 * jdk_version:jdk1.8.0_111
 */
public class CustomBlockQueueManage implements ICommonDefine, Runnable {
    private BlockingQueue blockQueue;
    private int type;
//    private BlockingQueue<Byte> btBlockQueue;

    public CustomBlockQueueManage(int type, BlockingQueue blockQueue)
    {
        this.type = type;
        this.blockQueue = blockQueue;
//        switch (type)
//        {
//            case CC_TYPE_BQ_STRING:
//            {
//                blockQueue = new ArrayBlockingQueue<String>(capacity);
//                break;
//            }
//            case CC_TYPE_BQ_BYTE:
//            {
//                blockQueue = new ArrayBlockingQueue<Byte>(capacity);
//                break;
//            }
//            default:
//            {
//                break;
//            }
//        }
    }

    /**
     * 填充数据
     * @param value Object可能为String 或者 Byte
     */
    public void PutBlockQueue(Object value) {
        try {
            blockQueue.put(value);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    @Override
    public void run() {
        Object blockQueueData;
        try {
            blockQueueData = blockQueue.take();
        } catch (InterruptedException e) {
            e.printStackTrace();
        }

        switch (this.type)
        {
            case CC_TYPE_BQ_STRING:
            {

                break;
            }
            case CC_TYPE_BQ_BYTE:
            {
                blockQueue = new ArrayBlockingQueue<Byte>(capacity);
                break;
            }
            default:
            {
                break;
            }
        }
    }
}
