package ptit;

import java.util.Scanner;

public class khaiBaoLopThiSinh {
	private String msv,hoTen,lop,ngaySinh;
	private double gpa;
	
	public khaiBaoLopThiSinh() {}
	
	
	public String getMsv() {
		return msv;
	}


	public void setMsv(String msv) {
		msv = "B20DCCN001";
		this.msv = msv;
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getLop() {
		return lop;
	}


	public void setLop(String lop) {
		this.lop = lop;
	}


	public String getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(String ngaySinh) {
		String res = "";
		if(ngaySinh.charAt(1) == '/') {
			res =  "0" + ngaySinh;
		}
		else {
			res = ngaySinh;
		}
		if(ngaySinh.charAt(3) == '/') {
			res = res.substring(0,3) + "0" + res.substring(3);
		}
		this.ngaySinh = res;
	}


	public double getGpa() {
		return gpa;
	}


	public void setGpa(double gpa) {
		this.gpa = gpa;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		khaiBaoLopThiSinh a = new khaiBaoLopThiSinh();
		a.setHoTen(sc.nextLine());
		a.setLop(sc.nextLine());
		a.setNgaySinh(sc.nextLine());
		a.setGpa(sc.nextDouble());
		a.setMsv("");
		System.out.printf("%s %s %s %s %.2f",a.getMsv(),a.getHoTen(),a.getLop(),a.getNgaySinh(),a.getGpa());
	}

}
