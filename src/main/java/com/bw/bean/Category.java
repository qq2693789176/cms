package com.bw.bean;

public class Category {

	private int cid;
	
	private String cname;
	
	private double money;
	
	private int hid;

	public int getCid() {
		return cid;
	}

	public void setCid(int cid) {
		this.cid = cid;
	}

	public String getCname() {
		return cname;
	}

	public void setCname(String cname) {
		this.cname = cname;
	}

	public double getMoney() {
		return money;
	}

	public void setMoney(double money) {
		this.money = money;
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public Category(int cid, String cname, double money, int hid) {
		super();
		this.cid = cid;
		this.cname = cname;
		this.money = money;
		this.hid = hid;
	}

	public Category(String cname, double money, int hid) {
		super();
		this.cname = cname;
		this.money = money;
		this.hid = hid;
	}

	public Category() {
		super();
	}

	@Override
	public String toString() {
		return "Category [cid=" + cid + ", cname=" + cname + ", money=" + money + ", hid=" + hid + "]";
	}
	
	
}
