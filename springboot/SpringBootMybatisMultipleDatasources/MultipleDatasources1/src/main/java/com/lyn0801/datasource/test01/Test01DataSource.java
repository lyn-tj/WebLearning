package com.lyn0801.datasource.test01;

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
@MapperScan(basePackages = "com.lyn0801.mapper.test01", sqlSessionFactoryRef = "test1SqlSessionFactory")
public class Test01DataSource {
    @Bean
    @Primary
    @ConfigurationProperties("spring.datasource.hikari.test01")
    public DataSourceProperties dataSourceProperties() {
        return new DataSourceProperties();
    }

    @Bean(name = "test1DataSource")
    @Primary
    @ConfigurationProperties("spring.datasource.hikari.test01")
    public DataSource getDataSource() {
        return dataSourceProperties().initializeDataSourceBuilder().build();
    }

    @Bean(name = "test1SqlSessionFactory")
    @Primary
    public SqlSessionFactory test01SqlSessionFactory(@Qualifier("test1DataSource") DataSource datasource)
            throws Exception {
        SqlSessionFactoryBean bean = new SqlSessionFactoryBean();
        bean.setDataSource(datasource);
        bean.setMapperLocations(
                new PathMatchingResourcePatternResolver().getResources("classpath*:mapping/test01/*.xml"));
        return bean.getObject();
    }

    @Bean("test1SqlSessionTemplate")
    @Primary
    public SqlSessionTemplate test01SqlSessionTemplate(
            @Qualifier("test1SqlSessionFactory") SqlSessionFactory sessionfactory) {
        return new SqlSessionTemplate(sessionfactory);
    }
}
