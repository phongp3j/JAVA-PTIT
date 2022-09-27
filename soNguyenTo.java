package ptit;

import java.util.Scanner;
import java.math.*;
public class soNguyenTo {

	public static boolean ngto(long n) {
		if(n<2) {
			return false;
		}
		else {
			for(int i = 2 ; i <= Math.sqrt(n) ; i++) {
				if(n%i == 0) {
					return false;
				}
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0) {
			long n = sc.nextLong();
			if(ngto(n)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
			t--;
		}
	}

}
