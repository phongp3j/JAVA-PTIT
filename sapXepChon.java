package ptit;

import java.util.Scanner;

public class sapXepChon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		int buoc = 0;
		for(int i = 0 ; i < n -1 ; i++) {
			int minindex = i;
			for(int j = i+1; j < n ; j++) {
				if(a[j] < a[minindex]) {
					minindex = j;
				}
			}
			int tmp = a[i];
			a[i] = a[minindex];
			a[minindex] = tmp;
			{
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
