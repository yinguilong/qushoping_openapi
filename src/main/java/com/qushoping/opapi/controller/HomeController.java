package com.qushoping.opapi.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

    /*
     *
     * 首页
     * */
    @RequestMapping("/")
    public String Index() {

        return  "helloWord";
    }
}
