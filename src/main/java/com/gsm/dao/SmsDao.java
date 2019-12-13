package com.gsm.dao;

import com.gsm.pojo.database.SmsCode;

public interface SmsDao {
    void insertUserIphoneNoAndSmsCode(SmsCode smsCode);

    Long selectSmsCodeByIphoneNo(SmsCode smsCode);
}
