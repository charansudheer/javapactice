package PackOne;

public class multipleEXp {
	public static void main(String[] args) {
	try{
		//int num[]=new int[5];
		int i=5;
		int j=0;
		int l=i/j;// airthemticexceptions in which value is not applicable "1/0" ->error
		// can be rectified by try and catch identifiers
		System.out.println("output is  "  +l);
	}
	catch(ArithmeticException e) {	System.out.println("incorrect");
	
}
	finally 
	{System.out.println("  output");//finally used print statement irrespective of condition
	}
	}

}



