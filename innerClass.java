package TestSD;

class rocket { // inner classouter class
	int k;
		public void show() {
		System.out.println("confussion");
		}

	class launch { //inner class
			public void display() {
				System.out.println("success");	
		}
	}
}

public class innerClass {

	public static void main(String[] args) {
		rocket obj = new rocket();
		obj.show();
	    rocket.launch obj1 = obj.new launch();//using outer.inner  used for calling method
		obj1.display();
	}

}
