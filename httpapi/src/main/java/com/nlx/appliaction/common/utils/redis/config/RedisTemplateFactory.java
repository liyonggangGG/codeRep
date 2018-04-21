package com.nlx.appliaction.common.utils.redis.config;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.springframework.data.redis.core.GeoOperations;
import org.springframework.data.redis.core.HashOperations;
import org.springframework.data.redis.core.ListOperations;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.data.redis.core.ZSetOperations;
import org.springframework.stereotype.Component;
/**
* 项目名称：tea-common-redis   
* 类名称：RedisTemplateFactory   
* 类描述：   
* 创建人：qi_baijian   
* 创建时间：2018年3月14日 上午10:00:17   
* 修改人：qi_baijian   
* 修改时间：2018年3月14日 上午10:00:17   
* 修改备注：   
* @version    
*
 */
@Component
@SuppressWarnings("unchecked")
public class RedisTemplateFactory {
	
	@SuppressWarnings("rawtypes")
	@Resource
	private RedisTemplate redisTemplate;	
	
	@Resource
	private StringRedisTemplate stringRedisTemplate;	
	
	@SuppressWarnings("rawtypes")
	public RedisTemplate getRedisTemplate() {
		return this.redisTemplate;
	}
	
	public StringRedisTemplate getStringRedisTemplate() {
		return this.stringRedisTemplate;
	}
	
	/**
	 * 
	* @Title: setExpire 
	* @Description: 设置缓存实体的TTL，超期实体将被自动移除
	* @param  key
	* @param timeout
	* @param unit 
	* @return boolean    返回类型 
	* @throws
	 */
	public boolean setExpire(Object key,long timeout,TimeUnit unit) {
		return redisTemplate.expire(key, timeout, unit);
	}
	/**
	 * 
	* @Title: setStringExpire 
	* @Description: 设置缓存实体的TTL，超期实体将被自动移除
	* @param  key
	* @param timeout
	* @param unit 
	* @return boolean    返回类型 
	* @throws
	 */
	public boolean setStringExpire(String key,long timeout,TimeUnit unit) {
		return stringRedisTemplate.expire(key, timeout, unit);
	}
	/**
	 * 
	* @Title: getValueOperations 
	* @Description: templateValueOperations
	* @return   valueOperation 
	* @return ValueOperations<K,V>    返回类型 
	* @throws
	 */
	public <K,V>ValueOperations<K,V> getValueOperations(){
		return  redisTemplate.opsForValue();
	}
	
	public <HV, HK, K> HashOperations<K, HK, HV> getHashOperations(){
		return  redisTemplate.opsForHash();
	}
	
	public <K, V> ListOperations<K, V> getListOperations(){
		return  redisTemplate.opsForList();
	}
	
	public <K, V> SetOperations<K, V> getSetOperations(){
		return  redisTemplate.opsForSet();
	}
	
	public <K, V> ZSetOperations <K, V> getZSetOperations(){
		return redisTemplate.opsForZSet();
	}
	
	public <K, V> GeoOperations  <K, V> getGeoOperations(){
		return redisTemplate.opsForGeo();
	}
	
	public  ValueOperations<String,String> getStringValueOperations(){
		return  stringRedisTemplate.opsForValue();
	}
	
	public HashOperations<String, Object, Object> getStringHashOperations(){
		return stringRedisTemplate.opsForHash();
	}
	
	public GeoOperations<String, String> getStringGeoOperations(){
		return stringRedisTemplate.opsForGeo();
	}
	
	public ListOperations<String, String> getStringForListOperations(){
		return stringRedisTemplate.opsForList();
	}
	
	public SetOperations<String, String> getStringForSetOperations(){
		return stringRedisTemplate.opsForSet();
	}
	
	public ZSetOperations<String, String> getStringForZSetOperations(){
		return stringRedisTemplate.opsForZSet();
	}

}