package ptit;

import java.util.ArrayList;
import java.util.Scanner;

public class boSungDaySo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		ArrayList<Integer> b = new ArrayList<>();
		int[] dem = new int[201];
		for(int i = 1 ; i < 201 ; i++) {
			dem[i] = 0;
		}
		int maxvalue = 0;
		for(int i = 0 ; i < n ; i++) {
			int x = sc.nextInt();
			b.add(x);
			dem[x] = 1;
			if(x > maxvalue && dem[x] != 0) {
				maxvalue = x;
			}
		}
		int check = 0;
		for(int i = 1 ; i < 201 ; i++) {
			if(dem[i] == 0 && i < maxvalue) {
				System.out.println(i);
				check = 1;
			}
		}
		if(check == 0) {
			System.out.print("Excellent!");
		}
	}

}
