package ptit;

import java.math.BigInteger;
import java.util.Scanner;

public class chiaHetCho11 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while (t-- > 0) {
        	BigInteger a = sc.nextBigInteger();
        	BigInteger x = new BigInteger("11");
        	BigInteger k = a.divide(x);
        	if(k.multiply(x).compareTo(a) == 0) {
        		System.out.println(1);
        	}
        	else {
        		System.out.println(0);
        	}
        }
	}

}
