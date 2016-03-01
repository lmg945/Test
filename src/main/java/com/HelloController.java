package com;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * Created by LEE on 2016/2/27.
 */
@Controller
public class HelloController {
    @RequestMapping("/test/index.do")
    private String Index(){
        return "hello";
    }
}
