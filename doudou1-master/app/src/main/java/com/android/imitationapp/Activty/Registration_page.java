package com.android.imitationapp.Activty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;

import com.android.imitationapp.MainActivity;
import com.android.imitationapp.R;
import com.android.imitationapp.StorageData.AccountRegistration;

public class Registration_page extends AppCompatActivity {
    private EditText edit_Account;
    private EditText edit_Password;
    private Button bt_Resgistration;
    private Button bt_startjoin;
    private ImageButton finshin;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
        //获取EditText输入的数据转换为字符串
        edit_Account=(EditText)findViewById(R.id.edit_Account);
        edit_Password=(EditText)findViewById(R.id.edit_password);
        bt_Resgistration=(Button)findViewById(R.id.bt_zhuce);
        bt_startjoin=(Button)findViewById(R.id.sign_in1);
        finshin=(ImageButton)findViewById(R.id.exit_bt1);

        bt_Resgistration.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  account=edit_Account.getText().toString();
                String  password=edit_Password.getText().toString();
                Log.d("MainActivity","acount"+account);
                Log.d("MainActivity","password"+password);

                //使用Litepal方法存入数据
                AccountRegistration accountRegistration=new AccountRegistration();
                accountRegistration.setAccount(account);
                accountRegistration.setPassword(password);
                accountRegistration.save();
                Intent intent=new Intent(Registration_page.this, Join_page.class);
                startActivity(intent);
            }
        });
        finshin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                finish();
            }
        });

        bt_startjoin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Registration_page.this, Join_page.class);
                startActivity(intent);
            }
        });
    }
}
