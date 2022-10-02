package TestSD;
interface study{
	void read();
}
class video implements study{
	public void read() {
		System.out.print("first rank");
	}
}

public class kInterface {

	public static void main(String[] args) {
	study k = new video();
	k.read();

	}

}
