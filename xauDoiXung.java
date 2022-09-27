package ptit;

import java.util.Scanner;

public class xauDoiXung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String a = sc.nextLine();
			int  x  = 1;
			int check = 0 ;
			for(int i = 0 ; i < (int)a.length()/2; i++) {
				if(a.charAt(i) != a.charAt(a.length() - 1 - i)) {
					x--;
				}
			}
			if(x < 0) {
				check = 1;
			}
			if(x == 1 && a.length()%2 == 0) {
				check = 1;
			}
			if(check ==0 ) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
