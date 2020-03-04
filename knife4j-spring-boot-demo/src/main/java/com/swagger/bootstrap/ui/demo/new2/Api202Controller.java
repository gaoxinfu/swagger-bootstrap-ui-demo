/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.swagger.bootstrap.ui.demo.new2;

import com.github.xiaoymin.knife4j.annotations.ApiOperationSupport;
import com.swagger.bootstrap.ui.demo.common.Rest;
import com.swagger.bootstrap.ui.demo.common.RestMessage;
import com.swagger.bootstrap.ui.demo.domain.old.UploadModel;
import com.swagger.bootstrap.ui.demo.domain.resp196.IgnoreP1;
import com.swagger.bootstrap.ui.demo.domain.resp196.LongUser;
import com.swagger.bootstrap.ui.demo.domain.resp202.*;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.List;


/***
 *
 * @since:swagger-bootstrap-ui 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a> 
 * 2019/12/16 19:42
 */
@Api(tags = "2.0.2版本-20200226",position = 286)
@RestController
@RequestMapping("/api/nxew202")
public class Api202Controller {



    @ApiOperationSupport(ignoreParameters = "ids")
    @ApiOperation(value = "忽略参数值-Form类型")
    @PostMapping("/ex")
    public Rest<LongUser> findAll(LongUser longUser) {
        Rest<LongUser> r=new Rest<>();
        r.setData(longUser);
        return r;
    }

    @ApiOperationSupport(ignoreParameters = {"ignoreLabels","longUser.ids"})
    @ApiOperation(value = "忽略参数值-Form类型1")
    @PostMapping("/ex1")
    public Rest<IgnoreP1> findAll12(IgnoreP1 ignoreP1) {
        Rest<IgnoreP1> r=new Rest<>();
        r.setData(ignoreP1);
        return r;
    }


    @ApiOperationSupport(ignoreParameters = "longUser.ids")
    @ApiOperation(value = "忽略参数值-JSON类型")
    @PostMapping("/ex2")
    public Rest<LongUser> findAll1(@RequestBody LongUser longUser) {
        Rest<LongUser> r=new Rest<>();
        r.setData(longUser);
        return r;
    }

    @ApiOperationSupport(ignoreParameters = {"ignoreP1.ignoreLabels[0].code","ignoreP1.longUser.ids"})
    @ApiOperation(value = "忽略参数值-JSON类型1")
    @PostMapping("/ex3")
    public Rest<IgnoreP1> findAll3(@RequestBody IgnoreP1 ignoreP1) {
        Rest<IgnoreP1> r=new Rest<>();
        r.setData(ignoreP1);
        return r;
    }

    @ApiOperationSupport(ignoreParameters = "longUsers.ids")
    @ApiOperation(value = "忽略参数值-数组类型")
    @PostMapping("/ex4")
    public Rest<List<LongUser>> findAll4(@RequestBody List<LongUser> longUsers) {
        Rest<List<LongUser>> r=new Rest<>();
        r.setData(longUsers);
        return r;
    }

    @ApiOperation(value = "url-form类型枚举下拉框显示-简单枚举")
    @PostMapping("/Knife4jUser")
    public Rest<Knife4jUser> findAll5(Knife4jUser knife4jUser) {
        Rest<Knife4jUser> r=new Rest<>();
        r.setData(knife4jUser);
        return r;
    }
    @ApiOperation(value = "url-form类型枚举下拉框显示-复杂枚举")
    @PostMapping("/Knife4jUser1")
    public Rest<Knife4jUab> findAll6(Knife4jUab knife4jUab) {
        Rest<Knife4jUab> r=new Rest<>();
        r.setData(knife4jUab);
        return r;
    }

    @ApiOperation(value = "formdata上传附带枚举参数")
    @PostMapping("/uploadModel")
    public RestMessage uploadModel(UploadEnum uploadEnum){
        RestMessage r=new RestMessage();
        String content="name:"+uploadEnum.getName()+",enum:"+uploadEnum.getKnife4jType().toString();
        r.setData(content);
        return r;
    }

    @ApiOperation(value = "raw-form类型枚举下拉框显示-复杂枚举")
    @PostMapping("/Knife4jUser7")
    public Rest<Knife4jUab> findAll7(Knife4jUab knife4jUab,@RequestBody Knife4jUser knife4jUser) {
        Rest<Knife4jUab> r=new Rest<>();
        r.setData(knife4jUab);
        System.out.println("user:"+knife4jUser.getName()+",type:"+knife4jUser.getKnife4jType().toString());
        return r;
    }

    @ApiOperationSupport(ignoreParameters = {"createTimes[0]"})
    @ApiOperation(value = "忽略数组类型的参数")
    @PostMapping("/Knife4jUser11")
    public Rest<Knife4jTime> findAll16(Knife4jTime knife4jTime) {
        Rest<Knife4jTime> r=new Rest<>();
        r.setData(knife4jTime);
        return r;
    }

    @ApiOperation(value = "忽略数组类型的参数-不忽略")
    @PostMapping("/Knife4jUser12")
    public Rest<Knife4jTime> findAll18(Knife4jTime knife4jTime) {
        Rest<Knife4jTime> r=new Rest<>();
        r.setData(knife4jTime);
        return r;
    }

    @ApiOperation(value = "GET请求参数编码处理")
    @GetMapping("/getUser")
    public Rest<GetArray> getUser(GetArray getArray){
        Rest<GetArray> r=new Rest<>();
        r.setData(getArray);
        return r;
    }

    @ApiOperation(value = "GET请求参数编码处理1")
    @GetMapping("/getUser1")
    public Rest<GetArray> getUse1r(GetArray getArray){
        Rest<GetArray> r=new Rest<>();
        r.setData(getArray);
        return r;
    }

    @ApiOperation(value = "忽略参数")
    @ApiOperationSupport(ignoreParameters = {"nodes[0]"})
    @GetMapping("/getUser221")
    public Rest<KDto> getUse1rx(KDto kDto){
        Rest<KDto> r=new Rest<>();
        r.setData(kDto);
        return r;
    }

    @ApiOperation(value = "忽略参数xx1-json")
    @ApiOperationSupport(ignoreParameters = {"kDto.nodes[0]"})
    @GetMapping("/getUser221x")
    public Rest<KDto> getUse1rx1(@RequestBody KDto kDto){
        Rest<KDto> r=new Rest<>();
        r.setData(kDto);
        return r;
    }


}