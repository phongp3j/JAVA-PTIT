package ptit;

import java.util.Scanner;

public class khaiBaoLopSinhVien {
	private String hoTen;
	private String ngaySinh;
	private double d1,d2,d3,tong;
	
	public khaiBaoLopSinhVien(String hoTen,String ngaySinh, double d1,double d2,double d3) {
		this.hoTen = hoTen;
		this.ngaySinh = ngaySinh;
		this.d1 = d1;
		this.d2 = d2;
		this.d3 = d3;
		this.tong = d1 + d2 +d3;
	}
	
	
	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public double getD1() {
		return d1;
	}


	public void setD1(double d1) {
		this.d1 = d1;
	}


	public double getD2() {
		return d2;
	}


	public void setD2(double d2) {
		this.d2 = d2;
	}


	public double getD3() {
		return d3;
	}


	public void setD3(double d3) {
		this.d3 = d3;
	}


	public double getTong() {
		return tong;
	}


	public void setTong(double tong) {
		this.tong = tong;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		khaiBaoLopSinhVien a = new khaiBaoLopSinhVien(sc.nextLine(),sc.nextLine(),sc.nextDouble(),sc.nextDouble(),sc.nextDouble());
		System.out.print(a.getHoTen() + " " + a.getNgaySinh() + " " + a.getTong());
	}

}
