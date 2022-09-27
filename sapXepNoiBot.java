package ptit;

import java.util.Scanner;

public class sapXepNoiBot {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int buoc = 0;
		for(int i = 0 ; i < n ; i++) {
			int check = 0;
			for(int j = 0 ; j < n - i - 1 ; j++){
				if(a[j] > a[j+1]) {
					check+=1;
					int tmp = a[j];
					a[j] = a[j+1];
					a[j+1]= tmp;
				}
			}
			if(check!=0){
				buoc++;
				System.out.print("Buoc "+buoc+": ");
				for(int k = 0 ; k < n ; k++) {
					System.out.print(a[k]+" ");
				}
				System.out.print("\n");
			}
		}
	}

}
