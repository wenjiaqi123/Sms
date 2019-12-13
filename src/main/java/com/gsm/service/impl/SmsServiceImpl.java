package com.gsm.service.impl;

import com.gsm.dao.SmsDao;
import com.gsm.frame.utils.RandomNumUtils;
import com.gsm.frame.utils.SmsCodeUtils;
import com.gsm.pojo.database.SmsCode;
import com.gsm.pojo.vo.baseVo.BoolVo;
import com.gsm.service.SmsService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class SmsServiceImpl implements SmsService {
    @Autowired
    private SmsDao smsDao;

    @Override
    public BoolVo insertUserIphoneNoAndSmsCode(String iphoneNo) {
        //生成验证码
        Integer random4 = RandomNumUtils.getRandom4();
        //封装 SmsCode
        SmsCode smsCode = SmsCode.builder()
                .iphoneNo(iphoneNo)
                .smsCode(random4)
                .build();
        //发送短信
        boolean bool = SmsCodeUtils.sendSmsCodeOneIphoneNo(smsCode);
        BoolVo boolVo = null;
        if (!bool) {
            boolVo = new BoolVo(false,"发送失败");
            return boolVo;
        }
        //将用户手机号和随机数存入数据库，用于之后接口验证
        smsDao.insertUserIphoneNoAndSmsCode(smsCode);
        boolVo = BoolVo.builder()
                .flag(true)
                .msg("发送成功")
                .build();
        return boolVo;
    }

    @Override
    public BoolVo selectSmsCodeByIphoneNo(SmsCode smsCode) {
        //根据手机号和验证码 查询时间差
        Long timeDiff = smsDao.selectSmsCodeByIphoneNo(smsCode);
        BoolVo boolVo = new BoolVo();
        //5分钟有效时间
        if (timeDiff == null || timeDiff == 0 || timeDiff >= 5 * 60 * 1000) {
            boolVo.setFlag(false);
            boolVo.setMsg("校验失败");
        }else {
            boolVo.setFlag(true);
            boolVo.setMsg("校验成功");
        }
        return boolVo;
    }
}
