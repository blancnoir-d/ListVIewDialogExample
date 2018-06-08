package com.project.saeha.listviewdialogexample;

import android.app.Dialog;
import android.content.Context;
import android.support.v7.app.AlertDialog;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.AdapterView;
import android.widget.Button;
import android.widget.ListView;
import android.widget.TextView;
import butterknife.BindView;
import butterknife.BindViews;
import butterknife.ButterKnife;

public class MainActivity extends AppCompatActivity {

    // butternife
    @BindView(R.id.bt_main_show_dialog)
    Button btMainShowDialog;
    String[] mMenuList = {"학습지 생성하기","학습지 출제하기","교재 수업과 오답유형","보고서"};
    Dialog tutorialDialog = null;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);

        LayoutInflater inflater = (LayoutInflater)getSystemService(Context.LAYOUT_INFLATER_SERVICE);
        DialogListVIewAdapter adapter = new DialogListVIewAdapter(this,mMenuList);

//        btMainShowDialog.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//
//            }
//        });

        // 자바 람다를 쓰기 위해서는 gradle에 코드 추가해야 함.
            btMainShowDialog.setOnClickListener(v1 ->{
//                if(tutorialDialog.isShowing()){
//                    tutorialDialog.dismiss();
//                }

            AlertDialog.Builder listDialogBuilder = new AlertDialog.Builder(this);
            View dialogView = inflater.inflate(R.layout.dialog_main_layout,null);

            ListView dList = (ListView)dialogView.findViewById(R.id.lv_main_dialog_list);
            dList.setAdapter(adapter);
            dList.setOnItemClickListener(new AdapterView.OnItemClickListener() {
                @Override
                public void onItemClick(AdapterView<?> adapterView, View view, int i, long l) {
                    switch (i){
                        case 0 : // 학습지 생성하기
                            break;
                        case 1 : // 학습지 출제하기
                            break;
                        case 2 : // 교재 수업과 오답유형
                            break;
                        case 3 : // 보고서
                            break;

                    }

                }
            });

                listDialogBuilder.setView(dialogView);
                tutorialDialog  = listDialogBuilder.create();

                // 다이얼로그 크기 조절
                WindowManager.LayoutParams lp = new WindowManager.LayoutParams();
                lp.copyFrom(tutorialDialog.getWindow().getAttributes());
                lp.width = 790;
                lp.height = WindowManager.LayoutParams.WRAP_CONTENT;

                tutorialDialog.show();
                Window window = tutorialDialog.getWindow();
                window.setAttributes(lp);

        });

    }
}
