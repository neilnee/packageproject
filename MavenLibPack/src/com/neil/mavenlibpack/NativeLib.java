package com.neil.mavenlibpack;

public class NativeLib {
	
	static {
		System.loadLibrary("mavenlibpack");
	}

	
	public static String createNativeString() {
		return stringFromJNI();
	}

	private static native String stringFromJNI();
}
