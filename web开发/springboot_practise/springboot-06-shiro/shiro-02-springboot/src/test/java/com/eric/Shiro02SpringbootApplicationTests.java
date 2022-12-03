package com.eric;

import com.eric.controller.MyController;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Shiro02SpringbootApplicationTests {

    @Test
    void contextLoads() {
        MyController myController = new MyController();
        myController.hello();
    }

}
