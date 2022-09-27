package ptit;

import java.util.Scanner;

public class bienSoDep {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc  = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String s = sc.nextLine();
			boolean check = false;
			if(s.charAt(5) == s.charAt(6) && s.charAt(7) == s.charAt(6) && s.charAt(9) == s.charAt(10)) {
				check = true;
			}
			else if(s.charAt(5) == s.charAt(6) && s.charAt(7) == s.charAt(6) && s.charAt(9) == s.charAt(10) && s.charAt(6) == s.charAt(10)) {
				check = true;
			}
			else if((s.charAt(5) == '6' || s.charAt(5) == '8') && (s.charAt(6) == '6' || s.charAt(6) == '8') && (s.charAt(7) == '6' || s.charAt(7) == '8') && (s.charAt(9) == '6' || s.charAt(9) == '8') && (s.charAt(10) == '6' || s.charAt(10) == '8')) {
				check = true;
			}
			else if(s.charAt(5) < s.charAt(6) && s.charAt(6) < s.charAt(7) && s.charAt(7) < s.charAt(9) && s.charAt(9) < s.charAt(10)) {
				check = true;
			}
			if(check) {
				System.out.println("YES");
			}
			else {
				System.out.println("NO");
			}
		}
	}

}
