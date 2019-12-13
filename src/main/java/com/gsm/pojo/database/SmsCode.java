package com.gsm.pojo.database;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
@ApiModel("手机短信验证对象模型")
public class SmsCode {
    @ApiModelProperty("手机号")
    private String iphoneNo;
    @ApiModelProperty("手机短信验证码")
    private Integer smsCode;
    @ApiModelProperty("阿里云短信模板json")
    private String json;
    @ApiModelProperty("创建时间")
    private Date createTime;
}