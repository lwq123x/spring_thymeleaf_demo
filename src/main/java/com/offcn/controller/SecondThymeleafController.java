package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class SecondThymeleafController {

    @RequestMapping("/findUser")
    public String findUser(Model model){
        String message = "hello Thymeleaf";
        User user = new User();
        user.setId(1L);
        user.setName("张三");
        user.setAge(18);

        Map<String,String> map = new HashMap<>();
        map.put("id","2");
        map.put("name","李四");
        map.put("sex","男");

        model.addAttribute("user",user);
        model.addAttribute("map",map);
        return "index02";
    }
}
