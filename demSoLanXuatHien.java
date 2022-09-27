package ptit;

import java.util.Scanner;

public class demSoLanXuatHien {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long t = sc.nextLong();
		long x = t;
		while(t!=0) {
			t--;
			 int n = sc.nextInt();
			 
			 int[] a = new int[n];
			 
			 int[] cnt1 = new int[10001];
			 
			 for(int i = 0 ; i < n ; i++) {
				 a[i] = sc.nextInt();
				 cnt1[a[i]]++;
			 }
			 System.out.println("Test "+ (x - t) + ":");
			 for(int i = 0 ; i < n ; i++) {
				 if(cnt1[a[i]]!=0 ) {
					 System.out.println(a[i]+" xuat hien "+cnt1[a[i]]+" lan");
					 cnt1[a[i]] = 0;
				 }
			 }
		}
	}

}
