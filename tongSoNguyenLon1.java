package ptit;

import java.math.BigInteger;
import java.util.Scanner;

public class tongSoNguyenLon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			BigInteger a = sc.nextBigInteger();
			BigInteger b = sc.nextBigInteger();
			System.out.println(a.add(b));
		}
	}

}
