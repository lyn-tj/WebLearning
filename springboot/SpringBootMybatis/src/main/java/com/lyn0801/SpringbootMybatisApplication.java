package com.lyn0801;

import com.lyn0801.util.MybatisLogger;
import com.lyn0801.util.SpringContextHolder;
import org.apache.ibatis.jdbc.ScriptRunner;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.logging.log4j.Logger;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.web.bind.annotation.Mapping;

import java.io.InputStream;
import java.io.InputStreamReader;
import java.sql.*;

@SpringBootApplication
//@MapperScan("com.lyn0801.mapper")
@ServletComponentScan
public class SpringbootMybatisApplication {
//    private static Logger logger = MybatisLogger.getLogger("SpringBoot-Mybaits");

    public static void main(String[] args) {
        SpringApplication.run(SpringbootMybatisApplication.class, args);
        if(getConnect()){
            System.out.println("连接数据库成功。");
        }else{
            System.out.println("连接数据库失败。");
        }
        System.out.println("The application is running...");
//        try {
//            SqlSessionFactory sqlSessionFactory = (SqlSessionFactory) SpringContextHolder.getBean("sqlSessionFactory");
//            SqlSession sqlSession = sqlSessionFactory.openSession(true);
//            Connection connection = sqlSession.getConnection();
//            ScriptRunner runner = new ScriptRunner(connection);
//            runner.setAutoCommit(true);//自动提交
//            runner.setFullLineDelimiter(false);
//            runner.setDelimiter(";");////每条命令间的分隔符
//            runner.setSendFullScript(false);
//            runner.setStopOnError(false);
//            //如果又多个sql文件，可以写多个runner.runScript(xxx),
//            InputStream inputstream = SpringbootMybatisApplication.class.getClassLoader().getResourceAsStream("sql/test.sql");
//            runner.runScript(new InputStreamReader(inputstream, "utf-8"));
//            logger.debug("创建数据库表成功。");
//        }catch (Exception e){
//            logger.debug("创建数据库表失败。");
//        }

    }

    public static boolean getConnect()
    {
        Statement stmt = null;
        Connection conn = null;
        try
        {
            String constr = "jdbc:postgresql://192.168.1.109:41000/template1";

            Driver driver = (Driver)Class.forName("org.postgresql.Driver").newInstance();

            DriverManager.registerDriver(driver);

            conn = DriverManager.getConnection(constr, "postgres", "");
        }
        catch (SQLException sqle)
        {
            return false;
        }
        catch (ClassNotFoundException e)
        {
            return false;
        }
        catch (Exception e)
        {
            return false;
        }

        try
        {
            stmt = conn.createStatement(1004, 1008);
        }
        catch (SQLException sqle)
        {
            return false;
        }
        return true;
    }
}

