package ptit;

import java.util.Scanner;

public class chiaTamGiac {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long n = sc.nextLong(), h = sc.nextLong();
			for(int i = 1 ; i < n ; i++) {
				System.out.printf("%.6f",h*Math.sqrt((double)i/n));
				System.out.print(" ");
			}
			System.out.println();
		}
	}

}
