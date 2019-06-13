package com.lyn0801.datasource.test02;

import org.apache.ibatis.session.SqlSessionFactory;
import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.SqlSessionTemplate;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.boot.autoconfigure.jdbc.DataSourceProperties;
import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.jdbc.DataSourceBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;
import org.springframework.core.io.support.PathMatchingResourcePatternResolver;

import javax.sql.DataSource;

@Configuration
@MapperScan(basePackages = "com.lyn0801.mapper.test02", sqlSessionFactoryRef = "test2SqlSessionFactory")
public class Test02DataSource {
    @Bean(name = "test2DataSource")
    @ConfigurationProperties(prefix = "spring.datasource.hikari.test02")
    public DataSource getDataSource() {
        return DataSourceBuilder.create().build();
    }

    @Bean(name = "test2SqlSessionFactory")
    public SqlSessionFactory test02SqlSessionFactory(@Qualifier("test2DataSource") DataSource datasource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:mapping/test02/*.xml"));
        return bean.getObject();
    }

    @Bean("test2SqlSessionTemplate")
    public SqlSessionTemplate test02SqlSessionTemplate(
            @Qualifier("test2SqlSessionFactory") SqlSessionFactory sessionfactory) {
        return new SqlSessionTemplate(sessionfactory);
    }
}
