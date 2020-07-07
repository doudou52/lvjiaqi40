package com.android.imitationapp.Activty;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageButton;
import android.widget.Toast;

import com.android.imitationapp.Home_item_page;
import com.android.imitationapp.R;
import com.android.imitationapp.StorageData.AccountRegistration;

import org.litepal.LitePal;

import java.util.List;

public class Join_page extends AppCompatActivity {
    private EditText edit_Account_Join;
    private EditText edit_Password_Join;
    private Button bt_join;

    private ImageButton back_Re;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_join_page);
        edit_Account_Join=(EditText)findViewById(R.id.edit_Account1);
        bt_join=(Button)findViewById(R.id.bt_join);
        edit_Password_Join=(EditText)findViewById(R.id.edit_password1);
        back_Re=findViewById(R.id.back_bt1);
        back_Re.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(Join_page.this, Registration_page.class);
                startActivity(intent);
            }
        });
        bt_join.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String  account=edit_Account_Join.getText().toString();
                String  password=edit_Password_Join.getText().toString();

                //使用Litepal方法存入数据
                List<AccountRegistration> rizhiLitepals = LitePal.
                        findAll(AccountRegistration.class);


                for(AccountRegistration accountRegistration :rizhiLitepals){
                    String getA= accountRegistration.getAccount();
                    String getP=accountRegistration.getPassword();

                            if (account.equals(getA)||password.equals(getP)){
                        Log.d("MainActivity","guo");
                        Toast.makeText(Join_page.this,"登陆成功",Toast.LENGTH_SHORT).show();
                        Intent intent=new Intent(Join_page.this, Home_page.class);
                        startActivity(intent);
                        break;
                    }else {
                        Log.d("MainActivity","false");
                        Toast.makeText(Join_page.this,"账号错误或者密码错误",Toast.LENGTH_SHORT).show();
                    }
                }

            }
        });




    }
}
