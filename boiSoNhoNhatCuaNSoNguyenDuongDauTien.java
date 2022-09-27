package ptit;

import java.util.Scanner;

public class boiSoNhoNhatCuaNSoNguyenDuongDauTien {
    public static long gcd(long a , long b) {
    	if(a%b==0) {
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
			long n = sc.nextLong();
			long res = 1;
			for(long i = 2 ; i <= n ; i++) {
				res = res*i/gcd(res,i);
			}
			System.out.println(res);
		}
	}

}
