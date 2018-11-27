package com.example.alex.myapplication;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;
import android.widget.Button;
import android.widget.Toast;

import butterknife.BindView;
import butterknife.ButterKnife;
import butterknife.OnClick;

public class MainActivity extends AppCompatActivity {

    @BindView(R.id.webview) WebView webView;
    // sa nu mai faci webView = findViewById(R.id.webview); face automat bindingu

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ButterKnife.bind(this);
        webView.loadUrl("https://myrottenpotatoe.herokuapp.com/movies");

        /*final Button button = (Button) findViewById(R.id.button);
        button.setOnClickListener(new View.OnClickListener()
        {
            public void onClick(View v)
            {
                Toast toast = Toast.makeText(getApplicationContext(),"Mheeeeeyyy",Toast.LENGTH_SHORT);
                toast.show();
            }
        });*/
    }

    @OnClick(R.id.button2)
    public void onButtonClicked()
    {
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
       // Toast.makeText(getApplicationContext(),"Mheeeeeyyy",Toast.LENGTH_SHORT).show();
    }

}
