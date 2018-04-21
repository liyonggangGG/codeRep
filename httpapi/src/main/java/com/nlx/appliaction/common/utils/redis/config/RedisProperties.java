/*
 * 文件名：RedisProperties.java
 * 版权：Copyright by www.newlixon.com
 * 描述：
 * 修改人：ACER
 * 修改时间：2018年3月12日
 * 跟踪单号：
 * 修改单号：
 * 修改内容：
 */

package com.nlx.appliaction.common.utils.redis.config;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.stereotype.Component;

@Component
@ConfigurationProperties(prefix = "redis.cache")
public class RedisProperties
{
    private int    expireSeconds;
    private String clusterNodes;
    private int    commandTimeout;
    /**
     * pool maxTotal 200
     */
    private int maxTotal;
    
    /**
     *  pool maxIdle: 100
     */
    private int maxIdle;
    
    /**
     * pool minIdle
     */
    private int minIdle;
    
    /**
     * pool testOnBorrow
     */
    private boolean testOnBorrow;
    
    /**
     * pool testOnReturn
     */
    private boolean testOnReturn;
    
    /**
     * pool testWhileIdle
     */
    private boolean testWhileIdle;
    
    /**
     * pool maxWaitMillis
     */
    private long maxWaitMillis;
  
    /**
     * pool timeBetweenEvictionRunsMillis 
     */
    private long timeBetweenEvictionRunsMillis;
    
    /**
     * pool numTestsPerEvictionRun
     */
    private int numTestsPerEvictionRun;
    
    /**
     * pool  minEvictableIdleTimeMillis
     */
    private long minEvictableIdleTimeMillis;
    
    public int getExpireSeconds()
    {
        return expireSeconds;
    }
    public void setExpireSeconds(int expireSeconds)
    {
        this.expireSeconds = expireSeconds;
    }
    public String getClusterNodes()
    {
        return clusterNodes;
    }
    public void setClusterNodes(String clusterNodes)
    {
        this.clusterNodes = clusterNodes;
    }
    public int getCommandTimeout()
    {
        return commandTimeout;
    }
    public void setCommandTimeout(int commandTimeout)
    {
        this.commandTimeout = commandTimeout;
    }
	public int getMaxTotal() {
		return maxTotal;
	}
	public void setMaxTotal(int maxTotal) {
		this.maxTotal = maxTotal;
	}
	public int getMaxIdle() {
		return maxIdle;
	}
	public void setMaxIdle(int maxIdle) {
		this.maxIdle = maxIdle;
	}
	public int getMinIdle() {
		return minIdle;
	}
	public void setMinIdle(int minIdle) {
		this.minIdle = minIdle;
	}
	public boolean isTestOnBorrow() {
		return testOnBorrow;
	}
	public void setTestOnBorrow(boolean testOnBorrow) {
		this.testOnBorrow = testOnBorrow;
	}
	public boolean isTestOnReturn() {
		return testOnReturn;
	}
	public void setTestOnReturn(boolean testOnReturn) {
		this.testOnReturn = testOnReturn;
	}
	public boolean isTestWhileIdle() {
		return testWhileIdle;
	}
	public void setTestWhileIdle(boolean testWhileIdle) {
		this.testWhileIdle = testWhileIdle;
	}
	public long getMaxWaitMillis() {
		return maxWaitMillis;
	}
	public void setMaxWaitMillis(long maxWaitMillis) {
		this.maxWaitMillis = maxWaitMillis;
	}
	public long getTimeBetweenEvictionRunsMillis() {
		return timeBetweenEvictionRunsMillis;
	}
	public void setTimeBetweenEvictionRunsMillis(long timeBetweenEvictionRunsMillis) {
		this.timeBetweenEvictionRunsMillis = timeBetweenEvictionRunsMillis;
	}
	public int getNumTestsPerEvictionRun() {
		return numTestsPerEvictionRun;
	}
	public void setNumTestsPerEvictionRun(int numTestsPerEvictionRun) {
		this.numTestsPerEvictionRun = numTestsPerEvictionRun;
	}
	public long getMinEvictableIdleTimeMillis() {
		return minEvictableIdleTimeMillis;
	}
	public void setMinEvictableIdleTimeMillis(long minEvictableIdleTimeMillis) {
		this.minEvictableIdleTimeMillis = minEvictableIdleTimeMillis;
	}
    
}