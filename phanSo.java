package ptit;

import java.util.Scanner;

public class phanSo {
	private long tu;
	private long mau;
	
	public phanSo(long x , long y) {
		this.tu = x ;
		this.mau = y;
	}
	
	
	public long getTu() {
		return tu;
	}


	public void setTu(long tu) {
		this.tu = tu;
	}


	public long getMau() {
		return mau;
	}


	public void setMau(long mau) {
		this.mau = mau;
	}

	public static long gcd(long a , long b) {
		if(a%b == 0) {
			return b;
		}
		else {
			return gcd(b,a%b);
		}
	}
	
	public void res() {
		long gcd = gcd(this.tu,this.mau);
		this.tu /= gcd;
		this.mau /= gcd;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		phanSo a = new phanSo(sc.nextLong() ,sc.nextLong());
		a.res();
		System.out.print(a.getTu() + "/" + a.getMau());
	}

}
