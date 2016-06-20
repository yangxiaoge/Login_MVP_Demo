package com.ztesoft.zsmart.datamall.login_mvp_demo.view;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.ztesoft.zsmart.datamall.login_mvp_demo.R;
import com.ztesoft.zsmart.datamall.login_mvp_demo.presenter.StudentPresenter;

/**
 * Author: 0027008122 [yang.jianan@zte.com.cn]
 * Time: 2016-06-20 10:10
 * Version: 1.0
 * TaskId:
 * Description:
 */
public class MainActivity extends AppCompatActivity implements IMainView, View.OnClickListener {
    private EditText et_id;
    private EditText et_name;
    private EditText et_sex;
    private Button bt_save;
    private Button bt_load;

    private StudentPresenter mPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.mvp_login);

        initViews();
    }

    private void initViews() {
        et_id = (EditText) findViewById(R.id.et_id);
        et_name = (EditText) findViewById(R.id.et_name);
        et_sex = (EditText) findViewById(R.id.et_sex);
        bt_save = (Button) findViewById(R.id.bt_save);
        bt_load = (Button) findViewById(R.id.bt_load);

        bt_save.setOnClickListener(this);
        bt_load.setOnClickListener(this);

        mPresenter = new StudentPresenter(this);
    }

    @Override
    public void setName(String name) {
        et_name.setText(name);
    }

    @Override
    public void setSex(String sex) {
        et_sex.setText(sex);
    }

    @Override
    public int getId() {
        return Integer.parseInt(et_id.getText().toString());
    }

    @Override
    public String getName() {
        return et_name.getText().toString();
    }

    @Override
    public String getSex() {
        return et_sex.getText().toString();
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()) {
            case R.id.bt_save:
                mPresenter.save(getId(), getName(), getSex());
                break;

            case R.id.bt_load:
                mPresenter.load(getId());
                break;

            default:
                break;
        }
    }
}
