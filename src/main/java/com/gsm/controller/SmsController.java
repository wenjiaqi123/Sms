package com.gsm.controller;

import com.gsm.frame.globalException.MyException;
import com.gsm.pojo.database.SmsCode;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.service.SmsService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@Api("短信模块")
@RestController
@RequestMapping("/sms")
public class SmsController {
    @Autowired
    private SmsService smsService;

    @ApiOperation("发送短信验证码")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "path",name = "iphoneNo",value = "手机号",required = true,dataTypeClass = String.class),
    })
    @GetMapping("/sendSmsCode/{iphoneNo}")
    public BoolVo sendSmsCodeByIphoneNo(@PathVariable("iphoneNo") String iphoneNo) throws MyException {
        //发送短信
        BoolVo boolVo = smsService.insertUserIphoneNoAndSmsCode(iphoneNo);
        return boolVo;
    }

    @ApiOperation("根据手机号和验证码校验")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", name = "iphoneNo", value = "手机号", required = true, dataTypeClass = String.class),
            @ApiImplicitParam(paramType = "body", name = "smsCode", value = "验证码", required = true, dataTypeClass = String.class),
    })
    @PostMapping("/selectSmsCodeByIphoneNo")
    public BoolVo selectSmsCodeByIphoneNo(SmsCode smsCode) {
        BoolVo boolVo = smsService.selectSmsCodeByIphoneNo(smsCode);
        return boolVo;
    }
}
