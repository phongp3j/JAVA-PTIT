package ptit;

import java.util.Scanner;

public class tongUocSo1 {

	public static long tonguoc(int n) {
		long res = 0;
		while(n%2==0) {
			res += 2;
			n/=2;
		}
		for(int i = 3 ; i <= Math.sqrt(n) ; i+=2) {
			while(n%i==0) {
				res += i;
				n/=i;
			}
		}
		if(n>1) {
			res += n;
		}
		return res;
	}
	public static long res = 0;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			res += tonguoc(n);
		}
		System.out.print(res);
	}

}
