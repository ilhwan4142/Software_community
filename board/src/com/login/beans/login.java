package com.login.beans;

public class login {	
	//����� ���̵�
	private String Id;
	
	//����� ��й�ȣ
	private String Password;
	
	//����� �̸�
	private String name;
	
	//����� �й�
	private String Snum;	
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSnum() {
		return Snum;
	}
	public void setEmail(String Snum) {
		this.Snum = Snum;
	}
	public String getId() {
		return Id;
	}
	public void setId(String id) {
		Id = id;
	}
	public String getPassword() {
		return Password;
	}
	public void setPassword(String password) {
		Password = password;
	}
}
