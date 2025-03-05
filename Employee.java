package com.gui_application;

public class Employee {

	private int eno;
	private String ename;
	private String ecity;
	
	public Employee() {
		super();
		// TODO Auto-generated constructor stub
	}
	public Employee(int eno, String ename, String ecity)
	{
		super();
		this.eno=eno;
		this.ename=ename;
		this.ecity=ecity;
		
	}
	

	public int getEno() {
		return eno;
	}


	public void setEno(int eno) {
		this.eno = eno;
	}


	public String getEname() {
		return ename;
	}


	public void setEname(String ename) {
		this.ename = ename;
	}


	public String getEcity() {
		return ecity;
	}


	public void setEcity(String ecity) {
		this.ecity = ecity;
	}

	
	@Override
	public String toString() {
		return this.eno + "\t" + this.ename +"\t" + this.ecity;
	}
}
