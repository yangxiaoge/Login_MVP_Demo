package com.ztesoft.zsmart.datamall.login_mvp_demo.model;

import android.util.SparseArray;

import com.ztesoft.zsmart.datamall.login_mvp_demo.bean.Student;

/**
 * Author: 0027008122 [yang.jianan@zte.com.cn]
 * Time: 2016-06-20 9:53
 * Version: 1.0
 * TaskId:
 * Description:
 */
public class StudentModel implements IStudentModel {
    private SparseArray<Student> arrayStudent = new SparseArray<>();

    @Override
    public void save(int id, String name, String sex) {
        Student student = new Student();
        student.setId(id);
        student.setName(name);
        student.setSex(sex);
        arrayStudent.append(id, student);
    }

    @Override
    public Student load(int id) {
        Student notFound = new Student();
        notFound.setName("没有发现");
        notFound.setSex("没有发现");
        Student student = arrayStudent.get(id, notFound);
        return student;
    }

}
