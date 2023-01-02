package com.example.myapplication;


import android.app.AlertDialog;
import android.app.ProgressDialog;
import android.content.DialogInterface;
import android.util.Log;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "按钮";
    private String imgid;
    private ProgressBar pb;
    private Button btnAlert;
    private Button btnprogress;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        EditText edt = (EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.text_view);
        ImageView img = (ImageView) findViewById(R.id.imgs);
        pb = (ProgressBar) findViewById(R.id.progress_bar);
        btnAlert = (Button) findViewById(R.id.btnAlert);

        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                //Log.d(TAG, "button in");
                textView.setText(edt.getText().toString());
                imgid = edt.getText().toString();
                switch (imgid) {
                    case "h1":
                        img.setImageResource(R.drawable.h1);
                        break;
                    case "h2":
                        img.setImageResource(R.drawable.h2);
                        break;
                    default:
                        break;
                }

                //显示隐藏进度条
//                if (pb.getVisibility() == View.GONE) {
//                    pb.setVisibility(View.VISIBLE);
//                } else {
//                    pb.setVisibility(View.GONE);
//                }

                // 水平进度条
                int progress = pb.getProgress();
                progress = progress + 10;
                pb.setProgress(progress);
            }
        });

        btnAlert.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                AlertDialog.Builder dialog = new AlertDialog.Builder(MainActivity.this);
                dialog.setTitle("警告窗口");
                dialog.setMessage("一些信息");
                dialog.setCancelable(false);
                dialog.setPositiveButton("确定", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d(TAG, "警告对话框按了确认");
                    }
                });
                dialog.setNegativeButton("取消", new DialogInterface.OnClickListener() {
                    @Override
                    public void onClick(DialogInterface dialogInterface, int i) {
                        Log.d(TAG, "警告对话框按了取消");
                    }
                });
                dialog.show();
            }
        });
        //无法运行....
//        btnprogress.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                ProgressDialog progressdialog = new ProgressDialog(MainActivity.this);
//                progressdialog.setTitle("进度条警告框");
//                progressdialog.setMessage("正在运行...");
//                progressdialog.setCancelable(true);
//                progressdialog.show();
//
//            }
//        });

    }
}