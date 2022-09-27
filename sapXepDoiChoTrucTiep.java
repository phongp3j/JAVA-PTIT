package ptit;

import java.util.Scanner;

public class sapXepDoiChoTrucTiep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int dem = 0;
		for(int i = 0 ; i < n ; i++) {
			int check = 0;
			for(int j = i + 1 ; j < n ; j++) {
				if(a[j] < a[i]) {
					check++;
					int x = a[j];
					a[j] = a[i];
					a[i] = x;
				}
			}
			if(check!=0) {
				dem++;
				System.out.print("Buoc "+ dem +": ");
				for(int p = 0 ; p < n ; p++) {
					System.out.print(a[p]+" ");
				}
				System.out.println();
			}
		}
	}

}
