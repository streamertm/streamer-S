package com.streamer.service;

        import com.streamer.bean.Stu;
        import com.streamer.mapper.StuMapper;
        import org.springframework.beans.factory.annotation.Autowired;
        import org.springframework.stereotype.Service;
        import org.springframework.web.bind.annotation.PathVariable;

        import java.util.List;

@Service
public class Stuservice {
    @Autowired
    StuMapper studentmapper;

    public List<Stu> findAllStu() {
        List<Stu> users = studentmapper.findAllStu();
        return users;
    }

    public Stu getStuId (Integer sno){
        return studentmapper.getStuId(sno);
    }
    public Stu deleteStuById(Integer sno){
        return studentmapper.deleteStuById(sno);
    };
    public Stu insertStu(Stu stu){
        studentmapper.insertStu(stu);
        return stu;
    }
    public Stu updateStu(Integer sno,String sname,String password){
        return studentmapper.updateStu(sno, sname, password);

    }
    public Stu login(Stu stu){
        studentmapper.login(stu);
        return stu;
    }


    public String index( Integer sno){
        return studentmapper.index(sno);
    }




}
