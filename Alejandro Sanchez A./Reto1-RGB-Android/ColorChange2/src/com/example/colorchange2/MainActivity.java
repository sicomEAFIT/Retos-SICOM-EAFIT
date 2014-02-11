package com.example.colorchange2;

import java.util.Random;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.app.Activity;
import android.graphics.Color;

public class MainActivity extends Activity {

	TextView display1;
	Button change;
	Button exit;
	Button tryAgain;

	@Override
	protected void onCreate(Bundle InstanciaG) {
		// TODO Auto-generated method stub
		super.onCreate(InstanciaG);
		setContentView(R.layout.activity_main);
		change = (Button) findViewById(R.id.bColorChange);
		exit = (Button) findViewById(R.id.bExit);
		display1 = (TextView) findViewById(R.id.tvDisplayCode);
		tryAgain = (Button) findViewById(R.id.bTryAgain);
	}

	public void changeC(View view) {
		int color;
		Random rnd = new Random();
		int r = rnd.nextInt(256);
		int g = rnd.nextInt(256);
		int b = rnd.nextInt(256);
		color = Color.argb(255, r, g, b);  // tomado de http://stackoverflow.com/questions/5280367/android-generate-random-color-on-click
													  
		change.setBackgroundColor(color);							  
		display1.setText("RED = " + String.valueOf(r)+ "\n" +
				 "GREEN = " + String.valueOf(g)+ "\n" +
				 "BLUE = " + String.valueOf(b));  //metodo para convertir int a String
		int disColor = Color.argb(255, rnd.nextInt(256), rnd.nextInt(256), rnd.nextInt(256));
		display1.setTextColor(disColor);
	}

	public void exitS(View view) {
		System.exit(0);
	}
	
	public void tryAgain(View view) {
		
													  
		change.setBackgroundColor(Color.WHITE);			//reinicia la aplicacion				  
		display1.setText("The Color Here");
		display1.setTextColor(Color.DKGRAY);
		
	}
	

}



