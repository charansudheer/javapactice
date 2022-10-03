package PackOne;/*classes under is junethree, possible, modifiers*/

public class juneThree {
int roll= 55;//we can access inside common package  but it act self like pravite by outsidepackages
public int marks=69;////we can access anywere
private String name="sudheer";//we can not access inside common package and other package but it accsess only inside class
protected int rank=55;//we can access inside common package
public void show() {
	System.out.println(rank);
	System.out.println(name);
	System.out.println(marks);
	System.out.println(roll);
}
	}

