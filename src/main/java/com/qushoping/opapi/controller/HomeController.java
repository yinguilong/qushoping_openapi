package com.qushoping.opapi.controller;

import com.qushoping.opapi.pojo.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yinguilong
 */
@Api("首页")
@RestController
public class HomeController {


    /**
     * 首页
     * @return
     */
    @ApiOperation("默认首页")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String index() {

        return "helloWord";
    }


}
