package com.gsm.controller;

import com.gsm.pojo.database.FileInfo;
import com.gsm.service.FileService;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.multipart.MultipartFile;

import java.io.IOException;

@Api("文件服务")
@RestController
@RequestMapping("file")
public class FileController {
    @Autowired
    private FileService fileService;

    @ApiOperation("新增一个文件,返回url")
    @ApiImplicitParams({
            @ApiImplicitParam(paramType = "body", name = "file", value = "文件", required = true)
    })
    @PostMapping("insertFile")
    public String insertFile(MultipartFile file) throws IOException {
        String fileUrl = fileService.insertFile(file);
        return fileUrl;
    }

    /**
     * 新增一个文件
     *
     * @param file
     * @return 返回全部信息
     */
    @PostMapping("insertFileGetAllInfo")
    public FileInfo insertFileGetAllInfo(MultipartFile file) throws IOException {
        FileInfo fileInfo = fileService.insertFileGetAllInfo(file);
        return fileInfo;
    }

    @ApiOperation("新增多个文件,返回 String[] urls")
    @PostMapping("insertFiles")
    public String[] insertFiles(MultipartFile[] files) throws IOException {
        String[] fileUrls = fileService.insertFiles(files);
        return fileUrls;
    }

    /**
     * 新增多个文件
     *
     * @param files
     * @return 返回全部信息
     */
    @PostMapping("insertFilesGetAllInfos")
    public FileInfo[] insertFilesGetAllInfos(MultipartFile[] files) throws IOException {
        FileInfo[] fileInfos = fileService.insertFilesGetAllInfos(files);
        return fileInfos;
    }
}
