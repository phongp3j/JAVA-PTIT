package ptit;

import java.util.Scanner;

public class diemCanBang {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] a = new int[n];
			long sum  = 0;
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
				sum += a[i];
			}
			int kq = -1;
			int res = 0;
			for(int i = 0 ; i < n  ; i++) {
				if(res*2 + a[i] == sum) {
					kq = i+1;
					break;
				}
				res+=a[i];
			}
			System.out.println(kq);
		}
	}

}
