package com.android.imitationapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.Toast;

import com.android.imitationapp.Activty.Join_page;
import com.android.imitationapp.Activty.Registration_page;
import com.android.imitationapp.StorageData.AccountRegistration;

import org.litepal.tablemanager.Connector;

import java.sql.Connection;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button b11=(Button)findViewById(R.id.b1);
        b11.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent=new Intent(MainActivity.this, Registration_page.class);
                startActivity(intent);
//                Toast.makeText(MainActivity.this,"登陆成功",Toast.LENGTH_SHORT).show();

            }
        });
    }
}
