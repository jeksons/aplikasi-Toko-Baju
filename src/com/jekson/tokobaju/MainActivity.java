package com.jekson.tokobaju;

import android.os.Bundle;
import android.view.View;
import android.view.Window;
import android.widget.Button;
import android.app.Activity;
import android.content.Intent;


public class MainActivity extends Activity {
	Button btntombol;
	Button btntoko2;
	Button btntoko3;
	

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		requestWindowFeature(Window.FEATURE_NO_TITLE);
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main);
		
		btntombol =(Button)findViewById(R.id.toko1);
		btntoko2 =(Button)findViewById(R.id.toko2);
		btntoko3 =(Button)findViewById(R.id.toko3);
		
		btntombol.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),sdanh.class);
				startActivity(i);
				
			}
		});
		
        btntoko2.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),lexusion.class);
				startActivity(i);
				
			}
		});
        
        btntoko3.setOnClickListener(new View.OnClickListener() {
			
			@Override
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent i = new Intent(getApplicationContext(),avib.class);
				startActivity(i);
				
			}
		});
		
		
	}

	
}
