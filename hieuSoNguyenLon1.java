package ptit;

import java.math.BigInteger;
import java.util.Scanner;

public class hieuSoNguyenLon1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
            BigInteger a = sc.nextBigInteger();
            BigInteger b = sc.nextBigInteger();
            if (a.compareTo(b) < 0) {
                BigInteger c = a;
                a = b;
                b = c;
            }
            BigInteger ans = a.subtract(b);
            if (ans.toString().length() < a.toString().length())
                System.out.print(0);
            System.out.println(ans);
        }
	}

}