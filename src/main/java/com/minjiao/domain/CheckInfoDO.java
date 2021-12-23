package com.minjiao.domain;

import com.baomidou.mybatisplus.annotation.IdType;
import com.baomidou.mybatisplus.annotation.TableId;
import com.baomidou.mybatisplus.annotation.TableName;

import java.io.Serializable;

/**
 * @author Administrator
 * @date 2021/12/23 20:27
 * @description:
 */
@TableName("check")

public class CheckInfoDO implements Serializable {
    @TableId(type = IdType.AUTO)
    private Integer id;
    private String username;
    private String bookNo;
    private String code;

    public CheckInfoDO(Integer id, String username, String bookNo, String code) {
        this.id = id;
        this.username = username;
        this.bookNo = bookNo;
        this.code = code;
    }

    public CheckInfoDO() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getBookNo() {
        return bookNo;
    }

    public void setBookNo(String bookNo) {
        this.bookNo = bookNo;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @Override
    public String toString() {
        return "CheckInfoDO{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", bookNo='" + bookNo + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
