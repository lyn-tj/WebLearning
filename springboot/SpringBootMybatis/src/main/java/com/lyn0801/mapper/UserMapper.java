package com.lyn0801.mapper;

import com.lyn0801.entity.User;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import java.util.List;

@Component
public interface UserMapper {
    List<User> getAllUsers();
}
