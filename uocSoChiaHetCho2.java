package ptit;

import java.util.Scanner;

public class uocSoChiaHetCho2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t!=0) {
			t--;
			long a = sc.nextLong();
			if(a%2==1) {
				System.out.println(0);
			}
			else {
				long dem = 0;
				for(int i = 1; i<= Math.sqrt(a) ; i++) {
					if(a%i==0 && i%2 ==0 ) {
						dem++;
					}
					if(i*i != a && a%(a/i)==0 && (a/i)%2==0) {
						dem++;
					}
				}
				System.out.println(dem);
			}
		}
	}

}
