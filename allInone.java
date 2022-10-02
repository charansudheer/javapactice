package TestSD;
//multiple interface and method override on interface
@FunctionalInterface //checking with annotaion wether it is or not
interface abc {//1st interface
	void show();//only declarion method

	default void toay() {//defineing method in interface is not possible 
		//but it can be by "default" keyword
		System.out.println("great thatday 15");
	}
}

interface allRight {//2st interface
	default void toay() {//another method def with same method name used
		//it is called ambiguity problem by using ''abc.super.toay()'' 
		System.out.println("great thatday");
	}
	}

	class day implements abc, allRight {// implemeted two interface at time
		public void show() {
			System.out.println("great day");
		}

		@Override
		public void toay() {//or else same method can be used one of the interfaces 
			// TODO Auto-generated method stub
			abc.super.toay();
		}
	}

	public class allInone {
	public static void main(String[] args) {
		abc obj = new day();
		obj.show();
		obj.toay();
		
	}
}

/*static method in interface @java 1.8
interface sun {//1st interface
	int K=5;
	void abc();
	static void today() {//method defined using static
		System.out.println("HI");
	}
	}
	class day implements sun {// implemeted two interface at time
		
		public void abc() {
		k=5;// we cant define variable
		
		}
}
public class allInone {
public static void main(String[] args) {
	sun obj=new day();
	sun.today();//object not required to create insted directly using class
	}}*/




