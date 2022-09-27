package ptit;

import java.util.Scanner;

public class baiToanTinhCong {
	private String mnv,hoTen,chucVu;
	private long luongCoBan,ngayCong;
	
	public baiToanTinhCong(String hoTen, long luongCoBan,long ngayCong,String chucVu) {
		this.hoTen = hoTen;
		this.luongCoBan = luongCoBan*ngayCong;
		this.ngayCong = ngayCong;
		this.chucVu = chucVu;
		this.mnv = "NV01";
	}

	public void res() {
		if(this.ngayCong>=25) {
			if(this.chucVu.compareTo("GD") == 0) {
				System.out.print(this.mnv+" "+this.hoTen+" "+this.luongCoBan+" "+
						(long)(0.2*this.luongCoBan)+" "+250000+" "+(long)(this.luongCoBan*1.2+250000));
			}
			if(this.chucVu.compareTo("PGD")==0) {
				System.out.print(this.mnv+" "+this.hoTen+" "+this.luongCoBan+" "+
						(long)(0.2*this.luongCoBan)+" "+200000+" "+(long)(this.luongCoBan*1.2+200000));
			}
			if(this.chucVu.compareTo("TP")==0) {
				System.out.print(this.mnv+" "+this.hoTen+" "+this.luongCoBan+" "+
						(long)(0.2*this.luongCoBan)+" "+180000+" "+(long)(this.luongCoBan*1.2+180000));
			}
			if(this.chucVu.compareTo("NV")==0) {
				System.out.print(this.mnv+" "+this.hoTen+" "+this.luongCoBan+" "+
						(long)(0.2*this.luongCoBan)+" "+150000+" "+(long)(this.luongCoBan*1.2+150000));
			}
		}
		else if(this.ngayCong>=22) {
			if(this.chucVu.compareTo("GD") == 0) {
				System.out.print(this.mnv+" "+this.hoTen+" "+this.luongCoBan+" "+
						(long)(0.1*this.luongCoBan)+" "+250000+" "+(long)(this.luongCoBan*1.1+250000));
			}
			if(this.chucVu.compareTo("PGD")==0) {
				System.out.print(this.mnv+" "+this.hoTen+" "+this.luongCoBan+" "+
						(long)(0.1*this.luongCoBan)+" "+200000+" "+(long)(this.luongCoBan*1.1+200000));
			}
			if(this.chucVu.compareTo("TP")==0) {
				System.out.print(this.mnv+" "+this.hoTen+" "+this.luongCoBan+" "+
						(long)(0.1*this.luongCoBan)+" "+180000+" "+(long)(this.luongCoBan*1.1+180000));
			}
			if(this.chucVu.compareTo("NV")==0) {
				System.out.print(this.mnv+" "+this.hoTen+" "+this.luongCoBan+" "+
						(long)(0.1*this.luongCoBan)+" "+150000+" "+(long)(this.luongCoBan*1.1+150000));
			}
		}
		else {
			if(this.chucVu.compareTo("GD") == 0) {
				System.out.print(this.mnv+" "+this.hoTen+" "+this.luongCoBan+" "+
						(long)0*this.luongCoBan+" "+250000+" "+(long)(this.luongCoBan+250000));
			}
			if(this.chucVu.compareTo("PGD")==0) {
				System.out.print(this.mnv+" "+this.hoTen+" "+this.luongCoBan+" "+
						(long)0*this.luongCoBan+" "+200000+" "+(long)(this.luongCoBan+200000));
			}
			if(this.chucVu.compareTo("TP")==0) {
				System.out.print(this.mnv+" "+this.hoTen+" "+this.luongCoBan+" "+
						(long)0*this.luongCoBan+" "+180000+" "+(long)(this.luongCoBan*1+180000));
			}
			if(this.chucVu.compareTo("NV")==0) {
				System.out.print(this.mnv+" "+this.hoTen+" "+this.luongCoBan+" "+
						(long)0*this.luongCoBan+" "+150000+" "+(long)(this.luongCoBan*1+150000));
			}
		}
	}


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		baiToanTinhCong a = new baiToanTinhCong(sc.nextLine(),sc.nextLong(),sc.nextLong(),sc.next());
		a.res();
	}

}
