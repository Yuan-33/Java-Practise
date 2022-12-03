package com.eric;

import com.eric.dao.UserDao;
import com.eric.service.UserServicelmpl;
import org.junit.Test;

import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class test {
    @Test
    public void test(){
        try {
            //解析beans.xml文件 , 生成管理相应的Bean对象
            ApplicationContext context = new ClassPathXmlApplicationContext("beans.xml");
            //getBean : 参数即为spring配置文件中bean的id .
            UserServicelmpl userServicelmpl = (UserServicelmpl) context.getBean("UserServicelmpl");
            userServicelmpl.getName();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
