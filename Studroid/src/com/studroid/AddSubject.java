package com.studroid;

import com.studroid.database.DBAdapter;

import android.app.Activity;
import android.os.Bundle;
import android.view.Menu;
import android.view.View;
import android.view.View.OnClickListener;
import android.widget.Button;
import android.widget.EditText;

public class AddSubject extends Activity {
	
	@Override
	protected void onCreate(Bundle savedInstanceState) {
		// TODO Auto-generated method stub
		super.onCreate(savedInstanceState);
		setContentView(R.layout.addsubject);
		
		Button bt_save = (Button) findViewById(R.id.saveButton);
		bt_save.setOnClickListener(new OnClickListener() {
			
			public void onClick(View arg0) {
				// TODO Auto-generated method stub
				String nameET = ((EditText) findViewById(R.id.subject)).getText().toString();
				String locationET = ((EditText) findViewById(R.id.location)).getText().toString();
				String timebeginET = ((EditText) findViewById(R.id.fromTime)).getText().toString();
				String timeendET = ((EditText) findViewById(R.id.toTime)).getText().toString();
				DBAdapter dbAdapter = new DBAdapter(getApplicationContext());
				dbAdapter.open();
				dbAdapter.createRecord(nameET, locationET, timebeginET, timeendET);
				dbAdapter.close();
			}
		});
	}
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		// TODO Auto-generated method stub
		getMenuInflater().inflate(R.menu.home, menu);
		return super.onCreateOptionsMenu(menu);
	}

}
