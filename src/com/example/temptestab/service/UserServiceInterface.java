package com.example.temptestab.service;

public interface UserServiceInterface {
	public boolean searchUser(String [] params); //参数为用户ID，返回值为是否存在该ID对应的用户
	
	public boolean searchPassword(String [] params);  //参数为用户id， 和输入的密码，返回值为密码是否正确

}
