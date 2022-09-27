package ptit;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.StringTokenizer;

public class daoTu {

	public static String reverse(String s) {
		String res = "";
		for(int i = 0 ; i < s.length() ; i++) {
			res += s.charAt(s.length() - 1 - i);
		}
		return res;
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner  sc = new Scanner(System.in);
		int t = sc.nextInt();
		sc.nextLine();
		while(t-->0) {
			String s = sc.nextLine();
			StringTokenizer st = new StringTokenizer(s);
			ArrayList<String> a = new ArrayList<>();
			while(st.hasMoreTokens()) {
				a.add(st.nextToken());
			}
			for(int i = 0 ; i < a.size() ; i++) {
				System.out.print(reverse(a.get(i)) + " ");
			}
			System.out.println();
		}
	}

}
