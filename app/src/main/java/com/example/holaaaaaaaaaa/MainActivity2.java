package com.example.holaaaaaaaaaa;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.webkit.WebView;
import android.webkit.WebViewClient;

public class MainActivity2 extends AppCompatActivity {
    WebView wenas;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        wenas=findViewById(R.id.webvieww);

        String URL = getIntent().getStringExtra("web");
        wenas.setWebViewClient(new WebViewClient());
        wenas.loadUrl("http://" + URL);

    }
}