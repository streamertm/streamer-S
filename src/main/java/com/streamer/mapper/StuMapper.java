package com.streamer.mapper;

import com.streamer.bean.Stu;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@Mapper
public interface StuMapper {
    public String index(Integer sno);
    public Stu login(Stu stu);
    boolean addUser();
      List<Stu> findAllStu();
      public Stu getStuId(Integer sno);
      public Stu deleteStuById(Integer sno);
      public Stu insertStu(Stu stu);
      public Stu updateStu(Integer sno,String sname,String password);
}
