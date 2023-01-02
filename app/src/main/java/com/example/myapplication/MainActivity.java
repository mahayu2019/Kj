package com.example.myapplication;


import android.util.Log;
import android.view.View;
import android.widget.*;
import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    private static final String TAG = "按钮";
    private String imgid;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button button = (Button) findViewById(R.id.button);
        EditText edt = (EditText) findViewById(R.id.editText);
        TextView textView = (TextView) findViewById(R.id.text_view);
        ImageView img = (ImageView) findViewById(R.id.imgs);

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
            }
        });
    }
}