package com.yll.as;


import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;

import com.yll.util.pubFun;

public class LoginActivity extends AppCompatActivity {
    private EditText editPhone;
    private EditText editPwd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.login);
        editPhone = (EditText) findViewById(R.id.editPhone);
        editPwd = (EditText) findViewById(R.id.editPwd);
    }


    /**
     * login event
     * @param v
     */
    public void OnMyLoginClick(View v) {
        if (pubFun.isEmpty(editPhone.getText().toString()) || pubFun.isEmpty(editPwd.getText().toString())) {
            Toast.makeText(this, "手机号或密码不能为空！", Toast.LENGTH_SHORT).show();
            return;
        }
    }

    /**
     * Jump to the registration interface
     * @param v
     */
    public void OnMyRegistClick(View v) {
        Bundle bundle = new Bundle();
        Intent intent = new Intent();
        intent.putExtras(bundle);
        intent.setClass(LoginActivity.this,RegistActivity.class);
        LoginActivity.this.startActivity(intent);
//        this.startActivityForResult(intent,1);
//        this.startActivity(intent);
//        Intent intent=new Intent(LoginActivity.this,RegistActivity.class);
//        //intent.putExtra("info", "No66778899");
//        LoginActivity.this.startActivity(intent);
    }
}
