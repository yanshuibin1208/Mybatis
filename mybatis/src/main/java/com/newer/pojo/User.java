package com.newer.pojo;

import java.sql.Date;

public class User {

    private Integer sid;
    private String sname;
    private String ssex;
    private Date sbirthday;
    private String cid;

    public Integer getSid() {
        return sid;
    }

    public void setSid(Integer sid) {
        this.sid = sid;
    }

    public String getSname() {
        return sname;
    }

    public void setSname(String sname) {
        this.sname = sname;
    }

    public String getSsex() {
        return ssex;
    }

    public void setSsex(String ssex) {
        this.ssex = ssex;
    }

    public Date getSbirthday() {
        return sbirthday;
    }

    public void setSbirthday(Date sbirthday) {
        this.sbirthday = sbirthday;
    }

    public String getCid() {
        return cid;
    }

    public void setCid(String cid) {
        this.cid = cid;
    }
}
