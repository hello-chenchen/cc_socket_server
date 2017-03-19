package com.hello_chenchen.config;

import com.hello_chenchen.common.CCLogger;
import com.hello_chenchen.common.CustomConfDefine;
import com.hello_chenchen.common.ICommonDefine;
import org.dom4j.Document;
import org.dom4j.DocumentException;
import org.dom4j.Element;
import org.dom4j.io.SAXReader;

import java.io.File;
import java.util.HashMap;
import java.util.Iterator;

/**
 * Created by hello_chenchen on 2017/2/15.
 * jdk_version:jdk1.8.0_111
 */
public class CustomConf implements ICommonDefine {

    private static CustomConf instance = new CustomConf();
    public static CustomConf getInstance() {
        return instance;
    }

    private int caps = CC_INIT;
    private HashMap<Integer , CustomConfDefine> customConfMap = new HashMap<Integer , CustomConfDefine>();

    private CustomConf()
    {
        InitConf();
    }

    private int InitConf()
    {
        SAXReader reader = new SAXReader();
        //读取文件 转换成Document
        Document document = null;
        try {
            document = reader.read(new File("src/config.xml"));
        } catch (DocumentException e) {
            e.printStackTrace();
            CCLogger.error(e.getMessage());
        }
        //获取根节点元素对象
        Element root = document.getRootElement();

        //解析CCServer节点属性
        PraseServerConfig(root);

        //解析CCCaps节点信息
        PraseCaps(root);


        return CC_SUCCESS;
    }

    private void PraseCaps(Element node){

        Element noteElement = node.element("CCCaps");

        String strCaps = noteElement.getText();
        this.caps = Integer.parseInt(strCaps);
    }

    //遍历当前所有服务端端口配置
    private void PraseServerConfig(Element node){

        Iterator<Element> iterator = node.elementIterator();
        while(iterator.hasNext()){
            Element element = iterator.next();
            if(element.getName().equals("CCServer"))
            {
                CustomConfDefine value = new CustomConfDefine();

                String strIndexValue = element.attribute("index").getValue();
                value.index = Integer.parseInt(strIndexValue);
                String strPortValue = element.attribute("port").getValue();
                value.Port = Integer.parseInt(strPortValue);//port
                customConfMap.put(value.index, value);
            }

        }

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

    public int GetCap(){ return caps; }
}
