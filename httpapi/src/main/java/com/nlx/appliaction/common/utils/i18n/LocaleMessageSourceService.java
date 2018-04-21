package com.nlx.appliaction.common.utils.i18n;

import java.util.Locale;

import javax.annotation.Resource;

import org.springframework.context.MessageSource;
import org.springframework.context.i18n.LocaleContextHolder;
import org.springframework.stereotype.Service;

/**
 * 
 * 国际化工具类
 * 
 */

@Service
public class LocaleMessageSourceService
{
    
    @Resource
    private MessageSource messageSource;
    
    /**
     * 
     * @param code：对应messages配置的key.
     * 
     * @return
     * 
     */
    
    public String getMessage(String code)
    {
        
        return this.getMessage(code, new Object[] {});
        
    }
    
    public String getMessage(String code, String defaultMessage)
    {
        
        return this.getMessage(code, null, defaultMessage);
        
    }
    
    public String getMessage(String code, String defaultMessage, Locale locale)
    {
        return this.getMessage(code, null, defaultMessage, locale);
        
    }
    
    public String getMessage(String code, Locale locale)
    {
        return this.getMessage(code, null, "", locale);
        
    }
    
    /**
     *
     * @param code：对应messages配置的key.
     * @param args :数组参数.
     * @return
     */
    public String getMessage(String code, Object[] args)
    {
        return this.getMessage(code, args, "");
        
    }
    
    public String getMessage(String code, Object[] args, Locale locale)
    {
        return this.getMessage(code, args, "", locale);
        
    }
    
    /**
     *
     * 
     * 
     * @param code：对应messages配置的key.
     * 
     * @param args :数组参数.
     * 
     * @param defaultMessage :没有设置key的时候的默认值.
     * 
     * @return
     * 
     */
    
    public String getMessage(String code, Object[] args, String defaultMessage)
    {
        return this.getMessage(code,
            args,
            defaultMessage,
            LocaleContextHolder.getLocale());
        
    }
    
    /**
     * 
     * 指定语言.
     * 
     * @param code
     * 
     * @param args
     * 
     * @param defaultMessage
     * 
     * @param locale
     * 
     * @return
     * 
     */
    
    public String getMessage(String code, Object[] args, String defaultMessage,
        Locale locale)
    {
        return messageSource.getMessage(code, args, defaultMessage, locale);
    }
}