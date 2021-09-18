package com.odas;

import com.odas.pojo.Cat;
import com.odas.pojo.Person;
import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class Springbooot02ConfigApplicationTests {

    // 这里之所以能装配是因为我们@Component过了
    @Autowired
    private Cat cat;
    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }

}
