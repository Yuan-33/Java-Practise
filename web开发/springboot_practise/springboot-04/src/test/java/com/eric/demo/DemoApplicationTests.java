package com.eric.demo;

import com.eric.demo.controller.JDBCController;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

import javax.sql.DataSource;
import java.sql.Connection;

import static javafx.scene.input.KeyCode.J;

@SpringBootTest
class DemoApplicationTests {

    @Autowired(required = false)
    DataSource dataSource;

    JDBCController jdbcController;

    @Test
    void contextLoads() throws Exception {
//        System.out.println(dataSource.getClass());
//        //获得连接
//        Connection connection =   dataSource.getConnection();
//        System.out.println(connection);
//        //关闭连接
//        connection.close();
//        System.out.println(jdbcController.getStu());
    }

}
