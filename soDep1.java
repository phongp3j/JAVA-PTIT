package ptit;

import java.util.Scanner;

public class soDep1 {

	public static boolean check(String s) {
		for(int i = 0 ; i < s.length(); i++) {
			if(s.charAt(i) != s.charAt(s.length() -1 -i) || (int)s.charAt(i)%2!=0) {
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
