package ptit;

import java.util.Scanner;

public class dienThoaiCucGach {
	public static boolean check(String s) {
		for(int i = 0 ; i < s.length()/2; i++) {
			if(s.charAt(i) != s.charAt(s.length() -1 -i)) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String s = sc.nextLine();
			String res = "";
			for(int i = 0 ; i < s.length() ; i++) {
				if((s.charAt(i) >= 'a' && s.charAt(i) <= 'c') || (s.charAt(i) >= 'A' && s.charAt(i) <= 'C')) {
					res += '2';
				}
				if((s.charAt(i) >= 'd' && s.charAt(i) <= 'f') || (s.charAt(i) >= 'D' && s.charAt(i) <= 'F')) {
					res += '3';
				}
				if((s.charAt(i) >= 'g' && s.charAt(i) <= 'i') || (s.charAt(i) >= 'G' && s.charAt(i) <= 'I')) {
					res += '4';
				} 
				if((s.charAt(i) >= 'j' && s.charAt(i) <= 'l') || (s.charAt(i) >= 'J' && s.charAt(i) <= 'L')) {
					res += '5';
				}
				if((s.charAt(i) >= 'm' && s.charAt(i) <= 'o') || (s.charAt(i) >= 'M' && s.charAt(i) <= 'O')) {
					res += '6';
				}
				if((s.charAt(i) >= 'p' && s.charAt(i) <= 's') || (s.charAt(i) >= 'P' && s.charAt(i) <= 'S')) {
					res += '7';
				}
				if((s.charAt(i) >= 't' && s.charAt(i) <= 'v') || (s.charAt(i) >= 'T' && s.charAt(i) <= 'V')) {
					res += '8';
				}
				if((s.charAt(i) >= 'w' && s.charAt(i) <= 'z') || (s.charAt(i) >= 'W' && s.charAt(i) <= 'Z')) {
					res += '9';
				}
			}
			if(check(res)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
