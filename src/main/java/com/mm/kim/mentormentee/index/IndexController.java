package com.mm.kim.mentormentee.index;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class IndexController {
    @GetMapping("/index")
    public String indexx() {
        return "index";
    }

    @GetMapping("/")
    public String index() {
        return "/index";
    }
}
