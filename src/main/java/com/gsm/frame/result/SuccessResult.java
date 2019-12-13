package com.gsm.frame.result;

import lombok.*;

import java.io.Serializable;

@Setter
@Getter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class SuccessResult<T> implements Result, Serializable {
    private static final long serialVersionUID = -3129969091786246502L;
    private int code = 200;
    private String msg = "success";
    private T data;
}
