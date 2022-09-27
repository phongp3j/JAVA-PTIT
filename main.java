package soPhuc;

import java.util.Scanner;

public class main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int t = sc.nextInt();
		while(t-->0) {
			soPhuc a = new soPhuc(sc.nextLong(),sc.nextLong());
			soPhuc b = new soPhuc(sc.nextLong(),sc.nextLong());
			a.res(b);
		}
	}

}

class soPhuc {
	private long thuc,ao;
	
	public soPhuc() {}
	public soPhuc(long thuc,long ao) {
		this.thuc = thuc;
		this.ao = ao;
	}

	public long getThuc() {
		return thuc;
	}

	public void setThuc(long thuc) {
		this.thuc = thuc;
	}

	public long getAo() {
		return ao;
	}

	public void setAo(long ao) {
		this.ao = ao;
	}
	
	public void res(soPhuc b) {
		soPhuc c = new soPhuc();
		c.thuc = (this.thuc + b.thuc)*this.thuc - (this.ao + b.ao)*this.ao;
		c.ao = (this.thuc+b.thuc)*this.ao + (this.ao + b.ao)*this.thuc;
		soPhuc d = new soPhuc();
		d.thuc = (this.thuc + b.thuc)*(this.thuc + b.thuc) - (this.ao + b.ao)*(this.ao+b.ao);
		d.ao = 2*(this.thuc + b.thuc)*(this.ao + b.ao);
		System.out.println(c.thuc+" + "+c.ao+"i, " + d.thuc+" + "+d.ao+"i");
	}
}
