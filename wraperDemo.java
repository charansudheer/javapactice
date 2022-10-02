package TestSD;

/*public class wraperDemo {
	public static void main(String[] args) {
	

	}
}*/
interface  writer { // by allowing multiple inheritence
	 void  show();// cannot define object for abstact method and interface  
}
class  work implements writer {//we can create multiple inheritance by using commend is call implementation
	public void  show() {
		System.out.print("my personal");
	}
}
class Pen extends work implements writer{
	public  void  show(){
		System.out.print("my show");//extention of writer class 
	}
}
class fit{
	public void meToo(writer p) {
		p.show();// directly call by decalreing local varible "writer p"
	}
}
public class wraperDemo {
	public static void main(String[] args) {
	writer P = new work();
    writer l =new Pen();// writer is the reference for inheritance classes
    fit h=new fit();
    h.meToo(l);// calling method by passing object refernce variables which.... 
    //assining local variable to corresponding refernce variables to be 
    
	}
}