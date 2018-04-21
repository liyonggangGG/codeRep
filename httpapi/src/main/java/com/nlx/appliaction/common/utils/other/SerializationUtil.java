/*
 * 文件名：SerializationUtil.java 版权：Copyright by www.huawei.com 描述： 修改人：zhaokang 修改时间：2018年3月13日 跟踪单号：
 * 修改单号： 修改内容：
 */

package com.nlx.appliaction.common.utils.other;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 〈序列化就是将一个对象转换为二进制的数据流。这样就可以进行传输，或者保存到文件中。如果一个类的对象要想实现序列化，就必须实现serializable接口。
 * 在此接口中没有任何的方法，此接口只是作为一个标识，表示本类的对象具备了序列化的能力而已。〉 〈反序列化:将二进制数据流转换成相应的对象。〉
 * 
 * @version 2018年3月13日
 * @see SerializationUtil
 * @since
 */
@SuppressWarnings("all")
public class SerializationUtil implements Serializable
{
    
    private static final long serialVersionUID = 1L;
    
    private static final Logger LOGGER =
        LoggerFactory.getLogger(SerializationUtil.class);
    
    /**
     * 序列化
     * 
     * @param object
     * @return
     */
    public static byte[] serialize(Object object)
    {
        try
        {
            ByteArrayOutputStream baos = new ByteArrayOutputStream();
            new ObjectOutputStream(baos).writeObject(object);
            return baos.toByteArray();
        }
        catch (Exception e)
        {
            LOGGER.warn("an exception occured when serialize object for redis.",
                e);
        }
        return null;
    }
    
    /**
     * 反序列化
     * 
     * @param bytes
     * @return
     */
    public static Object deserialize(byte[] bytes)
    {
        ByteArrayInputStream bais = null;
        try
        {
            bais = new ByteArrayInputStream(bytes);
            return new ObjectInputStream(bais).readObject();
        }
        catch (Exception e)
        {
            LOGGER.warn(
                "an exception occured when deserialize object for redis.",
                e);
        }
        return null;
    }
    
}