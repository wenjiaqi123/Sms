package com.gsm.pojo.database;

import io.swagger.annotations.ApiModel;
import io.swagger.annotations.ApiModelProperty;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
@ApiModel("文件对象")
public class FileInfo {
    @ApiModelProperty("主键")
    private Integer id;
    @ApiModelProperty("文件Id")
    private String fileId;

    @ApiModelProperty("真实文件名")
    private String fileName;
    @ApiModelProperty("文件URL")
    private String fileUrl;
    @ApiModelProperty("文件大小(Byte)")
    private Long fileSize;

    /**
     * 记录状态 1有效 0无效
     */
    private Integer status;

    /**
     * 创建人 id
     */
    private Integer createUser;
    private Date createTime;
    /**
     * 修改人 id
     */
    private Integer updateUser;
    private Date updateTime;
}
