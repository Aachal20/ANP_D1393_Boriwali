package com.anudip.model;

public class Product {
	//setter and getter method
	//param and non param constructor
	//toString
	private int pid;
	private String pname;
	private String prize;

	public Product() {
		// TODO Auto-generated constructor stub
	}
	
	public int getPid() {
		return pid;
	}
	public void setPid(int pid) {
		this.pid = pid;
	}
	public String getPname() {
		return pname;
	}
	public void setPname(String pname) {
		this.pname = pname;
	}
	public String getPrize() {
		return prize;
	}
	public void setPrize(String prize) {
		this.prize = prize;
	}
	public Product(int pid, String pname, String prize) {
		super();
		this.pid = pid;
		this.pname = pname;
		this.prize = prize;
	}

	@Override
	public String toString() {
		return "Product [pid=" + pid + ", pname=" + pname + ", prize=" + prize + "]";
	}

}
