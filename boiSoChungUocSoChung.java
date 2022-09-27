package ptit;

import java.util.Scanner;

public class boiSoChungUocSoChung {

	public static long gcd(long a, long b) {
		if(a%b == 0) {
			return b;
		}
		else {
			return gcd(b,a%b);
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0) {
			t--;
			long a = sc.nextLong(), b = sc.nextLong();
			System.out.println(a*b/gcd(a,b) + " " + gcd(a,b));
		}
	}

}
