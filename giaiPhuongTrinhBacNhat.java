package ptit;
import java.util.Scanner;

public class giaiPhuongTrinhBacNhat {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
        Scanner sc = new Scanner(System.in);
        double a = sc.nextDouble();
        double b = sc.nextDouble();
        if(a== 0 && b!=0) {
        	System.out.print("VN");
        }
        else if(a == 0 && b == 0) {
        	System.out.print("VSN");
        }
        else {
        	double res = (double)-b/a;
        	System.out.printf("%.2f",res);
        }
	}

}
