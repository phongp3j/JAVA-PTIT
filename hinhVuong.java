package ptit;

import java.util.Scanner;

public class hinhVuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int a1 = sc.nextInt();
		int b1 = sc.nextInt();
		int a2 = sc.nextInt();
		int b2 = sc.nextInt();
		int a3 = sc.nextInt();
		int b3 = sc.nextInt();
		int a4 = sc.nextInt();
		int b4 = sc.nextInt();
		int x1 = Math.min(a1, a3);
		int x2 = Math.min(b1, b3);
		int y1 = Math.max(a2, a4);
		int y2 = Math.max(b2, b4);
		int x = Math.max(y1-x1, y2-x2);
		System.out.println(x*x);
	}

}
