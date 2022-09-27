package ptit;

import java.util.Scanner;

public class chuSo4ChuSo7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long n = sc.nextLong();
		long dem = 0;
		while(n!=0) {
			if(n%10== 4 || n%10==7) {
				dem++;
			}
			n/=10;
		}
		if(dem==4 || dem == 7) {
			System.out.print("YES");
		}
		else {
			System.out.print("NO");
		}
	}

}
