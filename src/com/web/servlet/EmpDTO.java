package com.web.servlet;

public class EmpDTO {

	private int EmpNo;
	private String Position;
	private int PassWord ;
	private String EmpName;
	private String Dept;
	private String Empjoin;
	
	public EmpDTO(){
		
	}
	public EmpDTO(int EmpNo,String Position,int PassWord,
			String EmpName,String Dept,String Empjoin){
		super();
		this.EmpNo=EmpNo;
		this.Position=Position;
		this.PassWord=PassWord;
		this.EmpName=EmpName;
		this.Dept=Dept;
		this.Empjoin=Empjoin;
	}
	
	public int getEmpNo() {
		return EmpNo;
	}
	public void setEmpNo(int empNo) {
		EmpNo = empNo;
	}
	public String getPosition() {
		return Position;
	}
	public void setPosition(String position) {
		Position = position;
	}
	public int getPassWord() {
		return PassWord;
	}
	public void setPassWord(int passWord) {
		PassWord = passWord;
	}
	public String getEmpName() {
		return EmpName;
	}
	public void setEmpName(String empName) {
		EmpName = empName;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public String getEmpjoin() {
		return Empjoin;
	}
	public void setEmpjoin(String empjoin) {
		Empjoin = empjoin;
	}
	
}
