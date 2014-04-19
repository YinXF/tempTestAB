package com.example.temptestab.test;
import java.util.Map;

import com.example.temptestab.dao.UserInfoDAO;
import com.example.temptestab.db.DBOpenHelper;
import com.example.temptestab.service.UserServiceInterface;

import android.test.AndroidTestCase;
import android.util.Log;

public class MyTest extends AndroidTestCase {
	public MyTest()
	{
		
	}
	 
	//´´½¨±í
	public void createDb()
	{
		DBOpenHelper helper=new DBOpenHelper(getContext());
		helper.getWritableDatabase();
	}
	
	
	
	public void testSearchID()
	{
		UserServiceInterface service=new UserInfoDAO(getContext());
		String [] selectionArgs={"1"};
		boolean flag=service.searchUser(selectionArgs);
		Log.i("testSearchID", "eeeeeeeet");
		if(flag==true)
		{
		Log.i("testSearchID", "Exist");
		}
		else
		{
			Log.i("testSearchID", "Not exist>>");
		}
	
	}
	
	public void testSearchPassword()
	{
		UserServiceInterface service=new UserInfoDAO(getContext());
		String [] selectionArgs={"1"};
		boolean flag=service.searchPassword(selectionArgs);
		Log.i("testSearchPassword", "eeeeeeeet");
		if(flag==true)
		{
		Log.i("testSearchPassword", "Exist");
		}
		else
		{
			Log.i("testSearchPassword", "Not exist>>");
		}
		
		
	}

}
