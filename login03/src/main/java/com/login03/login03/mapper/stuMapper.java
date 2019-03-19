package com.login03.login03.mapper;

import com.login03.login03.bean.Stu;
import org.apache.ibatis.annotations.Mapper;

import java.util.List;
@Mapper
public interface stuMapper {
    List<Stu> findAllStu();
    int add(Stu stu);
}
