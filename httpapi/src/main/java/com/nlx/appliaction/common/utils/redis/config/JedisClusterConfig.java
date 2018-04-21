/*
 * 文件名：JedisClusterConfig.java
 * 版权：Copyright by www.newlixon.com
 * 描述：
 * 修改人：ACER
 * 修改时间：2018年3月12日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.nlx.appliaction.common.utils.redis.config;

import java.util.Set;

import org.apache.commons.pool2.impl.GenericObjectPoolConfig;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import com.google.common.collect.Sets;

import redis.clients.jedis.HostAndPort;
import redis.clients.jedis.JedisCluster;

@Configuration
public class JedisClusterConfig
{
    
    @Autowired
    private RedisProperties redisProperties;
    
    /**
     * 注意： 这里返回的JedisCluster是单例的，并且可以直接注入到其他类中去使用
     * 
     * @return
     */
    @Bean
    public JedisCluster getJedisCluster()
    {
        String[] serverArray = redisProperties.getClusterNodes().split(",");// 获取服务器数组(这里要相信自己的输入，所以没有考虑空指针问题)
        Set<HostAndPort> nodes = Sets.newHashSet();
        for (String ipPort : serverArray)
        {
            String[] ipPortPair = ipPort.split(":");
            nodes.add(new HostAndPort(ipPortPair[0].trim(),
                Integer.valueOf(ipPortPair[1].trim())));
        }
        GenericObjectPoolConfig poolConfig = new GenericObjectPoolConfig();
        poolConfig.setMaxIdle(redisProperties.getMaxIdle());
        poolConfig.setMaxTotal(redisProperties.getMaxTotal());
        poolConfig.setMinIdle(redisProperties.getMinIdle());
        poolConfig.setTestOnBorrow(redisProperties.isTestOnBorrow());
        poolConfig.setTestOnReturn(redisProperties.isTestOnReturn());
        poolConfig.setTestWhileIdle(redisProperties.isTestWhileIdle());
        poolConfig.setMaxWaitMillis(redisProperties.getMaxWaitMillis());
        poolConfig.setMinEvictableIdleTimeMillis(
            redisProperties.getMinEvictableIdleTimeMillis());
        poolConfig.setNumTestsPerEvictionRun(
            redisProperties.getNumTestsPerEvictionRun());
        poolConfig.setTimeBetweenEvictionRunsMillis(
            redisProperties.getTimeBetweenEvictionRunsMillis());
        return new JedisCluster(nodes, redisProperties.getCommandTimeout(),
            poolConfig);
    }
    
}
