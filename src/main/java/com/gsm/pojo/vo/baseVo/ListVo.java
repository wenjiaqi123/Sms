package com.gsm.pojo.vo.baseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.Builder;
import lombok.Data;

import java.util.List;

@Data
@Builder
@ApiModel("List型返回")
public class ListVo {
    @ApiModelProperty("list")
    private List list;
    @ApiModelProperty("对list描述")
    private String msg;
}
