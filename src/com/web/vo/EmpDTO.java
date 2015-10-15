package com.web.vo;

public class EmpDTO {

	private Long empNo;
	private String position;
	private String passWord ;
	private String empName;
	private String dept;
	private String empjoin;
	private String count;
	private Long ok;

	public Long getEmpNo() {
		return empNo;
	}
	public void setEmpNo(Long empNo) {
		this.empNo = empNo;
	}
	public String getPosition() {
		return position;
	}
	public void setPosition(String position) {
		this.position = position;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
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
	public Long getOk() {
		return ok;
	}
	public void setOk(Long ok) {
		this.ok = ok;
	}

	@Override
	public String toString() {
		return "EmpDTO [empNo=" + empNo + ", position=" + position
				+ ", passWord=" + passWord + ", empName=" + empName + ", dept="
				+ dept + ", empjoin=" + empjoin + ", count=" + count + ", ok="
				+ ok + "]";
	}

}
