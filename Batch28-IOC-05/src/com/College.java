package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class College {
	
	private int cid;
	
	private String cname;
	
	@Autowired //byType //byName
	@Qualifier(value="student")
	private Student s;

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

	public Student getS() {
		return s;
	}

	public void setS(Student s) {
		this.s = s;
	}

	@Override
	public String toString() {
		return "College [cid=" + cid + ", cname=" + cname + ", s=" + s + "]";
	}
	
	

}
