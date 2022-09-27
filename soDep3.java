package ptit;

import java.util.Scanner;

public class soDep3 {

	public static boolean check(String s) {
		for(int i = 0 ; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(s.length() -1 -i) || (s.charAt(i)!='2' && s.charAt(i)!='3' && s.charAt(i)!='5' && s.charAt(i)!='7')) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			String s = sc.next();
			if(check(s)) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
