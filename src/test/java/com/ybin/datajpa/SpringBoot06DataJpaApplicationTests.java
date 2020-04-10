package com.ybin.datajpa;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Sort;

import java.util.ArrayList;
import java.util.List;

@SpringBootTest
class SpringBoot06DataJpaApplicationTests {

    @Test
    void contextLoads() {
    }

    @Test
    public void Test01() {
        List<String> list = new ArrayList<String>();
        list.add("id");
//        Sort sort = new Sort(Sort.Direction.DESC,list);
    }

}
