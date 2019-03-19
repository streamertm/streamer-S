package com.login03.login03.bean;

public class Stu {
    private Integer sno;
    private String sname;
    private String password;


    public Integer getSno() {
        return sno;
    }

    public void setSno(Integer sno) {
        this.sno = sno;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }


    @Override
    public String toString() {
        return "Stu{" +
                "sno=" + sno +
                ", sname='" + sname + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}
