
/**
 * @标题: Excetion.java
 * @包名： com.nlx.appliaction
 * @功能描述：TODO
 * @author： liyonggang
 * @创建时间： 2018年4月20日 下午4:04:11
 * @version v1.0
 */

package com.nlx.appliaction.excetion;

import java.util.Set;

import javax.validation.ConstraintViolation;
import javax.validation.ConstraintViolationException;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.http.HttpStatus;
import org.springframework.util.StringUtils;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.nlx.appliaction.common.utils.resp.AjaxResult;

/**
 * @类描述
 * @创建时间 2018年4月20日下午4:04:11
 * @author liyonggang
 */
@ControllerAdvice
@ResponseBody
@SuppressWarnings("all")
@RestControllerAdvice
public class ExceptionAdvice
{
    private static final Logger log =
        LoggerFactory.getLogger(ExceptionAdvice.class);
    
    @ResponseStatus(HttpStatus.BAD_REQUEST)
    @ExceptionHandler(Exception.class)
    public AjaxResult<String> handleException(Exception e)
    {
        AjaxResult<String> exceptionData = null;
        String message = null;
        String code = "400";
        try
        {
            log.error(e.getMessage(), e);
            if (e instanceof ConstraintViolationException)
            {
                Set<ConstraintViolation<?>> violations =
                    ((ConstraintViolationException)e).getConstraintViolations();
                ConstraintViolation<?> violation = violations.iterator().next();
                message = violation.getMessage();
            }
            else if (e instanceof MethodArgumentNotValidException)
            {
                message =
                    ((MethodArgumentNotValidException)e).getBindingResult()
                        .getFieldError()
                        .getDefaultMessage();
            }
            else if (e instanceof ValidateParaException
                || e instanceof BadRequestException)
            {
                message = e.getMessage();
            }
            else
            {
                message = "服务器内部错误";
            }
        }
        catch (Exception e1)
        {
            log.error("unknown error", e);
            message = "服务器内部错误";
        }
        return new AjaxResult<String>(message, code, null);
    }
}
