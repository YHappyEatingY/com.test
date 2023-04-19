package com.example.this_is_a_test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.context.annotation.RequestScope;

/**
 * @author Happy Day !
 * @createTime 2023-04-19 13:17
 */
@RestController
@RequestMapping("/hello")
public class controller {

    @GetMapping
    public String hello(){
        System.out.println("你好 嘻嘻嘻🤭(●'◡'●)!");
        return "hello  你好！！！！！";
    }

}
