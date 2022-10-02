package TestSD;

class a {
	public a() {
		System.out.println(" in a");
	}

	public a(int i) {
		System.out.println(" int a in");
	}
}

class b extends a {/*not mentioning of super than it gives defult class of 
	a and value of b is printed by giving value at concentrator*/
	public b() {
		super(5);//by assaing value it "in a int " and default of class b "in a" is printed
		System.out.println(" in b");
	}

	public b(int i) {
		super(i);// at concentrator value is given
		System.out.println(" int b in");
	}
}

public class suprmrth {

	public static void main(String[] args) {
		b obj = new b(5 );//

	}

}
