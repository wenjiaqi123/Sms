package com.gsm.service;

import com.gsm.pojo.database.SmsCode;
import com.gsm.pojo.vo.baseVo.BoolVo;

public interface SmsService {
    BoolVo insertUserIphoneNoAndSmsCode(String iphoneNo);

    BoolVo selectSmsCodeByIphoneNo(SmsCode smsCode);
}
