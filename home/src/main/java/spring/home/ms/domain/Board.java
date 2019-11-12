package spring.home.ms.domain;

import java.sql.Date;

public class Board {
	
	protected int bno;
	protected String title;
	protected String memo;
	protected String nik;
	protected Date bdt;
	protected int vs;
	
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
	public String getMemo() {
		return memo;
	}
	public void setMemo(String memo) {
		this.memo = memo;
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
	@Override
	public String toString() {
		return "Board [bno=" + bno + ", title=" + title + ", memo=" + memo + ", nik=" + nik + ", bdt=" + bdt + ", vs="
				+ vs + "]";
	}
	
	
	
	
}
	