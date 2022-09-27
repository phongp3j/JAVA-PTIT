package ptit;

import java.util.Scanner;

public class soChinhPhuong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long n = sc.nextLong();
			if(n == (int)Math.sqrt(n) * (int)Math.sqrt(n)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
