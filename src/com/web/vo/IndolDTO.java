package com.web.vo;

public class IndolDTO {
	
	private String indate ;
	private String type;
	private String ok;
	private String nowspot;
	private int empNo;
	public String getIndate() {
		return indate;
	}
	public void setIndate(String indate) {
		this.indate = indate;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getOk() {
		return ok;
	}
	public void setOk(String ok) {
		this.ok = ok;
	}
	public String getNowspot() {
		return nowspot;
	}
	public void setNowspot(String nowspot) {
		this.nowspot = nowspot;
	}
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	@Override
	public String toString() {
		return "IndolDTO [indate=" + indate + ", type=" + type + ", ok=" + ok
				+ ", nowspot=" + nowspot + ", empno=" + empNo + "]";
	}
}
