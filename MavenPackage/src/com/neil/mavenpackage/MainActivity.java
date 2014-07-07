package com.neil.mavenpackage;

import android.app.Activity;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.content.pm.PackageManager.NameNotFoundException;
import android.os.Bundle;
import android.widget.TextView;

import com.neil.mavenlibpack.BasicLib;
import com.neil.mavenlibpack.NativeLib;

public class MainActivity extends Activity {

	private String mChannelID = null;
	private TextView mTextViewLib = null;
	private TextView mTextViewNative = null;

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);

		try {
			ApplicationInfo info = getPackageManager().getApplicationInfo(
					getPackageName(), PackageManager.GET_META_DATA);
			mChannelID = info.metaData.getString("channel_id");
		} catch (NameNotFoundException e) {
			e.printStackTrace();
		}

		initControllers();
	}

	private final void initControllers() {
		mTextViewLib = (TextView) findViewById(R.id.textview_lib);
		mTextViewNative = (TextView) findViewById(R.id.textview_native);

		mTextViewLib.setText("BasicLib say : " + BasicLib.createString()
				+ " , NativeLib say : " + NativeLib.createNativeString());
		mTextViewNative.setText("mChannelID : " + mChannelID);
	}

}
