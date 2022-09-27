package ptit;

import java.util.Scanner;

public class danhDauChuCai {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int[] a = new int[256];
		for(int i = 0 ; i < 256 ; i++) {
			a[i] = 0;
		}
		String s = sc.next();
		int res= 0;
		for(int i = 0 ; i < s.length() ; i++) {
			a[s.charAt(i)] += 1;
		}
		for(int i = 0 ; i < 256 ; i++) {
			if(a[i]!=0) {
				res++;
				a[i] = 0;
			}
		}
		System.out.print(res);
	}

}
