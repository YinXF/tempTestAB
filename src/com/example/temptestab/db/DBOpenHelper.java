package com.example.temptestab.db;

import android.content.Context;
import android.database.sqlite.SQLiteDatabase;
import android.database.sqlite.SQLiteDatabase.CursorFactory;
import android.database.sqlite.SQLiteOpenHelper;

public class DBOpenHelper extends SQLiteOpenHelper {

	private static String name="tempTestAB.db";
	private static int version=4;
	public DBOpenHelper(Context context) {
		super(context, name, null, version);
		// TODO Auto-generated constructor stub
	}

	@Override
	public void onCreate(SQLiteDatabase db) {
		String sql="create table UserInfos (id integer PRIMARY KEY AUTOINCREMENT,UName varchar(20),UPassword varchar(20)) ";
        db.execSQL(sql);
        String sql_insert= "insert into UserInfos values (?,?,?)";
        String []temps={"100","yinxiaofei","123456"};
        db.execSQL(sql_insert, temps);
        
        String sql_insert2= "insert into UserInfos values (?,?,?)";
        String []temps2={"110","TOM","654321"};
        db.execSQL(sql_insert2, temps2);
        
	}

	@Override
	public void onUpgrade(SQLiteDatabase db, int oldVersion, int newVersion) {
		// TODO Auto-generated method stub
		String sql="alter table User rename to UserInfos";
		db.execSQL(sql);
		String sql_insert= "insert into UserInfos values (?,?,?)";
        String []temps={"100","yinxiaofei","123456"};
        db.execSQL(sql_insert, temps);
        
        String sql_insert2= "insert into UserInfos values (?,?,?)";
        String []temps2={"110","TOM","654321"};
        db.execSQL(sql_insert2, temps2);

	}

}
