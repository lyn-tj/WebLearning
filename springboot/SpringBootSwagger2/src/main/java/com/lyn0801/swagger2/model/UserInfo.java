/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.lyn0801.swagger2.model;

/**
 *
 * @author lyn0801
 */
public class UserInfo {
    private int id;
    private String name;
    private int age;

    @Override
    public boolean equals(Object obj) {
        if (null == obj) return false;
        if(obj instanceof UserInfo){
            UserInfo userInfo = (UserInfo) obj;
            if(userInfo.getId() == this.id){
                return true;
            }
        }
        return false;
    }

    @Override
    public int hashCode() {
        int hash = 7;
        hash = 97 * hash + this.id;
        return hash;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    
}
