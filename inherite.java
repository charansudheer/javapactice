package TestSD;// program used print
class calculator{
	public int add(int u, int t) {// sub
		return u+t;
		}
}
class advcalc extends calculator {//super
	public int sub(int u, int t) {
		return u-t;
		}
	
}
class supadvcalc extends advcalc {
	public int mul(int u, int t) {
		return u*t;
		}
	
}
public class inherite {

	public static void main(String[] args) {
		supadvcalc c3=new supadvcalc();
		int result =c3.add(22,55);
		int result2 =c3.sub(44,55);
		int result3 =c3.mul(6,55);
		System.out.println(result);
		System.out.println(result2);
		System.out.println(result3);
	

	}

}
