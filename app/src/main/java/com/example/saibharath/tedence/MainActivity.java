//first screen

package com.example.saibharath.tedence;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.ActionBarActivity;
import android.view.View;

import java.io.File;

public class MainActivity extends ActionBarActivity {
	
	Intent i=null;
	

	@Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
       setContentView(R.layout.main_menu_screen);
       File f1=new File("/sdcard/Easy Attendance/Enter_text_files");
  	 
 	  if(!(f1.isDirectory() || f1.exists()))
 	  {
 		  f1.mkdirs();
 	  }
    }
	
	public void func_register_details(View v)
	{
		i=new Intent(this, com.example.saibharath.tedence.Type_chooser.class);
		startActivity(i);
		
	}
	
	public void func_Load_Data(View v)
	{
		i=new Intent(this, com.example.saibharath.tedence.Display_Buttons.class);
		startActivity(i);
	}
	
	public void check_stats(View v)
	{
		i=new Intent(this, com.example.saibharath.tedence.Check_Stats.class);
		startActivity(i);
	}
			
	public void record_deletion(View v)
	{
		i=new Intent(this, com.example.saibharath.tedence.Record_deletion.class);
		startActivity(i);
	}
		

    
    
    @Override
    public void onBackPressed() {
    	// TODO Auto-generated method stub
    //	super.onBackPressed();
    	Intent i=new Intent(Intent.ACTION_MAIN);
		i.addCategory(Intent.CATEGORY_HOME);
		i.setFlags(Intent.FLAG_ACTIVITY_NEW_TASK);
		startActivity(i);
		finish();
		System.exit(0);

    }
    
}
