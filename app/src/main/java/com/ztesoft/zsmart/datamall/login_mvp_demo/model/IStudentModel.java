package com.ztesoft.zsmart.datamall.login_mvp_demo.model;

import com.ztesoft.zsmart.datamall.login_mvp_demo.bean.Student;

/**
 * Author: 0027008122 [yang.jianan@zte.com.cn]
 * Time: 2016-06-20 9:48
 * Version: 1.0
 * TaskId:
 * Description:
 */
public interface IStudentModel {
    /**
     * 存储学生信息
     *
     * @param id   学号
     * @param name 姓名
     * @param sex  性别
     */
    void save(int id, String name, String sex);

    /**
     * 读取学生信息
     *
     * @param id 学号
     * @return
     */
    Student load(int id);
}
