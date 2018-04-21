package com.nlx.appliaction.common.utils.resp;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("全局交互封装对象")
public class AjaxResult<T>
{
    
    @ApiModelProperty("请求成功否    true：成功，false：失败")
    private Boolean success = true;
    
    @ApiModelProperty("返回信息  用于请求失败是对应的message")
    private String message;
    
    @ApiModelProperty("返回编码")
    private String code;
    
    @ApiModelProperty("数据存放位置")
    private T data;
    
    public Boolean getSuccess()
    {
        return success;
    }
    
    public void setSuccess(Boolean success)
    {
        this.success = success;
    }
    
    public String getMessage()
    {
        return message;
    }
    
    public void setMessage(String message)
    {
        this.message = message;
    }
    
    public String getCode()
    {
        return code;
    }
    
    public void setCode(String code)
    {
        this.code = code;
    }
    
    public T getData()
    {
        return data;
    }
    
    public void setData(T data)
    {
        this.data = data;
    }
    
    public AjaxResult()
    {
        super();
    }
    
    public AjaxResult(Boolean success, String message, String code, T data)
    {
        super();
        this.success = success;
        this.message = message;
        this.code = code;
        this.data = data;
    }
    
    public AjaxResult(String message, String code, T data)
    {
        super();
        this.message = message;
        this.code = code;
        this.data = data;
    }
    
    public AjaxResult(String code,String message)
    {
        super();
        this.message = message;
        this.code = code;
    }
    public AjaxResult(String code,T data)
    {
        super();
        this.data = data;
        this.code = code;
    }
    
    public AjaxResult<T> failure(String message)
    {
        AjaxResult<T> ajaxResult = new AjaxResult<T>();
        ajaxResult.setMessage(message);
        return ajaxResult;
    }
    
    @Override
    public String toString()
    {
        return "AjaxResult [success=" + success + ", message=" + message
            + ", code=" + code + ", data=" + data + "]";
    }
    
}
