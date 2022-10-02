package TestSD;
class student{
	private int rollno;
	private String name;
	/* int rollno;
	String name;
	public void setvalue(int r) {
		rollno=r;
	}
	public int getvalue() {
		return rollno;
	}   */
	public int getRollno() {
		return rollno;
	}
	public void setRollno(int rollno) {
		this.rollno = rollno;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
}
public class encapulation {

	public static void main(String[] args) {
		student s1= new student();
		s1.setRollno(2);
		s1.setName("sudheer");
		System.out.println(s1.getRollno());
		System.out.println(s1.getName());
		
		/* student s1= new student();
           s1.setvalue(2);//directly assaining value to the method insted using s1.rollno=2;
           s1.name="sudheer";
           System.out.println(s1.getvalue());//printing value using direct method  */
	}
}