package com.example.temptestab;

import android.app.Activity;
import android.content.Intent;
import android.graphics.Paint;
import android.os.Bundle;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.ImageButton;

public class MainPage extends Activity {
	 @Override
	    protected void onCreate(Bundle savedInstanceState) {
	        super.onCreate(savedInstanceState);
	        setContentView(R.layout.register);
	        
	        Button btn_RegisterPhone=(Button)findViewById(R.id.btnMessage);
	        btn_RegisterPhone.setOnClickListener(myOnClickListener); 
	       
	       
	    }

	    private OnClickListener myOnClickListener = new OnClickListener() {  
	        public void onClick(View v) {  
	        	Intent intent = new Intent(MainPage.this,RegisterPhone.class);
	        	startActivity(intent);             
	        }         
	    };     

}
