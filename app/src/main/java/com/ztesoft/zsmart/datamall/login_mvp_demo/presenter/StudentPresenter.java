package com.ztesoft.zsmart.datamall.login_mvp_demo.presenter;

import com.ztesoft.zsmart.datamall.login_mvp_demo.bean.Student;
import com.ztesoft.zsmart.datamall.login_mvp_demo.model.IStudentModel;
import com.ztesoft.zsmart.datamall.login_mvp_demo.model.StudentModel;
import com.ztesoft.zsmart.datamall.login_mvp_demo.view.IMainView;

/**
 * Author: 0027008122 [yang.jianan@zte.com.cn]
 * Time: 2016-06-20 10:00
 * Version: 1.0
 * TaskId:
 * Description:
 */
public class StudentPresenter {
    private IStudentModel iStudentModel;
    private IMainView iMainView;

    public StudentPresenter(IMainView iMainView) {
        this.iMainView = iMainView;
        iStudentModel = new StudentModel();
    }

    public void save(int id, String name, String sex) {
        // 通过IStudentModel接口的实现类保存
        iStudentModel.save(id, name, sex);
    }

    public void load(int id) {
        Student loadStudent = iStudentModel.load(id);
        // view 组件 赋值
        iMainView.setName(loadStudent.getName());
        iMainView.setSex(loadStudent.getSex());
    }
}
