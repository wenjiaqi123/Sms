package com.gsm.pojo.vo.baseVo;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
@ApiModel("布尔类型返回")
public class BoolVo {
    @ApiModelProperty("flag")
    private Boolean flag;
    @ApiModelProperty("对flag描述")
    private String msg;
}
