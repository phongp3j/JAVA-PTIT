package ptit;

import java.util.Scanner;

public class dienTichTamGiac {
	private double x,y;
	public dienTichTamGiac(double x , double y) {
		this.x = x;
		this.y = y;
	}
	
	public void dienTich(dienTichTamGiac p1,dienTichTamGiac p2) {
		double a = Math.sqrt((this.x - p1.x)*(this.x - p1.x)+(this.y - p1.y)*(this.y - p1.y));
		double b = Math.sqrt((this.x - p2.x)*(this.x - p2.x)+(this.y - p2.y)*(this.y - p2.y));
		double c = Math.sqrt((p2.x - p1.x)*(p2.x - p1.x)+(p2.y - p1.y)*(p2.y - p1.y));
		if(a+b>c && a+c>b && b+c>a) {
			double p = (a+b+c)/2;
			double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
			System.out.printf("%.2f\n", s);
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
			dienTichTamGiac a = new dienTichTamGiac(sc.nextDouble(),sc.nextDouble());
			dienTichTamGiac b = new dienTichTamGiac(sc.nextDouble(),sc.nextDouble());
			dienTichTamGiac c = new dienTichTamGiac(sc.nextDouble(),sc.nextDouble());
			a.dienTich(b, c);
		}
	}

}
