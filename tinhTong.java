package ptit;

import java.util.Scanner;

public class tinhTong {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t!=0) {
        	long n = sc.nextLong();
        	long res = n*(n+1)/2;
        	System.out.println(res);
        	t--;
        }
	}

}
