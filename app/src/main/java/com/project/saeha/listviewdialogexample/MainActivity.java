package com.project.saeha.listviewdialogexample;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;

public class MainActivity extends AppCompatActivity {

    // butternife
    @BindView(R.id.bt_main_show_dialog)
    Button btMainShowDialog;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        btMainShowDialog.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

            }
        });

        // 자바 람다를 쓰기 위해서는 gradle에 코드 추가해야 함.
        btMainShowDialog.setOnClickListener(v1 ->{

        });

    }
}
