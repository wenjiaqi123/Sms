package com.gsm.frame.globalException;

import com.gsm.frame.result.ErrorResult;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * 全局异常处理器
 */
@ControllerAdvice
public class GlobalExceptionHandler{

    @ResponseBody
    @ExceptionHandler(value = Exception.class)
    public ErrorResult handler(HttpServletRequest request, HttpServletResponse response, Exception e) {
        response.setStatus(500);
        //返回结果集
        ErrorResult result = new ErrorResult();
        //异常url
        result.setUri(request.getServletPath());
        //异常
        result.setMsg(e.getClass().toString() + ": " + e.getLocalizedMessage());
        //自定义异常信息
        if (e instanceof MyException){
            result.setMsg(((MyException) e).getMsg());
        }
        return result;
    }

}
