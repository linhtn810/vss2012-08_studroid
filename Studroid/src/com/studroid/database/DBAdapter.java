package com.studroid.database;

import android.content.ContentValues;
import android.content.Context;
import android.database.SQLException;
import android.database.sqlite.SQLiteDatabase;

public class DBAdapter {
	
	private Context context;
	private SQLiteDatabase database;
	private DatabaseOpenHelper dbHelper;
	
	public DBAdapter(Context context) {
		this.context = context;
	}
	
	public DBAdapter open() throws SQLException {
		dbHelper = new DatabaseOpenHelper(context);
		database = dbHelper.getWritableDatabase();
		return this;
	}
	
	public void close() {
		dbHelper.close();
	}
	
	public long createRecord(String name, String location, String timeBegin, String timeEnd) {
		ContentValues contentValues = new ContentValues();
		contentValues.put("name", name);
		contentValues.put("location", location);
		contentValues.put("timebegin", timeBegin);
		contentValues.put("timeend", "timeEnd");
		return database.insert("SubjectDB", null, contentValues);
	}

}
