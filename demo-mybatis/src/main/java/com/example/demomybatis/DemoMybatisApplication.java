package com.example.demomybatis;

import com.alibaba.fastjson.JSON;
import com.baidu.bjf.remoting.protobuf.Codec;
import com.baidu.bjf.remoting.protobuf.ProtobufProxy;
import com.example.demomybatis.mapper.Stkinfo;
import com.example.demomybatis.mapper.StkinfoMapper;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.List;

@RestController
@SpringBootApplication
@MapperScan(basePackages = "com.example.demomybatis.mapper")
public class DemoMybatisApplication {


    public static void main(String[] args) {
        SpringApplication.run(DemoMybatisApplication.class, args);

    }

    @Resource
    private StkinfoMapper stkinfoMapper;

    @GetMapping("/test1")
    public void test1() throws IOException {
        List<Stkinfo> stkinfoList = stkinfoMapper.listStkinfo();
        System.out.println(stkinfoList);
        File file = new File("C:\\Users\\Administrator\\Desktop\\a.txt");
        FileOutputStream fos = new FileOutputStream(file);
        File file2 = new File("C:\\Users\\Administrator\\Desktop\\b.txt");
        FileOutputStream fos2 = new FileOutputStream(file2);
        Codec<Stkinfo> studentCodec = ProtobufProxy.create(Stkinfo.class);

        for (Stkinfo stkinfo : stkinfoList) {
            byte[] bytes = studentCodec.encode(stkinfo);
            byte[] bytes1 = JSON.toJSONBytes(stkinfo);
            for (int i = 0; i < 100; i++) {
                fos.write(bytes);
                fos2.write(bytes1);
            }
        }
        fos.flush();
        fos2.flush();
    }
}
