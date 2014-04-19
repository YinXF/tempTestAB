package com.example.temptestab.dao;

import android.content.Context;
import android.database.Cursor;
import android.database.sqlite.SQLiteDatabase;
import android.util.Log;

import com.example.temptestab.db.DBOpenHelper;
import com.example.temptestab.service.UserServiceInterface;

public class UserInfoDAO implements UserServiceInterface {
	
	private DBOpenHelper helper=null;
	
	public UserInfoDAO(Context context)
	{
		helper=new DBOpenHelper(context);
	}

	//�鿴�Ƿ��������ID��Ӧ�ĵ��û�
	@Override
	public boolean searchUser(String[] params) {
		
		boolean flag=false;		
		SQLiteDatabase database=null;	
		try{
			String sql="select count(*) from UserInfos where id = ? ";
			database=helper.getReadableDatabase();//ʵ�ֶ����ݿ�д�Ĳ���
			Log.i("temp", "$$$$$$$$");
			Cursor cursor= database.rawQuery(sql, params);
			int rows=cursor.getCount();			
			if(rows>0)
			{
				
		    	flag=true;
			}
			
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			if (database!=null)
			{
				database.close();
			}
		}
		
		return flag;
	}

	@Override
	public boolean searchPassword(String[] params) {
		boolean flag=false;		
		SQLiteDatabase database=null;	
		try{
			String sql="select * from UserInfos where id = ? ";
			database=helper.getReadableDatabase();//ʵ�ֶ����ݿ���Ĳ���
			Log.i("temp", "$$$$$$$$");
			Cursor cursor= database.rawQuery(sql, params);
			int rows=cursor.getCount();
			if (rows>0)
			{
				Log.i("temp", "row_counts=======1111");
			}
			while (cursor.moveToNext())
			{
				Log.i("temp", "^^^^^^^^^");
				
		    	String cols_value=cursor.getString(2);
		    	Log.i("temp", "���룺+"+cols_value);
			}
			
		}catch (Exception e){
			e.printStackTrace();
		} finally {
			if (database!=null)
			{
				database.close();
			}
		}
		
		return flag;
	}

}
