package com.makemyandroidapp.broadcastexample;

import android.content.BroadcastReceiver;
import android.content.Context;
import android.content.Intent;
import android.util.Log;
import android.widget.Toast;

public class MyFirstReceiver extends BroadcastReceiver {
	public static final String TAG = "Fun With Receivers";
	@Override
	public void onReceive(Context ctx, Intent i) {

		//Toast.makeText(MyFirstReceiver.this,"MY_CUSTOM_ACTION Recevied",Toast.LENGTH_LONG).show();
		//Toast.makeText(MyFirstReceiver.this,"MY_CUSTOM_ACTION Recevied",Toast.LENGTH_LONG).show();
		Log.i(TAG,"Hello Crystal!");
	}

}
