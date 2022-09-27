package ptit;

import java.util.Scanner;

public class hinhChuNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        long a = sc.nextLong();
        long b = sc.nextLong();
        if(a <= 0 || b <= 0) {
        	System.out.print(0);
        }
        else {
        	System.out.print((a+b)*2);
            System.out.print(" ");
            System.out.print(a*b);
        }
	}

}
