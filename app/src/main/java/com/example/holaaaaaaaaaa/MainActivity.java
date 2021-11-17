package com.example.holaaaaaaaaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView wen;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        wen=findViewById(R.id.name);

    }

    public void Web(View view) {
        Intent i = new Intent(this,MainActivity2.class);
        i.putExtra("web",wen.getText().toString());
        startActivity(i);
    }
}