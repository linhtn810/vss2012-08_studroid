package com.studroid;

import com.studroid.homemenu.AboutScreen;
import com.studroid.homemenu.HelpScreen;
import com.studroid.homemenu.SettingsScreen;

import android.os.Bundle;
import android.app.Activity;
import android.content.Intent;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.LinearLayout;

public class Home extends Activity {

    @Override
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);
        
        LinearLayout scheduleBt = (LinearLayout) findViewById(R.id.ScheduleButton);
        scheduleBt.setOnClickListener(new OnClickListener() {
        	
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ScheduleActivity = new Intent(getApplicationContext(), ScheduleActivity.class);
				startActivity(ScheduleActivity);
			}
        });
        
        LinearLayout subjectBt = (LinearLayout) findViewById(R.id.SubjectButton);
        subjectBt.setOnClickListener(new OnClickListener() {
			
        	public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent SubjectActivity = new Intent(getApplicationContext(), SubjectActivity.class);
				startActivity(SubjectActivity);
			}
        });
        
        LinearLayout examBt = (LinearLayout) findViewById(R.id.ExamButton);
        examBt.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent ExamActivity = new Intent(getApplicationContext(), ExamActivity.class);
				startActivity(ExamActivity);
			}
		});
        
        LinearLayout utilityBt = (LinearLayout) findViewById(R.id.UtilityButton);
        utilityBt.setOnClickListener(new OnClickListener() {
			
			public void onClick(View v) {
				// TODO Auto-generated method stub
				Intent UtilityActivity = new Intent(getApplicationContext(), UtilityActivity.class);
				startActivity(UtilityActivity);
			}
		});
    }

    @Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.home, menu);
        return true;
    }
    
    @Override
    public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.home_about:
			startActivity(new Intent(getApplicationContext(), AboutScreen.class));
			return true;
		case R.id.home_help:
			startActivity(new Intent(getApplicationContext(), HelpScreen.class));
			return true;
		case R.id.home_setting:
			startActivity(new Intent(getApplicationContext(), SettingsScreen.class));
			return true;
    	default: 
    		return super.onContextItemSelected(item);
		}
    }

    
}
