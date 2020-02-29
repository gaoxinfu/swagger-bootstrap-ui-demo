/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.swagger.bootstrap.ui.demo.x200;

import com.swagger.bootstrap.ui.demo.common.Rest;
import com.swagger.bootstrap.ui.demo.domain.resp196.LongUser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiOperationSupport;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


/***
 *
 * @since:swagger-bootstrap-ui 1.0
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a> 
 * 2019/12/16 19:42
 */
@Api(tags = "2021/测试",position = 286)
@RestController
@RequestMapping("/api/nxew2021")
public class Api2021Controller {



    @ApiOperationSupport(ignoreParameters = "ids")
    @ApiOperation(value = "参数Example值")
    @PostMapping("/ex")
    public Rest<LongUser> findAll(LongUser longUser) {
        Rest<LongUser> r=new Rest<>();
        r.setData(longUser);
        return r;
    }


}
