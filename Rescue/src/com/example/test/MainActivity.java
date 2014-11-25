package com.example.test;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;

public class MainActivity extends Activity {

   @Override
   protected void onCreate(Bundle savedInstanceState) {
      super.onCreate(savedInstanceState);
      setContentView(R.layout.activity_main);
   }


   public void activity2(View view){
      Intent intent = new Intent(this,com.example.test.MainActivity2.class);
      startActivity(intent);
   }
   
   public void activity3(View view){
	      Intent intent = new Intent(this,com.example.test.MainActivity3.class);
	      startActivity(intent);
	   }
   
   @Override
   public boolean onCreateOptionsMenu(Menu menu) {
      // Inflate the menu; this adds items to the action bar if it is present.
      getMenuInflater().inflate(R.menu.main, menu);
      return true;
   }

}
