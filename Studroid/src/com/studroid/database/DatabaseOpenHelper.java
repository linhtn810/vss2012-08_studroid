package com.studroid.database;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteOpenHelper;

public class DatabaseOpenHelper extends SQLiteOpenHelper {
	
	static final String DATABASE_NAME = "SubjectDB";
	static final int DATABASE_VERSION = 1;
	
	static final String KEY_ID = "_id";
	static final String KEY_NAME = "name";
	static final String KEY_LOCATION = "location";
	static final String KEY_TEACHER = "teacher";
	static final String KEY_TIMEBEGIN = "timebegin";
	static final String KEY_TIMEEND = "timeend";
	
	DatabaseOpenHelper(Context context) {
		super(context, DATABASE_NAME, null, DATABASE_VERSION);
	}

	@Override
	public void onCreate(SQLiteDatabase sqLiteDb) {
		// TODO Auto-generated method stub
		String createSQL = "create table " + DATABASE_NAME + " (" +
				KEY_ID + " integer primary key autoincrement, " +
				KEY_NAME + " text not null, " +
				KEY_LOCATION + " text, " +
				KEY_TEACHER + " text, " +
				KEY_TIMEBEGIN + " text, " +
				KEY_TIMEEND + " text);";
		sqLiteDb.execSQL(createSQL);
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		db.execSQL("drop table if exist " + DATABASE_NAME);
		onCreate(db);
	}

}
