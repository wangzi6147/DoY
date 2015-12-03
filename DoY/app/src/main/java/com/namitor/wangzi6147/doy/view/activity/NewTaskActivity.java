package com.namitor.wangzi6147.doy.view.activity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

import com.namitor.wangzi6147.doy.R;
import com.namitor.wangzi6147.doy.presenter.INewTaskPresenter;
import com.namitor.wangzi6147.doy.presenter.NewTaskPresenter;
import com.namitor.wangzi6147.doy.utils.StringUtil;

/**
 * Created by wangzi6147 on 2015/11/29.
 */
public class NewTaskActivity extends BaseActivity implements View.OnClickListener, INewTaskView{

    private View mLeftView;
    private Button mBtnSubmit;
    private EditText mTitleEdit, mContentEdit, mValueEdit;
    private INewTaskPresenter newTaskPresenter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setActivityContentView(R.layout.activity_new_task);
        getTopBar().hide();
        newTaskPresenter = new NewTaskPresenter(this, this);
    }

    @Override
    protected void findViews() {
        mLeftView = findViewById(R.id.v_activity_new_left_blank);
        mBtnSubmit = (Button) findViewById(R.id.bt_activity_new_submit);
        mTitleEdit = (EditText) findViewById(R.id.et_activity_new_title);
        mContentEdit = (EditText) findViewById(R.id.et_activity_new_content);
        mValueEdit = (EditText) findViewById(R.id.et_activity_new_value);
    }

    @Override
    protected void initViews() {
        mLeftView.setOnClickListener(this);
        mBtnSubmit.setOnClickListener(this);
    }

    @Override
    public void onClick(View v) {
        switch (v.getId()){
            case R.id.v_activity_new_left_blank:
                finish();
                break;
            case R.id.bt_activity_new_submit:
                String s = mValueEdit.getText().toString();
                if(StringUtil.isInteger(s)){
                    newTaskPresenter.submit(mTitleEdit.getText().toString(), mContentEdit.getText().toString(), Integer.parseInt(s));
                }else{
                    Toast.makeText(this, "B值必须为数字", Toast.LENGTH_LONG).show();
                }
                break;
            default:
                break;
        }
    }

    @Override
    public void onSubmit() {
        finish();
    }
}
