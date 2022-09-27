package ptit;

import java.util.Scanner;

public class maTranNhiPhan {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int res = 0;
		for(int i = 0 ; i < n ; i++) {
			int dem1 = 0;
			for(int j = 0 ; j < 3 ; j++) {
				int x = sc.nextInt();
				if(x == 1) {
					dem1++;
				}
			}
			if(dem1 >= 2 ) {
				res++;
			}
			dem1 = 0;
		}
		System.out.print(res);
	}

}
