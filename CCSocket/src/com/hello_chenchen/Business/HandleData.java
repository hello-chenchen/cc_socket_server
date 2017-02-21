package com.hello_chenchen.Business;

/**
 * Created by hello_chenchen on 2017/2/20.
 * jdk_version:jdk1.8.0_111
 */
public class HandleData extends HandleMain{

    public void HandleMsg(String strValue)
    {
        System.out.println(strValue);
    }

    public void HandleMsg(Byte btValue)
    {
        System.out.println(btValue);
    }
}
