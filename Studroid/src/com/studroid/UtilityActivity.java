package com.studroid;

import android.os.Bundle;
import android.preference.PreferenceActivity;
import android.view.Menu;

public class UtilityActivity extends PreferenceActivity {

	@Override
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		addPreferencesFromResource(R.layout.utility);
	}
	
	
	@Override
	public boolean onCreateOptionsMenu(Menu menu) {
		return true;
	}
	
}
