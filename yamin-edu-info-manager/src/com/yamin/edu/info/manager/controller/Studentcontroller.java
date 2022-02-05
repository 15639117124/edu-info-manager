package com.yamin.edu.info.manager.controller;

import com.yamin.edu.info.manager.domain.Student;
import com.yamin.edu.info.manager.service.StudentService;

import java.util.Scanner;

public class Studentcontroller {

    public void start() {
        Scanner sc = new Scanner(System.in);
        studentLoop:while (true) {
            System.out.println("-----欢迎来到学生管理系统----");
            System.out.println("请输入你的选择：1.添加学生信息 2.删除学生信息 3.修改学生信息 4.查看学生信息 5.退出");
            String choice = sc.next();
            switch(choice){
                case "1":
                    //System.out.println("添加学生信息");
                    addStudent();
                    break;
                case "2":
                    System.out.println("删除学生信息");
                    break;
                case "3":
                    System.out.println("修改学生信息");
                    break;
                case "4":
                    System.out.println("查看学生信息");
                    break;
                case "5":
                    System.out.println("退出");
                    break studentLoop;

            }
        }

    }

    public void addStudent() {
        String id;
        Scanner sc = new Scanner(System.in);
        StudentService studentService = new StudentService();
        while(true){
            System.out.println("请输入学生学号");
            id = sc.next();
            boolean flag = studentService.isExists(id);
            if(flag){
                System.out.println("此学号已经被占用，请重新输入");
            }else{
                break;
            }
        }
        System.out.println("请输入学生姓名");
        String name = sc.next();
        System.out.println("请输入学生年龄");
        String age = sc.next();
        System.out.println("请输入学生生日");
        String birthday = sc.next();
        Student stu = new Student();
        stu.setId(id);
        stu.setName(name);
        stu.setAge(age);
        stu.setBirthday(birthday);

        boolean result = studentService.addStudent(stu);
        if(result){
            System.out.println("添加成功");
        }else{
            System.out.println("添加失败");
        }
    }
}
