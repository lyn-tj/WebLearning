package com.lyn0801.mapper.test02;

import com.lyn0801.bean.User;
import org.springframework.stereotype.Repository;

@Repository
public interface test02Mapping {
    void addUser(User user);
}
