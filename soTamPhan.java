package ptit;

import java.util.Scanner;

public class soTamPhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0) {
			t--;
			long n = sc.nextLong();
			boolean check = true;
			while(n!=0) {
				long tmp = n%10;
				if(tmp!=0 && tmp!=1 && tmp!=2 ) {
					check = false;
					break;
				}
				n/=10;
			}
			if(check) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
