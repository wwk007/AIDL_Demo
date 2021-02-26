package com.example.ipc;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.TextView;

import com.example.ipc.util.Staff;

public class SecondActivity extends AppCompatActivity {
    private TextView staffInfo;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);
        staffInfo = findViewById(R.id.staffInfo);

        System.out.println("currentThread:"+Thread.currentThread().getName());

        Bundle bundle = getIntent().getBundleExtra("MainActivity");
        if(bundle != null) {
            Staff staff = bundle.getParcelable("staff");
            staffInfo.setText("姓名:"+staff.getName()+", 性别:"+(staff.getSex() == 0 ? "男" : "女") +", 年龄:"+staff.getAge());
        }
    }
}
