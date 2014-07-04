package com.neil.mavenpackage;

import android.app.Activity;
import android.os.Bundle;
import android.widget.TextView;

import com.neil.mavenlibpack.BasicLib;
import com.neil.mavenlibpack.NativeLib;

public class MainActivity extends Activity {

    private TextView mTextViewLib = null;
    private TextView mTextViewNative = null;
    
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        
        initControllers();
    }
    
    private final void initControllers() {
    	mTextViewLib = (TextView) findViewById(R.id.textview_lib);
    	mTextViewNative = (TextView) findViewById(R.id.textview_native);
    	
    	mTextViewLib.setText(BasicLib.createString());
    	mTextViewNative.setText(NativeLib.createNativeString());
    }

}
