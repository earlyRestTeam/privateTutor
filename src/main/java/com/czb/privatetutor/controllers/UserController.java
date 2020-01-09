package com.czb.privatetutor.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @ClassName UserController
 * @Date 2019/12/26
 * @Version V1.0
 **/
@Controller
public class UserController {

    @RequestMapping("/index")
    public String index(){
        return "index";
    }

    @RequestMapping("/about_us")
    public String about_us(){
        return "about_us";
    }

    @RequestMapping("/announcement")
    public String announcement(){
        return "announcement";
    }

    @RequestMapping("/change_password")
    public String change_password(){
        return "change_password";
    }

    @RequestMapping("/comments")
    public String comments(){
        return "comments";
    }

    @RequestMapping("/contact_us")
    public String contact_us(){
        return "contact_us";
    }

    @RequestMapping("/detaileds")
    public String detaileds(){
        return "detaileds";
    }

    @RequestMapping("/faculty_info")
    public String faculty_info(){
        return "faculty_info";
    }

    @RequestMapping("/forget_password")
    public String forget_password(){
        return "forget_password";
    }

    @RequestMapping("/login")
    public String login(){
        return "login";
    }

    @RequestMapping("/map")
    public String map(){
        return "map";
    }

    @RequestMapping("/mycollection")
    public String mycollection(){
        return "mycollection";
    }

    @RequestMapping("/myrelease")
    public String myrelease(){
        return "myrelease";
    }

    @RequestMapping("/order_history")
    public String order_history(){
        return "order_history";
    }

    @RequestMapping("/others_comments")
    public String others_comments(){
        return "others_comments";
    }

    @RequestMapping("/personal_center")
    public String personal_center(){
        return "personal_center";
    }

    @RequestMapping("/personal_data")
    public String personal_data(){
        return "personal_data";
    }

    @RequestMapping("/publish_information")
    public String publish_information(){
        return "publish_information";
    }

    @RequestMapping("/register")
    public String register(){
        return "register";
    }

    @RequestMapping("/teacher_register")
    public String teacher_register(){
        return "teacher_register";
    }

    @RequestMapping("/unread_announcement")
    public String unread_announcement(){
        return "unread_announcement";
    }

}
