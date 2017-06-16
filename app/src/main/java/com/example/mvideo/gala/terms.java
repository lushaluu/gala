package com.example.mvideo.gala;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

import com.example.mvideo.gala.R;

public class terms extends AppCompatActivity {

    WebView table;

    @Override
    protected void onCreate(Bundle savedInstanceState) {


        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_terms);

        table = (WebView) findViewById(R.id.table);
        table.loadUrl("file:///android_asset/table.html");
    }
}
