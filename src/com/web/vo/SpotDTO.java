package com.web.vo;

public class SpotDTO {

	private Long entno;
	private String entname;
	private String entspot;
	private String enttel;
	private String entempname;
	
	public Long getEntno() {
		return entno;
	}
	public void setEntno(Long entno) {
		this.entno = entno;
	}
	public String getEntname() {
		return entname;
	}
	public void setEntname(String entname) {
		this.entname = entname;
	}
	public String getEntspot() {
		return entspot;
	}
	public void setEntspot(String entspot) {
		this.entspot = entspot;
	}
	public String getEnttel() {
		return enttel;
	}
	public void setEnttel(String enttel) {
		this.enttel = enttel;
	}
	public String getEntempname() {
		return entempname;
	}
	public void setEntempname(String entempname) {
		this.entempname = entempname;
	}
	@Override
	public String toString() {
		return "SpotDTO [entno=" + entno + ", entname=" + entname
				+ ", entspot=" + entspot + ", enttel=" + enttel
				+ ", entempname=" + entempname + "]";
	}
}
