package com.gsm.pojo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;

@ApiModel("分页对象")
public class BaseQuery {
    @ApiModelProperty("页码")
    private Integer page;
    @ApiModelProperty("每页记录数")
    private Integer rows;
}
