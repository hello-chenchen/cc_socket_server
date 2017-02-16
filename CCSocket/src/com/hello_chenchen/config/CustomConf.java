package com.hello_chenchen.config;

import com.hello_chenchen.common.CustomConfDefine;
import com.hello_chenchen.common.ICommonDefine;

import java.util.HashMap;

/**
 * Created by hello_chenchen on 2017/2/15.
 * jdk_version:jdk1.8.0_111
 */
public class CustomConf implements ICommonDefine {

    private HashMap<Integer , CustomConfDefine> customConfMap = new HashMap<Integer , CustomConfDefine>();

    public CustomConf()
    {
        InitConf();
    }

    public int InitConf()
    {
        //index
        Integer itKey = new Integer(1);
        CustomConfDefine value = new CustomConfDefine();
        value.index = 1;
        value.Port = 5000;//port
        customConfMap.put(itKey, value);

        return CC_SUCCESS;
    }

    public int UpdateConf(CustomConfDefine value)
    {
        Integer itKey = new Integer(value.index);
        customConfMap.put(itKey, value);
        return CC_SUCCESS;
    }

    public HashMap<Integer, CustomConfDefine> GetConfAll()
    {
        return customConfMap;
    }
}
