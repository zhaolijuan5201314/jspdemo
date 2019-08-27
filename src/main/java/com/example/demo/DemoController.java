package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

/**
 * Created by zslin on 2019/8/27.
 */
@Controller
public class DemoController {

    @RequestMapping("/")
    public String index(Model model) {
        model.addAttribute("message", "Hello World");
        return "index";
    }

    @RequestMapping("/login.json")
    @ResponseBody
    public String login(String userName, String password) {
        return "用户名" + userName + "密码" + password;
    }
}
