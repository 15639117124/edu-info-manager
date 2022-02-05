package com.yamin.edu.info.manager.service;

import com.yamin.edu.info.manager.controller.Studentcontroller;
import com.yamin.edu.info.manager.dao.StudentDao;
import com.yamin.edu.info.manager.domain.Student;

public class StudentService {

    StudentDao studentDao = new StudentDao();

    public boolean addStudent(Student stu) {
        return studentDao.addStudent(stu);
    }

    public boolean isExists(String id) {
        Student[] stus = studentDao.findAllStudent();
        boolean exists = false;
        for (int i = 0; i < stus.length; i++) {
            Student stu = stus[i];
            if(stu != null && stus[i].getId().equals(id)){
                exists = true;
                break;
            }
        }
        return exists;
    }
}
