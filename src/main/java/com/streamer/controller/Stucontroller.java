package com.streamer.controller;

import com.alibaba.fastjson.JSON;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.streamer.bean.Stu;
import com.streamer.mapper.StuMapper;
import com.streamer.service.Stuservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class Stucontroller {
//      @Autowired
//      StuMapper studentmapper;
//      @RequestMapping("/findAllUser")
//      public List<Stu> findAllStu(){
//          List<Stu> users=studentmapper.findAllStu();
//          return users;

    @Autowired
    Stuservice stuservice;

    @ResponseBody
    @RequestMapping("/findAllStu")
    public   List<Stu> findAllStu() {
        List<Stu> users = stuservice.findAllStu();
        return users;
    }


    @ResponseBody
    @RequestMapping("/Stu/{sno}")
    public Stu getStuId(@PathVariable("sno") Integer sno) {
        return stuservice.getStuId(sno);
    }

    @ResponseBody
    @RequestMapping("/det/{sno}")
    public Stu deleteStuById(@PathVariable("sno") Integer sno) {
        return stuservice.deleteStuById(sno);
    }

    @ResponseBody
    @RequestMapping("/insert")
    public Stu insertStu(Stu stu) {
//  http://localhost:8080/insert/?sno=9&sname=pppp&password=12333
        stuservice.insertStu(stu);
        return stu;
    }

    @ResponseBody
    @RequestMapping("/update/{sno}")
    public Stu updateStu(@PathVariable("sno") Integer sno, @PathVariable("sname") String sname, @PathVariable("password") String password) {
        Stu person = new Stu();
        person.setSno(sno);
        person.setSname(sname);
        person.setPassword(password);
        return stuservice.updateStu(sno, sname, password);
    }



    public String login(Stu stu) {
//           List<Stu> users=stuservice.findAllStu();
//           return users.toString();
        Stu u = stuservice.login(stu);
        if (u != null) {
            return "success";
        } else {
            return "error";
        }
    }
}











