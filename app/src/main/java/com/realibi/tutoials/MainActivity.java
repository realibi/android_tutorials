package com.realibi.tutoials;

import android.content.Intent; // подключаем класс Intent
import androidx.appcompat.app.AppCompatActivity;
import android.view.View; // подключаем класс View для обработки нажатия кнопки

import android.os.Bundle;

public class MainActivity extends AppCompatActivity {
    public final static String EXTRA_MESSAGE = "EXTRA_MESSAGE";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void sendMessage(View view){

    }
}
