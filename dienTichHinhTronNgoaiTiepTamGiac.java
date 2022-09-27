package ptit;

import java.util.Scanner;

public class dienTichHinhTronNgoaiTiepTamGiac {
	private double x,y;
	public dienTichHinhTronNgoaiTiepTamGiac(double x , double y) {
		this.x = x;
		this.y = y;
	}
	
	public void dienTich(dienTichHinhTronNgoaiTiepTamGiac p1,dienTichHinhTronNgoaiTiepTamGiac p2) {
		double a = Math.sqrt((this.x - p1.x)*(this.x - p1.x)+(this.y - p1.y)*(this.y - p1.y));
		double b = Math.sqrt((this.x - p2.x)*(this.x - p2.x)+(this.y - p2.y)*(this.y - p2.y));
		double c = Math.sqrt((p2.x - p1.x)*(p2.x - p1.x)+(p2.y - p1.y)*(p2.y - p1.y));
		if(a+b>c && a+c>b && b+c>a) {
			double p = (a+b+c)/2;
			double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			double s1 = Math.PI * (a*b*c/(4*s))*(a*b*c/(4*s));
			System.out.printf("%.3f\n", s1);
		}
		else {
			System.out.println("INVALID");
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			dienTichHinhTronNgoaiTiepTamGiac a = new dienTichHinhTronNgoaiTiepTamGiac(sc.nextDouble(),sc.nextDouble());
			dienTichHinhTronNgoaiTiepTamGiac b = new dienTichHinhTronNgoaiTiepTamGiac(sc.nextDouble(),sc.nextDouble());
			dienTichHinhTronNgoaiTiepTamGiac c = new dienTichHinhTronNgoaiTiepTamGiac(sc.nextDouble(),sc.nextDouble());
			a.dienTich(b, c);
		}
	}

}
