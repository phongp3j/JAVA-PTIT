package ptit;

import java.util.Scanner;

public class baiToanTuyenSinh {
	private String ma;
	private String hoTen;
	private double diem1;
	private double diem2;
	private double diem3;
	
	public baiToanTuyenSinh(String ma, String hoTen, double diem1, double diem2, double diem3) {
		this.ma = ma;
		this.hoTen = hoTen;
		this.diem1 = diem1;
		this.diem2 = diem2;
		this.diem3 = diem3;
	}
	public void res()
	{
		System.out.print(this.ma+" "+this.hoTen+" ");
		if(this.ma.charAt(2)=='1')
		{
			if(this.diem1*2+this.diem2+this.diem3+0.5>=24)
			{
				if((this.diem1*2+this.diem2+this.diem3)==(int)(this.diem1*2+this.diem2+this.diem3))
				{
					System.out.println("0.5 "+(int)(this.diem1*2+this.diem2+this.diem3)+" TRUNG TUYEN");
				}
				else
				{
					System.out.println("0.5 "+(this.diem1*2+this.diem2+this.diem3)+" TRUNG TUYEN");
				}
			}
			else
			{
				if((this.diem1*2+this.diem2+this.diem3)==(int)(this.diem1*2+this.diem2+this.diem3))
				{
					System.out.println("0.5 "+(int)(this.diem1*2+this.diem2+this.diem3)+" TRUOT");
				}
				else
				{
					System.out.println("0.5 "+(this.diem1*2+this.diem2+this.diem3)+" TRUOT");
				}
			}
		}
		else if(this.ma.charAt(2)=='2')
		{
			if(this.diem1*2+this.diem2+this.diem3+1>=24)
			{
				if((this.diem1*2+this.diem2+this.diem3+1)==(int)(this.diem1*2+this.diem2+this.diem3+1))
				{
					System.out.println("1 "+(int)(this.diem1*2+this.diem2+this.diem3)+" TRUNG TUYEN");
				}
				else
				{
					System.out.println("1 "+(this.diem1*2+this.diem2+this.diem3)+" TRUNG TUYEN");
				}
			}
			else
			{
				if((this.diem1*2+this.diem2+this.diem3+1)==(int)(this.diem1*2+this.diem2+this.diem3+1))
				{
					System.out.println("1 "+(int)(this.diem1*2+this.diem2+this.diem3)+" TRUOT");
				}
				else
				{
					System.out.println("1 "+(this.diem1*2+this.diem2+this.diem3)+" TRUOT");
				}
			}
		}
		else
		{
			if(this.diem1*2+this.diem2+this.diem3+1.5>=24)
			{
				if((this.diem1*2+this.diem2+this.diem3)==(int)(this.diem1*2+this.diem2+this.diem3))
				{
					System.out.println("1.5 "+(int)(this.diem1*2+this.diem2+this.diem3)+" TRUNG TUYEN");
				}
				else
				{
					System.out.println("1.5 "+(this.diem1*2+this.diem2+this.diem3)+" TRUNG TUYEN");
				}
			}
			else
			{
				if((this.diem1*2+this.diem2+this.diem3)==(int)(this.diem1*2+this.diem2+this.diem3))
				{
					System.out.println("1.5 "+(int)(this.diem1*2+this.diem2+this.diem3)+" TRUOT");
				}
				else
				{
					System.out.println("1.5 "+(this.diem1*2+this.diem2+this.diem3)+" TRUOT");
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		String name=sc.nextLine();
		String ngaySinh=sc.nextLine();
		double diem1=sc.nextDouble(),diem2=sc.nextDouble(),diem3=sc.nextDouble();
		baiToanTuyenSinh x=new baiToanTuyenSinh(name,ngaySinh,diem1,diem2,diem3);
		x.res();
	}
}