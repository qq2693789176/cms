package com.bw.bean;

public class Channer {

	private int hid;
	
	private String hname;
	
	private String person;

	public Channer(int hid, String hname, String person) {
		super();
		this.hid = hid;
		this.hname = hname;
		this.person = person;
	}

	public Channer(String hname, String person) {
		super();
		this.hname = hname;
		this.person = person;
	}

	public Channer() {
		super();
	}

	public int getHid() {
		return hid;
	}

	public void setHid(int hid) {
		this.hid = hid;
	}

	public String getHname() {
		return hname;
	}

	public void setHname(String hname) {
		this.hname = hname;
	}

	public String getPerson() {
		return person;
	}

	public void setPerson(String person) {
		this.person = person;
	}

	@Override
	public String toString() {
		return "Channer [hid=" + hid + ", hname=" + hname + ", person=" + person + "]";
	}
	
	
}
