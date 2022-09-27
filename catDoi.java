package ptit;

import java.util.Scanner;

public class catDoi {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
	    while(t!=0) {
	    	t--;
	    	boolean check = true;
	    	long n = sc.nextLong();
	    	long res = 0,dem = 0;
	    	while(n!=0) {
	    		long x = n%10;
	    		dem++;
	    		n/=10;
	    		if(x==0 || x==9 || x==8) {
	    			continue;
	    		}
	    		else if(x==1) {
	    			res = (long) (Math.pow(10,dem-1) + res);
	    		}
	    		else {
	    			check = false;
	    			break;
	    		}
	    	}
	    	if(res == 0 || check == false) {
	    		System.out.println("INVALID");
	    	}
	    	else {
	    		System.out.println(res);
	    	}
	    }
	}

}
