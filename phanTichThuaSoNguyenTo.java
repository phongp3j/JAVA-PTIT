package ptit;

import java.util.Scanner;

public class phanTichThuaSoNguyenTo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		int tmp = t;
		while(t!=0) {
			t--;
			long n = sc.nextLong();
			System.out.print("Test "+ (tmp - t)+": ");
			for(int i = 2 ; i <= Math.sqrt(n);i++) {
				int dem = 0;
				while(n%i == 0) {
					dem++;
					n/=i;
				}
				if(dem!=0) {
					System.out.print(i+"("+(dem) +") ");
				}
				dem = 0;
			}
			if(n>1) {
				System.out.print(n+"("+(1) +") ");
			}
			System.out.print("\n");
		}
	}

}
