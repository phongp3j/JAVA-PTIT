package ptit;

import java.util.Scanner;

public class tongPhanSo {
	private long tu;
	private long mau;
	
	public tongPhanSo(long x , long y) {
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
	
	public void cong(tongPhanSo p1) {
		this.tu = this.tu*p1.mau + p1.tu*this.mau;
		this.mau *= p1.mau;
	}
	
	public void res() {
		long gcd = gcd(this.tu,this.mau);
		this.tu /= gcd;
		this.mau /= gcd;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long x = sc.nextLong() , y =sc.nextLong();
		tongPhanSo a = new tongPhanSo(x,y);
		x = sc.nextLong();
		y =sc.nextLong();
		tongPhanSo b = new tongPhanSo(x,y);
		a.cong(b);
		a.res();
		System.out.print(a.getTu() + "/" + a.getMau());
	}

}
