package TestSD;

class calc {// class declaration
	int num1;
	int num2;
	int result; // verables declaration

	public void perfom() {
		result = num1 + num2; // method
	}
}

public class objectDemo { // main function
	public static void main(String[] args) {
		calc obj = new calc();// object genaration and allocateing memory to object
		obj.num1 = 5;               // declareing vareble vlues by call
		obj.num2 = 8;//declareing vareble vlues by call
		obj.perfom();//calling method
		System.out.println(obj.result);
	}

}
