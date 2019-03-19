package com.login03.login03.controller;

import com.login03.login03.bean.Stu;
import com.login03.login03.service.stuService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import org.springframework.ui.Model;

import java.util.List;
import java.util.Map;

//
//@RequestMapping
@Controller
public class Stucontroller {

    @Autowired
    stuService stuservice;

    @ResponseBody
    @RequestMapping(value = "/findList")
    public List<Stu> findAllStu() {
        List<Stu> users = stuservice.findAllStu();
        return users;
    }


    @RequestMapping("/findall")
    public String findAllStu(Model model) {
        List<Stu> users = stuservice.findAllStu();
        model.addAttribute("hello",users);
        return "/findlst";
    }

    //添加的跳转
    @RequestMapping("/addIndex")
    public String addIndex(){
        return "add";
    }


    //添加
    @RequestMapping("/add")
    public String add(Stu stu){
        stuservice.add(stu);
        return "redirect:/findlst";
    }


    @RequestMapping("/temp")
    public String gettemp(Map<String,String> map){
        map.put("info","hello thymeleaf");
        return "/temp1";
    }

}
