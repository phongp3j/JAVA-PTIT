package ptit;

import java.util.Scanner;

public class kiemTraSoFibo {

	public static boolean check(long n) {
		if(n == 0 || n==1) {
			return true;
		}
		else {
			long f1 = 0 , f2 = 1;
			long fn = 0;
			for(int i = 2 ; i <= 92 ; i++) {
                fn = f1 + f2;
                f1 = f2;
                f2 = fn;
                if(fn == n) {
                	return true;
                }
			}
		}
		return false;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			long n = sc.nextLong();
			if(check(n)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
