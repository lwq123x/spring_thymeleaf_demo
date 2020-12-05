package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class FirstThymeleafController {

    /**
     * 访问http://localhost:9001/first
     * 将数据message填充到templates/index.html
     * @param model
     * @return
     */

    @GetMapping("/first")
    public String indexPage(Model model){
        String message = "hello Thymeleaf";
        model.addAttribute("message",message);
        return "index";
    }
}
