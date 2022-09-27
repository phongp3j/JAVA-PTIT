package ptit;

import java.util.Scanner;

public class tinhToanPhanSo {
	private long tu,mau;
	
	public tinhToanPhanSo(long tu,long mau) {
		this.tu = tu;
		this.mau = mau;
	}
	
	public long gcd(long a, long b) {
		if(a%b==0) {
			return b;
		}
		else {
			return gcd(b,a%b);
		}
	}
	
	public void output(tinhToanPhanSo p1) {
		long tu1 = (this.tu*p1.mau+p1.tu*this.mau)*(this.tu*p1.mau+p1.tu*this.mau);
		long mau1 = (this.mau*p1.mau)*(this.mau*p1.mau);
		long gcd = gcd(tu1,mau1);
		tu1 /= gcd;
		mau1 /= gcd;
		long tu2 = this.tu*p1.tu*tu1;
		long mau2 = this.mau*p1.mau*mau1;
		long gcd1 = gcd(tu2,mau2);
		tu2 /= gcd1;
		mau2 /= gcd1;
		System.out.println(tu1+"/"+mau1+" "+tu2+"/"+mau2);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			tinhToanPhanSo a = new tinhToanPhanSo(sc.nextLong(),sc.nextLong());
			tinhToanPhanSo b = new tinhToanPhanSo(sc.nextLong(),sc.nextLong());
			a.output(b);
		}
	}

}
