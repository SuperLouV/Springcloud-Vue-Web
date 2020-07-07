package com.course.system.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Yilinlou
 * @date 7/6/20 9:14 下午
 * @Email:ylou7@stevens.edu
 */

@RestController
public class TestController {

    @RequestMapping("/test")
    public String test(){
        return "success";
    }
}
