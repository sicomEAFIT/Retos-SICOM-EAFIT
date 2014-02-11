package com.example.edadbiologicaunica;


import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.graphics.Color;
import android.text.InputType;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;

public class MainActivity extends Activity {

	TextView display1;
	Button answer;
	Button continue1;
	Button exit;
	EditText age;
	int bioAge = 0;
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.entraredad);
		age = (EditText)findViewById(R.id.etComando);
        continue1 = (Button) findViewById(R.id.bEdad);
        display1 = (TextView)findViewById(R.id.tvInvalido);
        age.setInputType(InputType.TYPE_CLASS_TEXT); 
	}

	public void checkAge(View v) {
		// TODO Auto-generated method stub
		String check = age.getText().toString();
		display1.setText(check);
		if(isNumeric(check) && check!=null && !check.equals("")){
			int x = Integer.parseInt(check);
			if(isValidAge(x)){
				display1.setText("Edad Valida");
				display1.setTextColor(Color.GREEN);
				bioAge = x;
				Intent openTest = new Intent(MainActivity.this, Test.class);
				Bundle b = new Bundle();
				b.putInt("bioAge", bioAge); //ESTE ES EL PARAMETRO
				openTest.putExtras(b); //Pasa el parámetro.
				startActivity(openTest);
				
			}
			else{
				display1.setText("Edad Inválida.       Ingrese una edad Válida y presione CONTINUAR.");
				display1.setTextColor(Color.RED);
			}
		}
		else{
			display1.setText("Edad Inválida.           Ingrese una edad Válida y presione CONTINUAR.");
			display1.setTextColor(Color.RED);
			
		}
	}
	
	 public boolean isNumeric(String x){
	        for(int i=0;i<x.length();i++){
	            if(!(x.charAt(i) <= '9' && x.charAt(i)>='0')){
	                return false;
	            }
	        }
	        return true;
	  }
	 
	   public boolean isValidAge(int x){
	        if(x <=80 && x>=1){
	            return true;
	        }
	        else{
	            return false;
	       }
	} 
	
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_main, menu);
		return true;
	}
	
	@Override
	  protected void onPause() {
	    // TODO Auto-generated method stub
	    super.onPause();
	    finish();
	  }

}
