package TestSD;

interface abc {
	void show();
}

public class functionalinterface {

	public static void main(String[] args) {
        abc obj = () -> System.out.println("i am good");
       obj.show();
	}

}
