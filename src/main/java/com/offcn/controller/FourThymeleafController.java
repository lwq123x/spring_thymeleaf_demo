package com.offcn.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class FourThymeleafController {

    /**
     * 访问localhost:9001 页面
     * 将数据message填充到templates/index4.html
     * @param model
     * @return
     */
    @RequestMapping("/index04")
    public String index04(Model model){
        model.addAttribute("username","张三");
        return "index04";

    }
}
