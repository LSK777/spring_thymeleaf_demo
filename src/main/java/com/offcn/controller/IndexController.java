package com.offcn.controller;

import com.offcn.pojo.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.xml.crypto.Data;
import java.util.*;

@Controller  //如果使用thymeleaf模板引擎则该注解一定是@Controller
public class IndexController {

    @RequestMapping("/index")
    public String index(Model model){  //springMVC中,Model 用来后端与前端数据交互
        model.addAttribute("message","年轻人不讲武德");
        return "index";
    }

    @RequestMapping("/findUser")
    public String findUser(Model model){
        User user = new User();
        user.setId(1L);
        user.setName("永强");
        user.setAge(30);

        Map<String,String> map = new HashMap<>();
        map.put("id","2");
        map.put("name","刘能");
        map.put("sex","男");

        model.addAttribute("user",user);
        model.addAttribute("map",map);
        return "index02";
    }

    @RequestMapping("/findAll")
    public String findAll(Model model){
        User user1 = new User();
        user1.setId(1L);
        user1.setName("永强儿");
        user1.setAge(30);

        User user2 = new User();
        user2.setId(2L);
        user2.setName("谢广坤");
        user2.setAge(31);

        User user3 = new User();
        user3.setId(3L);
        user3.setName("刘英");
        user3.setAge(28);

        List list = new ArrayList();
        list.add(user1);
        list.add(user2);
        list.add(user3);

        model.addAttribute("userList",list);

        return "index03";
    }

    @RequestMapping("/index04")
    public String index04(Model model){
        model.addAttribute("username","年轻人");
        return "index04";
    }

    @RequestMapping("/index05")
    public String index05(Model model){
        model.addAttribute("flag","yes");
        model.addAttribute("menu", "admin");
        model.addAttribute("manager", "manager");
        return "index05";
    }

    @RequestMapping("/index06")
    public String index06(Model model){
        model.addAttribute("date", new Date());
        model.addAttribute("num", 123.456D);
        model.addAttribute("str", "Thymeleaf是Web和独立环境的现代服务器端Java模板引擎，能够处理HTML，XML，JavaScript，CSS甚至纯文本。\r\n" +
                "Thymeleaf的主要目标是提供一种优雅和高度可维护的创建模板的方式。为了实现这一点，它建立在自然模板的概念上，将其逻辑注入到模板文件中，不会影响模板被用作设计原型。这改善了设计的沟通，弥补了设计和开发团队之间的差距。\r\n" +
                "Thymeleaf也从一开始就设计了Web标准 - 特别是HTML5 - 允许您创建完全验证的模板，如果这是您需要的\r\n");
        return "index06";
    }

}














