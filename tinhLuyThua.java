package ptit;

import java.util.Scanner;

public class tinhLuyThua {
	public static long mod = 1000000000+7;
	public static long luythua(long a, long b) {
		if(b==0) {
			return 1;
		}
		else {
			long x = luythua(a,b/2);
			if(b%2==0) {
				return ((x%mod)*(x%mod))%mod;
			}
			else {
				return ((a%mod)*(((x%mod)*(x%mod))%mod))%mod;
			}
		}
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        boolean check = true;
        while(check) {
        	long a = sc.nextLong(), b = sc.nextLong();
        	if(a==0 && b==0) {
        		check = false;
        	}
        	else {
        		System.out.println(luythua(a,b));
        	}
        }
	}

}
