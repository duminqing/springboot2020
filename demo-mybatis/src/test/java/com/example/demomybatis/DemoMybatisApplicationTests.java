package com.example.demomybatis;

import com.example.demomybatis.mapper.Product;
import com.example.demomybatis.mapper.ProductMapper;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import javax.annotation.Resource;

@SpringBootTest
class DemoMybatisApplicationTests {

    @Resource
    private ProductMapper productMapper;

    @Test
    void contextLoads() {
        Product product = productMapper.getProductByProductNum(1);
        System.out.println(product.getProductName());
    }

}
