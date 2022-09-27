package ptit;

import java.util.Scanner;

public class sapXepChen {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int buoc = 1;
		System.out.println("Buoc 0: "+a[0]);
		for(int i = 1 ; i < n ; i++) {
			int pos = i - 1;
			int giatrichen = a[i];
			while(pos >= 0 && a[pos] > giatrichen) {
				a[pos+1] = a[pos];
				pos--;
			}
			a[pos+1] = giatrichen;
			System.out.print("Buoc "+buoc+": ");
			for(int k = 0 ; k <= i ; k++) {
				System.out.print(a[k]+" ");
			}
			System.out.print("\n");
			buoc++;
		}
	}

}
