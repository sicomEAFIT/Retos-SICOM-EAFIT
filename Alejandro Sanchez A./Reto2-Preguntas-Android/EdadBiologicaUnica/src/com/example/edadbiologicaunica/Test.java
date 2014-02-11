package com.example.edadbiologicaunica;



import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class Test extends Activity {

	Button b1, b2;
	TextView question;
	int bioAge = 0;
	int questionNum = 1;
	
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_test);
		b1 = (Button) findViewById(R.id.bFem);
		b2 = (Button) findViewById(R.id.bMasc);
		question = (TextView) findViewById(R.id.tvDisplaySex);
	    Bundle b = getIntent().getExtras();
	    bioAge = b.getInt("bioAge");
	}
	
	
	
	 public void decreaseBioAge(View v) {
	        // TODO Auto-generated method stub;
		 	  
	    
	          bioAge--;
	          switch(questionNum) {
	          	case 1:
	        	  question.setText("¿Vive solo?");
	 	          b1.setText("No");
	 	          b2.setText("Si");
	              break;
	          	case 2:
		        	  question.setText("¿Es pesimista?");
		 	          b1.setText("No");
		 	          b2.setText("Si");
		              break;
	          	case 3:
		        	  question.setText("¿Reacciona violentamente?");
		 	          b1.setText("No");
		 	          b2.setText("Si");
		              break;
	          	case 4:
		        	  question.setText("¿Desea vivir mas de 90 años?");
		 	          b1.setText("Si");
		 	          b2.setText("No");
		              break;
	          	case 5:
		        	  question.setText("¿Tiene el peso adecuado para su estatura?");
		 	          b1.setText("Si");
		 	          b2.setText("No");
		              break;
	          	case 6:
		        	  question.setText("¿Realiza actividad fisica regularmente?");
		 	          b1.setText("Si");
		 	          b2.setText("No");
		              break;
	          	case 7:
		        	  question.setText("¿Se estresa con frecuencia?");
		 	          b1.setText("No");
		 	          b2.setText("Si");
		              break;
	          	case 8:
		        	  question.setText("¿Fuma?");
		 	          b1.setText("No");
		 	          b2.setText("Si");
		              break;
	          	case 9:
		        	  question.setText("¿Se siente feliz?");
		 	          b1.setText("Si");
		 	          b2.setText("No");
		              break;
	          	case 10:
		        	  question.setText("¿Esta enamorado?");
		 	          b1.setText("Si");
		 	          b2.setText("No");
		              break;
	          	case 11:
		        	  question.setText("Su edad biologica es " + bioAge + " años");
		 	          b1.setText("Volver a calcular");
		 	          b2.setText("OK");
		              break;
	        	case 12:
		        	  tryAgain(v);
		              break;
		              
	          }
	          questionNum++;
	          //question.setText(String.valueOf(bioAge));
	      }
	 

	 public void increaseBioAge(View v) {
	        // TODO Auto-generated method stub;
		     
	          bioAge++; 
	          switch(questionNum) {
	          case 1:
	        	  question.setText("¿Vive solo?");
	 	          b1.setText("No");
	 	          b2.setText("Si");
	              break;
	          	case 2:
		        	  question.setText("¿Es pesimista?");
		 	          b1.setText("No");
		 	          b2.setText("Si");
		              break;
	          	case 3:
		        	  question.setText("¿Reacciona violentamente?");
		 	          b1.setText("No");
		 	          b2.setText("Si");
		              break;
	          	case 4:
		        	  question.setText("¿Desea vivir mas de 90 años?");
		 	          b1.setText("Si");
		 	          b2.setText("No");
		              break;
	          	case 5:
		        	  question.setText("¿Tiene el peso adecuado para su estatura?");
		 	          b1.setText("Si");
		 	          b2.setText("No");
		              break;
	          	case 6:
		        	  question.setText("¿Realiza actividad fisica regularmente?");
		 	          b1.setText("Si");
		 	          b2.setText("No");
		              break;
	          	case 7:
		        	  question.setText("¿Se estresa con frecuencia?");
		 	          b1.setText("No");
		 	          b2.setText("Si");
		              break;
	          	case 8:
		        	  question.setText("¿Fuma?");
		 	          b1.setText("No");
		 	          b2.setText("Si");
		              break;
	          	case 9:
		        	  question.setText("¿Se siente feliz?");
		 	          b1.setText("Si");
		 	          b2.setText("No");
		              break;
	          	case 10:
		        	  question.setText("¿Esta enamorado?");
		 	          b1.setText("Si");
		 	          b2.setText("No");
		              break;
	          	case 11:
		        	  question.setText("Su edad biologica es " + bioAge + " años");
		 	          b1.setText("Volver a calcular");
		 	          b2.setText("OK");
		              break;
	          	case 12:
	          		  System.exit(0);
		              break;
	          }
	          questionNum++;
	      }

	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// Inflate the menu; this adds items to the action bar if it is present.
		getMenuInflater().inflate(R.menu.activity_test, menu);
		return true;
	}

	
	public void tryAgain(View v){
		Intent openTestAgain = new Intent(Test.this, MainActivity.class);
		startActivity(openTestAgain);
	}
	
	@Override
	  protected void onPause() {
	    // TODO Auto-generated method stub
	    super.onPause();
	    finish();
	  }
}
