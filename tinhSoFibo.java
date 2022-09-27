package ptit;

import java.util.Scanner;

public class tinhSoFibo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0) {
        	int n = sc.nextInt();
        	if(n==1 || n ==2) {
        		System.out.println(1);
        	}
        	else {
        		long f1 = 1,f2=1;
            	long fn = f1 + f2;
            	for(int i = 2 ; i < n ;i++) {
            		fn = f1  + f2;
            		f1 = f2;
            		f2 = fn;
            	}
            	System.out.println(fn);
        	}
        	t--;
        }
	}

}
