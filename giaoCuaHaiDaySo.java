package ptit;

import java.util.Scanner;

public class giaoCuaHaiDaySo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		long t = 1;
		while(t!=0) {
			 int n = sc.nextInt();
			 int m = sc.nextInt();
			 int[] a = new int[n];
			 int[] b = new int[m];
			 int[] cnt1 = new int[1001];
			 int[] cnt2 = new int[1001];
			 for(int i = 0 ; i < n ; i++) {
				 a[i] = sc.nextInt();
				 cnt1[a[i]]++;
			 }
			 for(int i = 0 ; i < m ; i++) {
				 b[i] = sc.nextInt();
				 cnt2[b[i]]++;
			 }
			 for(int i = 0 ; i < 1001 ; i++) {
				 if(cnt1[i]!=0 && cnt2[i]!=0) {
					 System.out.print(i+" ");
				 }
			 }
			 t--;
		}
	}

}
