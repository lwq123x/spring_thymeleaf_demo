package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;
import java.util.List;

@Controller
public class ThreeThymeleafController {

    @RequestMapping("/findAll")
    public String findAll(Model model){
        User user1 = new User();
        user1.setId(1L);
        user1.setName("张三");
        user1.setAge(18);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("李四");
        user2.setAge(19);

        User user3 = new User();
        user3.setId(3L);
        user3.setName("王五");
        user3.setAge(20);

        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        model.addAttribute("userList",list);
        return "index03";
    }
}
