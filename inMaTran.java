package ptit;

import java.util.Scanner;

public class inMaTran {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			int n = sc.nextInt();
			int[] a = new int[n*n];
			for(int i = 0 ; i < n*n ; i++) {
				a[i] = sc.nextInt();
			}
			for(int i = 0 ; i < n; i++) {
				if(i%2==0) {
					for(int j = i*n ; j < n*(1+i) ; j++) {
						System.out.print(a[j] + " ");
					}
				}
				else {
					for(int j = n*(i+1)- 1 ; j>= n*(i) ; j--) {
						System.out.print(a[j] + " ");
					}
				}
			}
			System.out.println();
		}
	}

}
