package com.qushoping.opapi.controller;

import com.qushoping.opapi.pojo.user;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@Api("用户相关")
@RestController
public class HomeController {

    /*
     *
     * 首页
     * */
    @ApiOperation("默认首页")
    @RequestMapping(value = "/", method = RequestMethod.GET)
    public String Index() {

        return "helloWord";
    }

    @ApiOperation("添加用户")
    @RequestMapping(value = "/add", method = RequestMethod.POST)
    public user Add(@RequestBody user u) {
        return u;
    }
}
