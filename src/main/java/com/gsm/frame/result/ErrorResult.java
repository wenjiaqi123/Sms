package com.gsm.frame.result;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
public class ErrorResult implements Result, Serializable {
    private static final long serialVersionUID = 2945678738637585395L;
    //异常
    private int code = 500;
    //异常URI
    private String uri;
    //异常描述
    private String msg;
}
