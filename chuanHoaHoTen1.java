package ptit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class chuanHoaHoTen1 {

	public static String check(String sb) {
		String res = "";
		for(int i = 0 ; i < sb.length() ; i++) {
			char tmp = sb.charAt(i);
			if(i == 0) {
				if(Character.isLowerCase(tmp)) {
					tmp -= 32;
				}
				res += tmp;
			}
			else {
				if(Character.isUpperCase(tmp)) {
					tmp += 32;
				}
				res += tmp;
			}
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s);
			ArrayList<String> a = new ArrayList<String>();
			while(st.hasMoreTokens()) {
				a.add(st.nextToken());
			}
			for(int i = 0 ; i < a.size() ; i++) {
				System.out.print(check(a.get(i)) + " ");
			}
			System.out.println();
		}
	}

}
