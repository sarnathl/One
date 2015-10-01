package com.example.one;

import android.app.Activity;
import android.os.Bundle;
import android.widget.Button;

public class MainActivity extends Activity {
    private Button button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // // TODO: 15/10/1  刘彦注册 
        setContentView(R.layout.activity_main);
        // // TODO: 15/10/1  刘彦登陆 
        button = (Button) findViewById(R.id.button);
        
        
    }

}
