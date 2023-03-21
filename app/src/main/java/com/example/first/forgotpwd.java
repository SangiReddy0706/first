package com.example.first;

import android.app.Activity;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class forgotpwd extends Activity {
    @Override
    protected void onCreate(@Nullable Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.layoutpwd);
        Button b;
        EditText e1;
        EditText e2;
        e1=(EditText) findViewById(R.id.edit1);
        e2=(EditText) findViewById(R.id.edit2);
        b=(Button) findViewById(R.id.button2);
        b.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String s=e1.getText().toString();
                String s1=e2.getText().toString();
                if(s1.equals(s)){
                    Toast.makeText(getApplicationContext(),"Password Reset Successful",Toast.LENGTH_SHORT).show();
                    Intent i=new Intent(forgotpwd.this,MainActivity.class);
                    startActivity(i);
                }
                else{
                    Toast.makeText(getApplicationContext(),"New and confirm Password doesnot match",Toast.LENGTH_SHORT).show();
                }
            }
        });
    }
}
