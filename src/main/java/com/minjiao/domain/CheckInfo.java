package com.minjiao.domain;

import java.io.Serializable;

/**
 * @author Administrator
 * @date 2021/12/23 20:27
 * @description:
 */
public class CheckInfo implements Serializable {
    private String username;
    private String bookNo;
    private String code;

    public CheckInfo(String username, String bookNo, String code) {
        this.username = username;
        this.bookNo = bookNo;
        this.code = code;
    }

    public CheckInfo() {
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

    @Override
    public String toString() {
        return "CheckInfo{" +
                "username='" + username + '\'' +
                ", bookNo='" + bookNo + '\'' +
                ", code='" + code + '\'' +
                '}';
    }
}
