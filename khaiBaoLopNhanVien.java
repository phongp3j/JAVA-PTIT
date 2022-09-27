package ptit;

import java.util.Scanner;

public class khaiBaoLopNhanVien {
	
	private String mnv,hoTen,gioiTinh,ngaySinh,diaChi,maSoThue,ngayKyHopDong;
	
	public khaiBaoLopNhanVien() {
	}
	
	
	public String getMnv() {
		return mnv;
	}


	public void setMnv(String mnv) {
		this.mnv = "00001";
	}


	public String getHoTen() {
		return hoTen;
	}


	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}


	public String getGioiTinh() {
		return gioiTinh;
	}


	public void setGioiTinh(String gioiTinh) {
		this.gioiTinh = gioiTinh;
	}


	public String getNgaySinh() {
		return ngaySinh;
	}


	public void setNgaySinh(String ngaySinh) {
		this.ngaySinh = ngaySinh;
	}


	public String getDiaChi() {
		return diaChi;
	}


	public void setDiaChi(String diaChi) {
		this.diaChi = diaChi;
	}


	public String getMaSoThue() {
		return maSoThue;
	}


	public void setMaSoThue(String maSoThue) {
		this.maSoThue = maSoThue;
	}


	public String getNgayKyHopDong() {
		return ngayKyHopDong;
	}


	public void setNgayKyHopDong(String ngayKyHopDong) {
		this.ngayKyHopDong = ngayKyHopDong;
	}

	
	@Override
	public String toString() {
		return this.mnv + " " + this.hoTen + " "+ this.gioiTinh + " " + this.ngaySinh +" " + this.diaChi +" " + this.maSoThue + " " + this.ngayKyHopDong;
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		khaiBaoLopNhanVien a = new khaiBaoLopNhanVien();
		a.setHoTen(sc.nextLine());
		a.setGioiTinh(sc.nextLine());
		a.setNgaySinh(sc.nextLine());
		a.setDiaChi(sc.nextLine());
		a.setMaSoThue(sc.nextLine());
		a.setNgayKyHopDong(sc.nextLine());
		a.setMnv("");
		System.out.print(a.toString());
	}

}
