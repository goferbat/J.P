package com.example.tkixi.team4good;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.webkit.WebSettings;
import android.webkit.WebView;
import android.widget.Button;

/**
 * Created by Tkixi on 10/21/17.
 */

public class SupportActivity extends AppCompatActivity {
    Button home;
    private WebView mWebView;
    @Override
    protected void onCreate(Bundle savedInstanceState){
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about);
        home = (Button) findViewById(R.id.button);
        mWebView = (WebView) findViewById(R.id.loadWeb);

        WebSettings webSettings = mWebView.getSettings();
        webSettings.setJavaScriptEnabled(true);

        mWebView.loadUrl("https://www.paypal.com/donate/?token=bpWBem0gGSU9nTT65T5R089qhpR-D8qIWJm_R09BBN7xd2cHKY4NUK83U0IywB4TwbOaom&country.x=US&locale.x=US");

        home.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                startActivity(new Intent(SupportActivity.this, MainActivity.class));
            }
        });
    }
}
