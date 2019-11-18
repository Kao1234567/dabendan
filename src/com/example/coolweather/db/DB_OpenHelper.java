package com.example.coolweather.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;



public class DB_OpenHelper extends SQLiteOpenHeelper{
	public DB_OpenHelper(Context context,String name,CursorFactory factory,
			int version){
		super (context,name,factory,version);
	
		
		
	@Override
	public void onCreate(SQLiteDatabase db){
		
	}
	
	@verride
	public void onUpgrade(SQLiteDatabase db,int oldVersion,int newVersion){
		
	}
	}
		
		
}
	
	

