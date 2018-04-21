package com.nlx.appliaction.common.utils.other;

import java.io.Serializable;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

import com.alibaba.fastjson.JSONObject;

/**
 * Map工具类
 * 
 */
public class MapUtil implements Serializable
{
    private static final long serialVersionUID = 1L;
    
    /**
     * 将指定集合添加指定元素
     * 
     * @param map
     * @param k1
     * @param v1
     * @param k2
     * @param v2
     * @return
     */
    public static <K, V> Map<K, V> of(Map<K, V> map, K k1, V v1, K k2, V v2)
    {
        map.put(k1, v1);
        map.put(k2, v2);
        return map;
    }
    
    /**
     * 将指定集合添加指定元素
     * 
     * @param map
     * @param k1
     * @param v1
     * @return
     */
    public static <K, V> Map<K, V> of(Map<K, V> map, K k1, V v1)
    {
        map.put(k1, v1);
        return map;
    }
    
    /**
     * 将指定集合添加指定元素
     * 
     * @param map
     * @param k1
     * @param v1
     * @param k2
     * @param v2
     * @param k3
     * @param v3
     * @return
     */
    public static <K, V> Map<K, V> of(Map<K, V> map, K k1, V v1, K k2, V v2,
        K k3, V v3)
    {
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        return map;
    }
    
    /**
     * 将指定集合添加指定元素
     * 
     * @param map
     * @param k1
     * @param v1
     * @param k2
     * @param v2
     * @param k3
     * @param v3
     * @param k4
     * @param v4
     * @return
     */
    public static <K, V> Map<K, V> of(Map<K, V> map, K k1, V v1, K k2, V v2,
        K k3, V v3, K k4, V v4)
    {
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        return map;
    }
    
    /**
     * 将指定集合添加指定元素
     * 
     * @param map
     * @param k1
     * @param v1
     * @param k2
     * @param v2
     * @param k3
     * @param v3
     * @param k4
     * @param v4
     * @param k5
     * @param v5
     * @return
     */
    public static <K, V> Map<K, V> of(Map<K, V> map, K k1, V v1, K k2, V v2,
        K k3, V v3, K k4, V v4, K k5, V v5)
    {
        map.put(k1, v1);
        map.put(k2, v2);
        map.put(k3, v3);
        map.put(k4, v4);
        map.put(k5, v5);
        return map;
    }
    
    /**
     * 通过key集合和value集合向map里添加元素，集合键值必须保证对应的键值索引一致，keyList内元素自行保证不重复
     * 
     * @param map
     * @param keyList
     * @param valueList
     * @return
     */
    public static <K, V> Map<K, V> of(Map<K, V> map, List<K> keyList,
        List<V> valueList)
    {
        for (int i = 0; i < keyList.size(); i++)
        {
            map.put(keyList.get(i), valueList.get(i));
        }
        return map;
    }
    
    /**
     * json转Map<String,List<Object>> 类型
     * 
     * @param jsonStr 要转换的json字符串
     * @param classes List中Object的类型
     * @return
     */
    public static <V> Map<String, List<V>> parseToMap(String jsonStr,
        Class<V> classes)
    {
        return JSONObject.parseObject(jsonStr)
            .entrySet()
            .stream()
            .collect(Collectors.toMap(Map.Entry::getKey,
                entry -> JSONObject.parseArray(String.valueOf(entry.getValue()),
                    classes)));
    }
}
