package spring.home.ms.domain;

import java.sql.Date;

public class Board {
	
	int bno;
	String title;
	String nik;
	Date bdt;
	int vs;
	public int getBno() {
		return bno;
	}
	public void setBno(int bno) {
		this.bno = bno;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getNik() {
		return nik;
	}
	public void setNik(String nik) {
		this.nik = nik;
	}
	public Date getBdt() {
		return bdt;
	}
	public void setBdt(Date bdt) {
		this.bdt = bdt;
	}
	public int getVs() {
		return vs;
	}
	public void setVs(int vs) {
		this.vs = vs;
	}

	
	
	
}
