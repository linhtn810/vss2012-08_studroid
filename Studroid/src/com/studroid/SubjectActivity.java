package com.studroid;


import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;

public class SubjectActivity extends Activity {
	
	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.subject);
		new Handler().postDelayed(new Runnable() {
            public void run() {
                openOptionsMenu();
            }
        }, 1000);
	}

	@Override
    public boolean onCreateOptionsMenu(Menu menu) {
        getMenuInflater().inflate(R.menu.subject, menu);
        return true;
    }
	
	public boolean onOptionsItemSelected(MenuItem item) {
		switch (item.getItemId()) {
		case R.id.subject_add:
			startActivity(new Intent(getApplicationContext(), AddSubject.class));
			return true;
		case R.id.subject_edit:
			return true;
		case R.id.subject_delete:
			return true;
		default: 
			return super.onContextItemSelected(item);
		}
		
	}
}
