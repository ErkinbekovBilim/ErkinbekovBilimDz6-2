package com.example.erkinbekovbilimdz6_2;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.graphics.Color;
import android.os.Bundle;
import android.provider.CalendarContract;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;
import android.widget.VideoView;

import org.w3c.dom.Text;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        EditText gmail = (EditText) findViewById(R.id.gmail);
        EditText password = (EditText) findViewById(R.id.password);
        TextView niceToMeet = (TextView) findViewById(R.id.NiceToMeet);
        @SuppressLint({"MissingInflatedId", "LocalSuppress"}) TextView clickPassword = findViewById(R.id.clickPassword);
        TextView tup = (TextView) findViewById(R.id.tup);
        Button button = (Button) findViewById(R.id.button);
        TextView textView = (TextView) findViewById(R.id.textView);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if (gmail.getText().toString().equals("admin") && password.getText().toString().equals("admin") && gmail.getVisibility() == View.VISIBLE
                        && password.getVisibility() == View.VISIBLE && button.getVisibility() == View.VISIBLE && niceToMeet.getVisibility() == View.VISIBLE
                        && clickPassword.getVisibility() == View.VISIBLE && tup.getVisibility() == View.VISIBLE &&
                        textView.getVisibility() == View.VISIBLE) {
                    niceToMeet.setVisibility(View.GONE);
                    clickPassword.setVisibility(View.GONE);
                    tup.setVisibility(View.GONE);
                    textView.setVisibility(View.GONE);
                    button.setVisibility(View.GONE);
                    gmail.setVisibility(View.GONE);
                    password.setVisibility(View.GONE);
                    Toast.makeText(MainActivity.this,"Вы успешно зарегистрировались",Toast.LENGTH_LONG).show();
                }else{
                    niceToMeet.setVisibility(View.VISIBLE);
                    clickPassword.setVisibility(View.VISIBLE);
                    tup.setVisibility(View.VISIBLE);
                    textView.setVisibility(View.VISIBLE);
                    button.setVisibility(View.VISIBLE);
                    gmail.setVisibility(View.VISIBLE);
                    password.setVisibility(View.VISIBLE);
                    Toast.makeText(MainActivity.this, "Неправильный логин и пароль", Toast.LENGTH_LONG).show();
                }

            }
        });
        findViewById(R.id.gmail).setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                if(gmail.getText().toString().length() > 0 && password.getText().toString().length() > 0){
                    button.getResources().getColor(R.color.orange);
                }else {
                    button.getResources().getColor(R.color.gray);
                }
            }
        });
    }
}