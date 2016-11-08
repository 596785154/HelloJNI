package com.example.hellojni;

import android.os.Bundle;
import android.app.Activity;
import android.view.Menu;

public class MainActivity extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		System.out.println("Chunna.zheng==="+HelloJNI.sayHello("client"));
		System.out.println("Chunna.zheng==="+HelloJNI.add(5, 4));
	}
	static {
    	System.loadLibrary("HelloJNI");
    }
}
