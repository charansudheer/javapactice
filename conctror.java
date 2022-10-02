package TestSD;
class chlk {
	private int num1;
	 int num2;

	public chlk() {
		num1=6;
		num2=5;
		}
	public chlk(int n) {
		num1=n;
		num2=n;
	}
	public chlk(double d) {
	num1= (int)d;
	}
}

public class conctror  {
	public static void main(String[] args) {
		chlk obj = new chlk(100.9);
	
		System.out.println(obj.num1);
	}

}