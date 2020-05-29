package com.example.demolambda;

import lombok.AllArgsConstructor;
import lombok.Data;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;

import static java.util.stream.Collectors.groupingBy;
import static java.util.stream.Collectors.toList;

/**
 * @author Administrator
 */
public class Lambda {

    public static void main(String[] args) {
        test1();
    }

    public static void test2() {

        Subject subject1 = new Subject(1, "Math", 80);
        Subject subject2 = new Subject(2, "Eng", 90);
        Subject subject3 = new Subject(3, "CN", 100);
        Subject subject4 = new Subject(1, "Math", 20);
        Subject subject5 = new Subject(2, "Eng", 10);
        Subject subject6 = new Subject(3, "CN", 0);
        Student a = new Student(101, "Du", Arrays.asList(subject1, subject2, subject3));
        Student b = new Student(102, "Qing", Arrays.asList(subject4, subject5, subject6));
        Class clazz = new Class(71, "七班1", Arrays.asList(a, b));


        Subject subject11 = new Subject(1, "Math", 180);
        Subject subject21 = new Subject(2, "Eng", 190);
        Subject subject31 = new Subject(3, "CN", 1100);
        Subject subject41 = new Subject(1, "Math", 120);
        Subject subject51 = new Subject(2, "Eng", 110);
        Subject subject61 = new Subject(3, "CN", 10);
        Student a1 = new Student(103, "Wan", Arrays.asList(subject11, subject21, subject31));
        Student b1 = new Student(104, "De", Arrays.asList(subject41, subject51, subject61));
        Class clazz1 = new Class(171, "七班2", Arrays.asList(a1, b1));

        List<Class> classList = Arrays.asList(clazz, clazz1);

//        classList.stream().collect(groupingBy)

    }

    /**
     * 先后以voucher的stkType/assetFlag进行两次分组
     */

    public static void test1() {

        List<Voucher> voucherList = new ArrayList<>();
        voucherList.add(new Voucher("t1", 1));
        voucherList.add(new Voucher("t1", -1));
        voucherList.add(new Voucher("t2", 1));
        voucherList.add(new Voucher("t2", -1));
        voucherList.add(new Voucher("t3", 1));
        voucherList.add(new Voucher("t3", -1));


        Map<String, Map<Integer, List<Voucher>>> map = voucherList.stream().collect(groupingBy(Voucher::getStkType, groupingBy(Voucher::getAssetFlag, toList())));


        System.out.println(map);

    }


    @Data
    @AllArgsConstructor
    static class Process {
        private int productNum;
        private List<Voucher> voucherList;
    }

    @Data
    @AllArgsConstructor
    static class Voucher {
        private String stkType;
        private int assetFlag;
    }

    @Data
    @AllArgsConstructor
    static class Class {
        private int classId;
        private String className;
        private List<Student> studentList;
    }

    @Data
    @AllArgsConstructor
    static class Student {
        private int studentId;
        private String studentName;
        private List<Subject> subjectList;
    }

    @Data
    @AllArgsConstructor
    static class Subject {
        private int subjectId;
        private String subjectName;
        private int score;
    }
}
