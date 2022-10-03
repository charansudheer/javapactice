package PackOne;
import java.util.Scanner;
class scaning {
public static void main(String[] args) {
	System.out.println("enter number");
	Scanner k= new Scanner(System.in);//object for scanner class created ''system.in'' is passed constructor of object
	float j=k.nextFloat();//used to directly read premitive value from user, float,int,double etc
	System.out.println(j);
	k.close();

}

}
