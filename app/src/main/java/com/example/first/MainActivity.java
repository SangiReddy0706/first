package com.example.first;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Button btn;
        Button btn1;
        Button btn2;
        Button btn3;
        EditText et1;
        EditText et2;
        et1=(EditText) findViewById(R.id.edtuser);
        et2=(EditText) findViewById(R.id.edtpass);
        btn=(Button) findViewById(R.id.btnsign);
        btn1=(Button) findViewById(R.id.btngoogle);
        btn2=(Button) findViewById(R.id.btnfacebook);
        btn3=(Button) findViewById(R.id.button);
        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=et1.getText().toString();
                String p=et2.getText().toString();
                if((s.equals("cbit"))&&(p.equals("cbit@123"))){
                    Toast.makeText(getApplicationContext(),"Success"+s+p,Toast.LENGTH_LONG).show();
                    et1.setText("");
                    et2.setText("");
                }
                else{
                    Toast.makeText(getApplicationContext(),"UnSuccessful",Toast.LENGTH_SHORT).show();
                }
            }
        });
        btn1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://mail.google.com"));
                startActivity(i);
            }
        });
        btn2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(Intent.ACTION_VIEW, Uri.parse("https://www.facebook.com"));
                startActivity(i);
            }
        });
        btn3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent i=new Intent(MainActivity.this,forgotpwd.class);
                startActivity(i);
            }
        });
    }
}