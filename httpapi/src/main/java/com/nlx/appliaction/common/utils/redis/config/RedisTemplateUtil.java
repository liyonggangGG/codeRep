package com.nlx.appliaction.common.utils.redis.config;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.nlx.appliaction.common.utils.other.SerializationUtil;

import redis.clients.jedis.JedisCluster;

/**
 * 〈redis缓存工具类〉 〈功能详细描述〉
 * 
 * @see RedisTemplateUtil
 * @since
 */
@SuppressWarnings("all")
@Component
public class RedisTemplateUtil
{
    
    /**
     * 日志对象
     */
    private static final Logger log =
        LoggerFactory.getLogger(RedisTemplateUtil.class);
    
    /**
     * jedis对象
     */
    @Autowired
    private JedisCluster jedis;
    
    /**
     * 设置缓存
     * 
     * @param key 缓存key
     * @param value 缓存value
     */
    public void set(String key, String value)
    {
        jedis.set(key, value);
        log.debug("RedisUtil:set cache key={},value={}", key, value);
    }
    
    /**
     * 设置缓存并设置超时时间
     * 
     * @param key 缓存key
     * @param value 缓存value
     * @param expireTime 过期时间(单位：秒)
     */
    public void set(String key, String value, int expireTime)
    {
        jedis.setex(key, expireTime, value);
        log.debug("RedisUtil:set cache key={},value={},expireTime={}",
            key,
            value,
            expireTime);
    }
    
    /**
     * 获取指定key的缓存
     * 
     * @param key
     * @return 返回指定key的value
     */
    public String get(String key)
    {
        return jedis.get(key);
    }
    
    /**
     * 设置 list Description: <br>
     * 1、…<br>
     * 2、…<br>
     * Implement: <br>
     * 1、…<br>
     * 2、…<br>
     * 
     * @param key key
     * @param list list对象
     * @see
     */
    public <T> void setList(String key, List<T> list)
    {
        try
        {
            jedis.set(key.getBytes(), SerializationUtil.serialize(list));
        }
        catch (Exception e)
        {
            log.error("setList key error key: {} error:  ", key, e);
        }
    }
    
    /**
     * 设置 list Description: <br>
     * 1、…<br>
     * 2、…<br>
     * Implement: <br>
     * 1、…<br>
     * 2、…<br>
     * 
     * @param key key
     * @param list list对象
     * @param expireTime 超时时间(单位：秒)
     */
    public <T> void setList(String key, List<T> list, int expireTime)
    {
        try
        {
            jedis.setex(key.getBytes(),
                expireTime,
                SerializationUtil.serialize(list));
        }
        catch (Exception e)
        {
            log.error("setList key error key: {} error: ", key, e);
        }
    }
    
    /**
     * 设置 list Description: <br>
     * 1、…<br>
     * 2、…<br>
     * Implement: <br>
     * 1、…<br>
     * 2、…<br>
     * 
     * @param key key
     * @param list LinkedList对象
     * @see
     */
    public <T> void setLinkedList(String key, LinkedList<T> list)
    {
        try
        {
            jedis.set(key.getBytes(), SerializationUtil.serialize(list));
        }
        catch (Exception e)
        {
            log.error("setList key error key: {} error:", key, e);
        }
    }
    
    /**
     * 设置 list Description: <br>
     * 1、…<br>
     * 2、…<br>
     * Implement: <br>
     * 1、…<br>
     * 2、…<br>
     * 
     * @param key key
     * @param list LinkedList对象
     * @param expireTime 超时时间(单位：秒)
     */
    public <T> void setLinkedList(String key, LinkedList<T> list,
        int expireTime)
    {
        try
        {
            jedis.setex(key.getBytes(),
                expireTime,
                SerializationUtil.serialize(list));
        }
        catch (Exception e)
        {
            log.error("setList key error key: {} error:", key, e);
        }
    }
    
    /**
     * 获取list
     * 
     * @param key key
     * @return list 返回list对象
     */
    public <T> List<T> getList(String key)
    {
        try
        {
            byte[] in = jedis.get(key.getBytes());
            List<T> list = (List<T>)SerializationUtil.deserialize(in);
            return list;
        }
        catch (Exception e)
        {
            log.error("setList key error key: {} error: ", key, e);
            return Collections.emptyList();
        }
        
    }
    
