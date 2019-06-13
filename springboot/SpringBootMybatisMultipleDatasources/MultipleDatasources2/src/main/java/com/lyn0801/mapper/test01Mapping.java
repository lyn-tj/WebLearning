package com.lyn0801.mapper.test01;

import com.lyn0801.bean.User;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface test01Mapping {
    void addUser(User user);
}
