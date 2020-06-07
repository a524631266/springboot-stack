package com.springboot.stack.mybatisplay.model;

import java.io.Serializable;
import java.util.Date;

public class City  implements Serializable {
    private static final long serialVersionUID = 1L;
    private Integer id;
    private String name;
    private Date createTime;
    private String state;
    private String country;
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }


    public String getRegionname() {
        return name;
    }

    public void setRegionname(String name) {
        this.name = name;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    @Override
    public String toString() {
        return "City{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", createTime=" + createTime +
                ", state='" + state + '\'' +
                '}';
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }
}
