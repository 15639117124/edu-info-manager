package com.yamin.edu.info.manager.dao;

import com.yamin.edu.info.manager.domain.Student;

public class StudentDao {

    private Student[] stus = new Student[5];

    public Student[] findAllStudent() {
        return stus;
    }

    public boolean addStudent(Student stu) {
        int index = -1;
        for (int i = 0; i < stus.length; i++) {
          Student student = stus[i];
          if(student == null){
              index = i;
              break;
          }
        }
        if(index == -1){
            return false;
        }else{
            stus[index] = stu;
            return true;
        }
    }
}
