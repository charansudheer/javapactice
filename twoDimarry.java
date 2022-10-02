package TestSD;

public class twoDimarry {
	public static void main(String[] args) {
	/*	studant s1= new studant(44);
		studant s2 = new studant(32);
		studant s3 = new studant(56);
		studant s4 = new studant(69);
		studant s[] = {s1,s2,s3,s4}; //need to create object
	
		int a[]= {44,55,55,66};
		int b[]= {4,5,55,68};
		int c[]= {99,98,36,55};*/
		/* int d[][] = {  //two dimentional array
				{44,55,55,66},
				{44,55,55,66},
				{99,98,36,55}
		};*/
		int d[][] = {  //jagged dimentional array
				{44,55,55,66},
				{44,55},
				{99,98,36,55}
		};
		for(int i=0;i<d.length;i++) { // it defines rows length
			for(int j=0;j<d[i].length;j++) { // it defines no of columns retun by i
				System.out.print(" " + d[i][j]);
			}
			System.out.println(" ");
		}
		for(int k[]:d) { // enhanced for loop for essy to write a code
			for(int m:k) {
				System.out.print(" "+m);
			}
			System.out.println(" ");
		}
		
		}
}
