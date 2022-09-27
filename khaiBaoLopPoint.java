package ptit;

import java.util.Scanner;

/**
 * @author HI
 *
 */
public class khaiBaoLopPoint {
	
	private double x;
	private double y;
	
	public khaiBaoLopPoint() {
	}
	
	public khaiBaoLopPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}
	
	public double distance(khaiBaoLopPoint p2) {
		return Math.sqrt((this.x-p2.x)*(this.x-p2.x) + (this.y - p2.y)*(this.y - p2.y));
	}
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int t  = sc.nextInt();
		while(t-->0) {
			khaiBaoLopPoint a = new khaiBaoLopPoint(sc.nextDouble(),sc.nextDouble());
			khaiBaoLopPoint b = new khaiBaoLopPoint(sc.nextDouble(),sc.nextDouble());
			System.out.printf("%.4f\n",a.distance(b));
		}
	}
}


