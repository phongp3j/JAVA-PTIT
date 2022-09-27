package ptit;

import java.util.Scanner;

public class khaiBaoLopHinhChuNhat {

	private double width;
	private double height;
	private String color;
	public khaiBaoLopHinhChuNhat() {
		this.width = 1;
		this.height = 1;
	}
	
	public khaiBaoLopHinhChuNhat(double x , double y , String z) {
		this.width = x;
		this.height = y;
		this.color = z;
	}
	
	
	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getHeight() {
		return height;
	}

	public void setHeight(double height) {
		this.height = height;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}
	
	public double  findArea() {
		return this.height * this.width;
	}
	
	public double findPerimeter() {
		return (this.width + this.height)*2;
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		khaiBaoLopHinhChuNhat a = new khaiBaoLopHinhChuNhat();
		double x = sc.nextDouble();
		a.setWidth(x);
		x = sc.nextDouble();
		a.setHeight(x);
		String s = sc.next();
		s = s.toLowerCase();
		s = String.valueOf(s.charAt(0)).toUpperCase() + s.substring(1);;
		a.setColor(s);
		if(a.getHeight() > 0 && a.getWidth() > 0 ) {
			System.out.printf("%.0f %.0f %s", a.findPerimeter(), a.findArea(), a.getColor());
		}
		else {
			System.out.print("INVALID");
		}
	}

}
