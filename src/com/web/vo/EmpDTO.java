package com.web.vo;

public class EmpDTO {

	private int empNo;
	private String position;
	private int passWord ;
	private String empName;
	private String dept;
	private String empjoin;
	private String count;
	
	public int getEmpNo() {
		return empNo;
	}
	public void setEmpNo(int empNo) {
		this.empNo = empNo;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public int getPassWord() {
		return passWord;
	}
	public void setPassWord(int passWord) {
		this.passWord = passWord;
	}
	public String getEmpName() {
		return empName;
	}
	public void setEmpName(String empName) {
		this.empName = empName;
	}
	public String getDept() {
		return dept;
	}
	public void setDept(String dept) {
		this.dept = dept;
	}
	public String getEmpjoin() {
		return empjoin;
	}
	public void setEmpjoin(String empjoin) {
		this.empjoin = empjoin;
	}
	public String getCount() {
		return count;
	}
	public void setCount(String count) {
		this.count = count;
	}

	@Override
	public String toString() {
		return "EmpDTO [empNo=" + empNo + ", position=" + position
				+ ", passWord=" + passWord + ", empName=" + empName + ", dept="
				+ dept + ", empjoin=" + empjoin + ", count=" + count + "]";
	}

}
