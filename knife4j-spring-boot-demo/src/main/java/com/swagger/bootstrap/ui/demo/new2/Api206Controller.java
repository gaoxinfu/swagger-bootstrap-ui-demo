/*
 * Copyright (C) 2018 Zhejiang xiaominfo Technology CO.,LTD.
 * All rights reserved.
 * Official Web Site: http://www.xiaominfo.com.
 * Developer Web Site: http://open.xiaominfo.com.
 */

package com.swagger.bootstrap.ui.demo.new2;

import com.github.xiaoymin.knife4j.annotations.ApiSupport;
import com.swagger.bootstrap.ui.demo.common.Rest;
import com.swagger.bootstrap.ui.demo.domain.resp196.LongUser;
import com.swagger.bootstrap.ui.demo.domain.resp206.ReqModelBigDecimal;
import com.swagger.bootstrap.ui.demo.domain.resp206.ReqModelJson;
import com.swagger.bootstrap.ui.demo.domain.resp206.RequestDTO;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.*;

import javax.servlet.http.HttpServletRequest;
import java.util.List;

/**
 * @author <a href="mailto:xiaoymin@foxmail.com">xiaoymin@foxmail.com</a>
 * 2020/09/19 14:47
 * @since:knife4j-springfox-boot-v3-demo 1.0
 */
@Api(tags = "2.0.6版本-20200919")
@ApiSupport(author = "xiaoymin@foxmail.com",order = 282)
@RestController
@RequestMapping("/api/nxew206")
public class Api206Controller {
    Logger logger= LoggerFactory.getLogger(Api206Controller.class);

    @ApiOperation(value = "body+parameter类型")
    @PostMapping("/reqbody")
    public Rest<LongUser> reqJson(@RequestBody LongUser longUser, @RequestParam(value = "code",required = false) String code, HttpServletRequest request){
        logger.info("code:{}",code);
        return Rest.data(longUser);
    }
    @ApiOperation(value = "body+parameter类型-arry")
    @PostMapping("/reqbodyarry")
    public Rest< List<LongUser>> reqJsoarryn(@RequestBody List<LongUser> longUsers, @RequestParam(value = "code",required = false) String code){
        logger.info("code:{}",code);
        return Rest.data(longUsers);
    }

    @ApiOperation(value = "多层DTO请求参数属性丢失",notes = "[https://gitee.com/xiaoym/knife4j/issues/I1WQ0M](https://gitee.com/xiaoym/knife4j/issues/I1WQ0M)")
    @PostMapping("/req")
    public Rest<RequestDTO> req(@RequestBody RequestDTO requestDTO){
        return Rest.data(requestDTO);
    }

    @ApiOperation(value = "请求实体example是json",notes = "[https://github.com/xiaoymin/swagger-bootstrap-ui/issues/233](https://github.com/xiaoymin/swagger-bootstrap-ui/issues/233)")
    @PostMapping("/reqJsont")
    public Rest<ReqModelJson> reqjsonexmp(@RequestBody ReqModelJson reqModelJson){
        return Rest.data(reqModelJson);
    }

    @ApiOperation(value = "请求实体精度丢失",notes = "[https://github.com/xiaoymin/swagger-bootstrap-ui/issues/269](https://github.com/xiaoymin/swagger-bootstrap-ui/issues/269)")
    @PostMapping("/reqJsontb")
    public Rest<ReqModelBigDecimal> reqJsontb(@RequestBody ReqModelBigDecimal reqModelJson){
        return Rest.data(reqModelJson);
    }
}
