package com.zcp.springcloud.pojo;

import java.util.Date;

/**
 * @author zcp
 * @create 2019/3/27
 * @since 1.0.0
 */
public class User {
    private Long id;
    private Date date;

    public User(){

    }

    public User(Long id) {
        this.id = id;
        this.date=new Date();
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

}

