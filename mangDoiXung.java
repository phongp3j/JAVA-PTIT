package ptit;

import java.util.Scanner;

public class mangDoiXung {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0) {
			t--;
			int n = sc.nextInt();
			int[] a = new int[n];
			for(int i = 0 ; i < n ; i++) {
				a[i] = sc.nextInt();
			}
			boolean check = true;
			for(int i = 0 ; i < n/2; i++) {
				if(a[i]!=a[n-i-1]) {
					check = false;
					break;
				}
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
