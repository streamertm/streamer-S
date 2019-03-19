package com.login03.login03.service;

import com.login03.login03.bean.Stu;
import com.login03.login03.mapper.stuMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class stuService {
    @Autowired
    stuMapper studentmapper;
    public List<Stu> findAllStu() {
        List<Stu> users = studentmapper.findAllStu();
        return users;
    }

    public int add(Stu stu) {
        return studentmapper.add(stu);
    }

}
