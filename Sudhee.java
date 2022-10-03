package TestSD;

public class Sudhee {
/*this code is for star printing */
	public static void main(String[] args) 
	{
		int r = 10,t=3;
		for (int i = 0; i < r; i++) {
			for (int j = r - i; j >= 1; j--) {
				System.out.print(" ");
			}
			for (int j = 0; j <= i; j++) {
				System.out.print("t");
			}
			System.out.println();
		}

		// TODO Auto-generated method stub

	}

}
