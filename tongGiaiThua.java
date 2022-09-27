package ptit;

import java.util.Scanner;

public class tongGiaiThua {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long res = 0;
		for(int i = 1 ; i <= n ; i++) {
			long tmp = 1;
			for(int j = 1 ; j <= i ; j++) {
				tmp*=j;
			}
			res += tmp;
		}
		System.out.print(res);
	}

}
