package ptit;

import java.util.Scanner;

public class chuViTamGiac {
	private double x,y;
	public chuViTamGiac(double x , double y) {
		this.x = x;
		this.y = y;
	}
	
	public void chuVi(chuViTamGiac p1 , chuViTamGiac p2) {
		double a = Math.sqrt((this.x - p1.x)*(this.x - p1.x)+(this.y - p1.y)*(this.y - p1.y));
		double b = Math.sqrt((this.x - p2.x)*(this.x - p2.x)+(this.y - p2.y)*(this.y - p2.y));
		double c = Math.sqrt((p2.x - p1.x)*(p2.x - p1.x)+(p2.y - p1.y)*(p2.y - p1.y));
		if(a+b>c && a+c>b && b+c>a) {
			System.out.printf("%.3f\n", a+b+c);
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
			chuViTamGiac a = new chuViTamGiac(sc.nextDouble(),sc.nextDouble());
			chuViTamGiac b = new chuViTamGiac(sc.nextDouble(),sc.nextDouble());
			chuViTamGiac c = new chuViTamGiac(sc.nextDouble(),sc.nextDouble());
			a.chuVi(b, c);
		}
	}

}
