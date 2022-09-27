package ptit;

import java.util.Scanner;

public class tinhThuNhapGiaoVien {
	
	private String maNgach,hoTen;
	private long bacLuong,phuCap,thuNhap,luongCoBan;
	
	public tinhThuNhapGiaoVien() {}
	
	public long getLuongCoBan() {
		return luongCoBan;
	}

	public void setLuongCoBan(long luongCoBan) {
		this.luongCoBan = luongCoBan;
	}

	public String getMaNgach() {
		return maNgach;
	}

	public void setMaNgach(String maNgach) {
		this.maNgach = maNgach;
	}

	public String getHoTen() {
		return hoTen;
	}

	public void setHoTen(String hoTen) {
		this.hoTen = hoTen;
	}

	public long getBacLuong() {
		return bacLuong;
	}

	public void setBacLuong(long bacLuong) {
		long res = 0;
		res = res*10 + this.maNgach.charAt(2) - '0';
		res = res*10 + this.maNgach.charAt(3) - '0';
		this.bacLuong = res;
	}

	public long getPhuCap() {
		return phuCap;
	}

	public void setPhuCap(long phuCap) {
		if(this.maNgach.substring(0, 2).compareTo("HT") == 0) {
			this.phuCap  = 2000000;
		}
		if(this.maNgach.substring(0, 2).compareTo("HP") == 0) {
			this.phuCap  = 900000;
		}
		if(this.maNgach.substring(0, 2).compareTo("GV") == 0){
			this.phuCap  = 500000;
		}
	}

	public long getThuNhap() {
		return thuNhap;
	}

	public void setThuNhap(long thuNhap) {
		long res = this.luongCoBan*this.bacLuong + this.phuCap;
		this.thuNhap = res;
	}

	@Override
	public String toString() {
		return this.maNgach + " " +
	this.hoTen + " " + this.bacLuong + " " +
				this.phuCap + " " + this.thuNhap;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		tinhThuNhapGiaoVien a = new tinhThuNhapGiaoVien();
		a.setMaNgach(sc.nextLine());
		a.setHoTen(sc.nextLine());
		a.setLuongCoBan(sc.nextLong());
		a.setBacLuong(0);
		a.setPhuCap(0);
		a.setThuNhap(0);
		System.out.print(a.toString());
	}

}
