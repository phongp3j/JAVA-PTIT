package ptit;

import java.util.ArrayList;
import java.util.Scanner;

public class thuGonDaySo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int[] a = new int[n];
		for(int i = 0 ; i < n ; i++) {
			a[i] = sc.nextInt();
		}
		ArrayList<Integer> b = new ArrayList<>();
		b.add(a[0]);
		for(int i = 1 ; i < n ; i++) {
			if(b.size()!=0) {
				if((b.get(b.size()-1) + a[i] )%2==0) {
					b.remove(b.size()-1);
				}
				else {
					b.add(a[i]);
				}
			}
			else {
				b.add(a[i]);
			}
		}
		System.out.print(b.size());
	}

}
