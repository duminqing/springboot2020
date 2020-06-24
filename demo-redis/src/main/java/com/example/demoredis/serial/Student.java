package com.example.demoredis.serial;

import com.baidu.bjf.remoting.protobuf.FieldType;
import com.baidu.bjf.remoting.protobuf.annotation.Protobuf;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.math.BigDecimal;

/**
 * @author Administrator
 */
@Getter
@Setter
@ToString
public class Student {
    @Protobuf(fieldType = FieldType.INT32, required = true, order = 1)
    private int id;
    @Protobuf(fieldType = FieldType.STRING, required = true, order = 2)
    private String name;
    @Protobuf(fieldType = FieldType.INT64, required = true, order = 3)
    private Long grade;
    @Protobuf(fieldType = FieldType.DOUBLE, required = true, order = 4)
    private double score;
    @Protobuf(fieldType = FieldType.BIGDECIMAL, required = true, order = 5)
    private BigDecimal salary;
}
