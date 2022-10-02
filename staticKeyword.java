package TestSD;

class emp {
	int eid;
	int salary;
	static String ceo;  //static key word 

	public void show() {
		System.out.println(eid + ":" + salary + ":" + ceo);
	}
}

public class staticKeyword {

	public static void main(String[] args) {
		emp navin = new emp();
		navin.eid = 55;
		navin.salary = 44000;
		emp.ceo = "ra55";
	emp radik = new emp();
		radik.eid = 55;
		radik.salary = 78000;
		emp.ceo = "rjj55";

		navin.show();
		radik.show();
	
	}

}
