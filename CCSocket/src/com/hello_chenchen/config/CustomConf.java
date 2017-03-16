package com.hello_chenchen.config;

import com.hello_chenchen.common.CustomConfDefine;
import com.hello_chenchen.common.ICommonDefine;
import org.dom4j.Attribute;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/**
 * Created by hello_chenchen on 2017/2/15.
 * jdk_version:jdk1.8.0_111
 */
public class CustomConf implements ICommonDefine {

    private int cap;
    private HashMap<Integer , CustomConfDefine> customConfMap = new HashMap<Integer , CustomConfDefine>();

    public CustomConf()
    {
        InitConf();
    }

    public int InitConf()
    {
        SAXReader reader = new SAXReader();
        //读取文件 转换成Document
        Document document = null;
        try {
            document = reader.read(new File("src/config.xml"));
        } catch (DocumentException e) {
            e.printStackTrace();
        }
        //获取根节点元素对象
        Element root = document.getRootElement();
        Element noteElement = root.element("CCServer");
        Attribute attribute = noteElement.attribute("index");
        String strAttribute = attribute.getValue();
        System.out.print(strAttribute);
    //index
//        Integer itKey = new Integer(1);
        this.cap = 10;
        CustomConfDefine value = new CustomConfDefine();
        value.index = 1;
        value.Port = 5000;//port
        customConfMap.put(value.index, value);
        value.index = 2;
        value.Port = 8000;//port
        customConfMap.put(value.index, value);
        value.index = 3;
        value.Port = 9000;//port
        customConfMap.put(value.index, value);


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

    public int GetCap()
    {
        return this.cap;
    }
}
