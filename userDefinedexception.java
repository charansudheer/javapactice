package PackOne;

public class userDefinedexception {

	public static void main(String[] args) {
		int i,j;
		i=8;
		j=9;
		try {
			int k=i/j;
			if(k==0)// 
			throw new tesusuException("     ::this is not possible");
			System.out.println(k);
		}
		catch(tesusuException e)
		{
			System.out.println("error" + e.getMessage());
		}

	}

}
