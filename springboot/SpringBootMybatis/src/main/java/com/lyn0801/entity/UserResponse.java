package com.lyn0801.entity;

import java.util.List;

public class UserResponse {
    private List<User> users;
    private int HTTP_Code;
    private String HTTP_Message;
    private int Code;
    private String Message_CN;
    private String Message_EN;
    private int ResourceID;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public int getHTTP_Code() {
        return HTTP_Code;
    }

    public void setHTTP_Code(int HTTP_Code) {
        this.HTTP_Code = HTTP_Code;
    }

    public String getHTTP_Message() {
        return HTTP_Message;
    }

    public void setHTTP_Message(String HTTP_Message) {
        this.HTTP_Message = HTTP_Message;
    }

    public int getCode() {
        return Code;
    }

    public void setCode(int code) {
        Code = code;
    }

    public String getMessage_CN() {
        return Message_CN;
    }

    public void setMessage_CN(String message_CN) {
        Message_CN = message_CN;
    }

    public String getMessage_EN() {
        return Message_EN;
    }

    public void setMessage_EN(String message_EN) {
        Message_EN = message_EN;
    }

    public int getResourceID() {
        return ResourceID;
    }

    public void setResourceID(int resourceID) {
        ResourceID = resourceID;
    }
}
