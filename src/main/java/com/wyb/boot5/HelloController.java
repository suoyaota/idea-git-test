package com.wyb.boot5;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author wyb
 * @create 2020/7/17
 */

@RestController
public class HelloController {

    @RequestMapping("/")
    public String sayHello() {
        return "项目经理 Hello,World!";
    }
}
