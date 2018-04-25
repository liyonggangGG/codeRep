package com.nlx.appliaction.controller;

import java.util.Map;

import javax.validation.ValidationException;

import org.hibernate.validator.constraints.NotBlank;
import org.hibernate.validator.constraints.NotEmpty;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestHeader;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.aliyuncs.dysmsapi.model.v20170525.SendSmsResponse;
import com.aliyuncs.exceptions.ClientException;
import com.nlx.appliaction.common.utils.resp.AjaxResult;
import com.nlx.appliaction.httpapis.alibaba.apis.ALiApis;
import com.nlx.appliaction.httpapis.alibaba.domain.RiskInformationResponse;

import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;

/**
 * @类描述 Api测试controller
 * @创建时间 2018年4月20日下午4:01:17
 * @author liyonggang
 */
@Api(tags = "阿里巴巴api接口测试")
@RestController
@Validated
@RequestMapping("/alibaba")
public class HttpApiTestController
{
    private Logger log = LoggerFactory.getLogger(HttpApiTestController.class);
    
    @PostMapping("/sendSms")
    @ApiOperation(value = "阿里短信发送", notes = "阿里短信发送")
    public AjaxResult<SendSmsResponse> sendSms(
        @ApiParam(value = "手机号", name = "phoneNumber") @NotBlank(message = "{phoneNumber.isNull}") @RequestHeader(value = "phoneNumber", required = false) String phoneNumber,
        @NotEmpty(message = "{params.isNull}") @ApiParam(value = "短信模版参数") @RequestBody Map<String, String> params)
    {
        try
        {
            return new AjaxResult<>("200",
                ALiApis.sendSms(phoneNumber, params));
        }
        catch (ClientException e)
        {
            log.error("有短信发送失败 {}", e.getMessage());
            throw new ValidationException(e);
        }
    }
    
    @PostMapping("/riskInformationCheck")
    @ApiOperation(value = "阿里云个人风险信息综合和查询", notes = "阿里云个人风险信息综合和查询")
    @ApiImplicitParam(value = "传入校验信息 格式      {\"bankCardNo\":\"xxx\",\"idCard\":\"xxx\",\"mobile\":\"xxx\",\"name\":\"xxx\"} ", required = true)
    public AjaxResult<RiskInformationResponse> riskInformationCheck(
        Map<String, String> map)
    {
        try
        {
            return new AjaxResult<>("200",
                ALiApis.riskInformationCheck(map.get("bankCardNo"),
                    map.get("idCard"),
                    map.get("mobile"),
                    map.get("name")));
        }
        catch (Exception e)
        {
            log.error("阿里云个人风险信息综合和查询出现异常: {}", e);
            return new AjaxResult<>("400", "查询失败");
        }
    }
    
}
