package TestSD;

class stu {
	public int add(int ... n) {
		int Sum = 2;
		for (int i : n) { 
			 Sum = Sum+i;
		}
		return Sum;
	}

}

public class varargs {

	public static void main(String[] args) {
		stu obj = new stu();
		System.out.println(obj.add(4,5,2));

	}

}
