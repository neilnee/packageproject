package com.neil.mavenpackage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.neil.mavenlibpack.BasicLib;

public class MainActivity extends Activity {

    private TextView mTextView = null;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initControllers();
    }
    
    private final void initControllers() {
        mTextView = (TextView) findViewById(R.id.textview);
        mTextView.setText(BasicLib.createString());
    }

}
