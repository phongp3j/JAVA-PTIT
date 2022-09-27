package ptit;

import java.util.Scanner;

public class soLienKe {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0) {
			t--;
			long n = sc.nextLong();
			boolean check = true;
			long x1 = n%10;
			n/=10;
			while(n!=0) {
				long tmp = n%10;
				if(Math.abs(x1-tmp)!=1) {
					check = false;
					break;
				}
				x1=tmp;
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
