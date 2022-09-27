package ptit;

import java.util.Scanner;

public class xauKhacNhauDaiNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String a = sc.nextLine();
			String b = sc.nextLine();
			if(a.equals(b) == true) {
				System.out.println(-1);
			}
			else {
				System.out.println(Math.max(a.length(), b.length()));
			}
		}
	}

}
