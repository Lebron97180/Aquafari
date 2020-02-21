package com.example.aquafari.ui.login;

import android.app.Activity;

import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProviders;

import android.os.Bundle;

import androidx.annotation.Nullable;
import androidx.annotation.StringRes;
import androidx.appcompat.app.AppCompatActivity;

import android.text.Editable;
import android.text.TextWatcher;
import android.view.KeyEvent;
import android.view.View;
import android.view.inputmethod.EditorInfo;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.ProgressBar;
import android.widget.TextView;
import android.widget.Toast;

import com.example.aquafari.R;
import com.example.aquafari.ui.login.LoginViewModel;
import com.example.aquafari.ui.login.LoginViewModelFactory;

public class LoginActivity extends AppCompatActivity {

    private ImageView imageView9;
    private Button button;
    private Button button2;
    private TextView textView;

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        imageView9 = findViewById(R.id.imageView9);
        button = findViewById(R.id.button);
        button2 = findViewById(R.id.button2);
        textView = findViewById(R.id.textView);


            }




}
