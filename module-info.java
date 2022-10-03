module onlineClass 
interface abc{
	void show();
	}
class day implements abc{
	public void show() {
		System.out.println("great day");
	}
	

	public static void main(String[] args) {
	abc obj=new day();
	obj.show();

	}

}
