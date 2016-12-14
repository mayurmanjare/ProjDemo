package com.example.seedcommando_7.project1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Toast.makeText(this,"Rashmi",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"Hello",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"How r u?",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"bye",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"testing",Toast.LENGTH_LONG).show();
        Toast.makeText(this,"success",Toast.LENGTH_LONG).show();

    }

}
