package com.gsm.pojo.vo.baseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

@Data
@Builder
@ApiModel("Integer类型返回")
public class IntegerVo {
    @ApiModelProperty("int")
    private Integer i;
    @ApiModelProperty("对int描述")
    private String msg;
}
