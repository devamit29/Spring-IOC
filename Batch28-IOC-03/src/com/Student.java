package com;

public class Student {
	
	private int sid;
	
	private String sname;
	
	private Book book;
	
//	private Student() {
//		System.out.println("Student constructor called");
//	}

	public int getSid() {
		return sid;
	}

	public void setSid(int sid) {
		this.sid = sid;
	}

	public String getSname() {
		return sname;
	}

	public void setSname(String sname) {
		this.sname = sname;
	}

	public Book getBook() {
		return book;
	}

	public void setBook(Book book) {
		this.book = book;
	}

	@Override
	public String toString() {
		return "Student [sid=" + sid + ", sname=" + sname + ", book=" + book + "]";
	}
	
	

}
