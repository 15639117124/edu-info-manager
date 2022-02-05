package com.yamin.edu.info.manager.entry;

import com.yamin.edu.info.manager.controller.Studentcontroller;

import java.util.Scanner;

public class infoManagerEntry {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        while(true){
            System.out.println("-----欢迎来到亚敏信息管理系统----");
            System.out.println("请输入你的选择：1.学生管理 2.老师管理 3.退出");
            String choice = sc.next();
            switch(choice){
                case "1":
                    //System.out.println("学生管理系统");
                    Studentcontroller studentcontroller = new Studentcontroller();
                    studentcontroller.start();
                    break;
                case "2" :
                    System.out.println("老师管理系统");
                    break;
                case "3":
                    System.out.println("感谢你的使用");
                    System.exit(0);
                    break;

            }
        }
    }
}
