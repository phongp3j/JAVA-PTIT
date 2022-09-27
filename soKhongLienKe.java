package ptit;

import java.util.Scanner;

public class soKhongLienKe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0) {
		    long n = sc.nextLong();
		    long tong = 0;
		    long x1 = n%10;
		    n/=10;
		    tong += x1;
		    boolean check = true;
		    while(n!=0) {
		    	long x2 = n%10;
		    	if(Math.abs(x2-x1)!=2) {
		    		check = false;
		    		break;
		    	}
		    	tong+=x2;
		    	n/=10;
		    	x1=x2;
		    }
		    if(check && tong%10==0) {
		    	System.out.println("YES");
		    }
		    else {
		    	System.out.println("NO");
		    }
		    t--;
		}
	}

}
