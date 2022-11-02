package com.responsi.ngobrolkuy;

import androidx.appcompat.app.AppCompatActivity;
import androidx.cardview.widget.CardView;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;

public class RegisterActivity extends AppCompatActivity {
    private EditText etuname, etemail, etpw, etrepw;
    private CardView cvbtnregist;
    private TextView tvbtnpunya;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        etuname= findViewById(R.id.uname);
        etemail= findViewById(R.id.email);
        etpw= findViewById(R.id.pw);
        etrepw= findViewById(R.id.repw);
        cvbtnregist= findViewById(R.id.buttonregist);
        tvbtnpunya= findViewById(R.id.buttonpunya);

        cvbtnregist.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String etuname=etuname.getText().toString();
                String etemail=etemail.getText().toString();
                String etpw=etpw.getText().toString();
                String etrepw=etrepw.getText().toString();

                Intent pindah=new Intent(RegisterActivity.this, HomeChat.class);

                pindah.putExtra("uname",etuname);
                pindah.putExtra("email",etemail);
                pindah.putExtra("pw",etpw);
                pindah.putExtra("repw",etrepw);

                startActivity(pindah);
            }
        });

        tvbtnpunya.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent pindah = new Intent(RegisterActivity.this, LoginActivity.class);
                startActivity(pindah);
            }
        });
    }
}