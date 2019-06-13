package com.lyn0801.datasource;

import lombok.extern.slf4j.Slf4j;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.stereotype.Component;

@Aspect
@Component
@Slf4j
public class DataSourceAop {
	@Before("execution(* com.lyn0801.service..*.test01*(..))")
	public void setDataSource2test01() {
		log.info("test01业务");
		DataSourceType.setDataBaseType(DataSourceType.DataBaseType.TEST01);
	}
	
	@Before("execution(* com.lyn0801.service..*.test02*(..))")
	public void setDataSource2test02() {
		log.info("test02业务");
		DataSourceType.setDataBaseType(DataSourceType.DataBaseType.TEST02);
	}
}
