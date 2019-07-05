package com.lyn0801.springboot.config.dao;


import com.lyn0801.springboot.config.bean.Properties;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface PropertiesDao {

    @Select("SELECT key, value, application, profile,lable FROM properties")
    List<Properties> getProperties();
}
