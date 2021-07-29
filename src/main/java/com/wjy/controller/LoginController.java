package com.wjy.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.thymeleaf.util.StringUtils;

@Controller
public class LoginController {
    @GetMapping("/user/login")
    public String login(@RequestParam("username") String username, @RequestParam("password") String password, Model model){
        //具体业务：判断用户名和密码
        if (!StringUtils.isEmpty(username) && "123456".equals(password)) {
            return "redirect:/main.html";
        }else {
            model.addAttribute("msg","用户名或者密码错误！");
            return "login";
        }
    }
}