    /**
     * 获取LinkedList
     * 
     * @param key key
     * @return list 返回list对象
     */
    public <T> LinkedList<T> getLinkedList(String key)
    {
        try
        {
            return (LinkedList<T>)SerializationUtil
                .deserialize(jedis.get(key.getBytes()));
        }
        catch (Exception e)
        {
            log.error("getList key error key: {} error:", key, e);
            return null;
        }
        
    }
    
    /**
     * 设置 map
     * 
     * @param key key
     * @param map map对象
     */
    public <T> void setMap(String key, Map<String, T> map)
    {
        try
        {
            jedis.set(key.getBytes(), SerializationUtil.serialize(map));
        }
        catch (Exception e)
        {
            log.error("setMap key error key: " + key + " error:" + e);
        }
    }
    
    /**
     * 设置 map
     * 
     * @param key key
     * @param map map对象
     * @param expireTime 超时时间(单位：秒)
     */
    public <T> void setMap(String key, Map<String, T> map, int expireTime)
    {
        try
        {
            jedis.setex(key.getBytes(),
                expireTime,
                SerializationUtil.serialize(map));
        }
        catch (Exception e)
        {
            log.error("setMap key error key: " + key + " error:" + e);
        }
    }
    
    /**
     * 获取Map
     * 
     * @param key key
     * @return 返回map对象
     */
    public <T> Map<String, T> getMap(String key)
    {
        try
        {
            return (Map<String, T>)SerializationUtil
                .deserialize(jedis.get(key.getBytes()));
        }
        catch (Exception e)
        {
            log.error("getMap key error key: " + key + " error:" + e);
            return null;
        }
        
    }
    
    /**
     * 获取Map
     * 
     * @param key 取map的key
     * @param skey 取map里面数据的key
     * @return
     * @return 返回map对象
     */
    public <T> T getMap(String key, String skey)
    {
        try
        {
            return ((Map<String, T>)SerializationUtil
                .deserialize(key.getBytes())).get(skey);
        }
        catch (Exception e)
        {
            log.error("getMap key error key: {} error:", key, e);
            return null;
        }
        
    }
    
    /**
     * 设置 object
     * 
     * @param key key
     * @param obj object对象
     */
    public void setObject(String key, Object obj)
    {
        try
        {
            jedis.set(key.getBytes(), SerializationUtil.serialize(obj));
        }
        catch (Exception e)
        {
            log.error("setObject key error : {}", e);
        }
    }
    
    /**
     * 设置 object并设置超时时间
     * 
     * @param key key
     * @param obj object对象
     * @param expireTime 超时时间(单位：秒)
     */
    public void setObject(String key, Object obj, int expireTime)
    {
        try
        {
            jedis.setex(key.getBytes(),
                expireTime,
                SerializationUtil.serialize(obj));
        }
        catch (Exception e)
        {
            log.error("setObject key error : {}", e);
        }
    }
    
    /**
     * 获得object
     * 
     * @param key key
     * @return object对象
     */
    public Object getObject(String key)
    {
        try
        {
            return SerializationUtil.deserialize(jedis.get(key.getBytes()));
        }
        catch (Exception e)
        {
            log.error("getObject key error key:{}  error:", key, e);
            return null;
        }
    }
    
    /**
     * 删除指定redis的key
     * 
     * @param key 缓存key
     */
    public void delete(String key)
    {
        jedis.del(key);
        log.debug("RedisUtil:delete cache key={}", key);
    }
    
    /**
     * 删除指定redis的key
     * 
     * @param key
     * @date 2018年4月8日
     */
    public void delete(byte[] key)
    {
        jedis.del(key);
        log.debug("RedisUtil:delete cache key={}", key);
    }
    
    /**
     * 返回jedis对象，使用更灵活。 本类中把jedis中好多方法都屏蔽了。
     * 
     * @return
     */
    public JedisCluster getJedis()
    {
        return this.jedis;
    }
    
    /**
     * 判断对象是否存在。
     * 
     * @param key
     * @return
     */
    public boolean exists(String key)
    {
        boolean res = this.jedis.exists(key);
        log.debug("RedisUtil:exists key={}, res={}", key, res);
        return res;
    }
    
    /**
     * 判断对象是否存在。
     * 
     * @param key
     * @return
     */
    public boolean exists(byte[] key)
    {
        boolean res = this.jedis.exists(key);
        log.debug("RedisUtil:exists key={}, res={}", new String(key), res);
        return res;
    }
    
}