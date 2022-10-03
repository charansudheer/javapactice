package PackOne;
class A  {
	public void show() {
	System.out.println("HELLO");
}}
class B{
	public void show() {
		System.out.println("JARUGU");
}

public class multiThreding {

public void main(String[] args) {
	A obj= new A();
	B obj1= new B();
	obj.show();
	obj1.show();
}
		
	}

}
