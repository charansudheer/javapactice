package PackOne;/*throw exception method*//*try catch method*//*try with resource method*/
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class checkedException {
	/***********************throw exception method**********************************/
	
	/* public static void main(String[] args) throws Exception {//if throws exception removed it shows an error at readline
		System.out.println("enter value");
		BufferedReader sd=new BufferedReader(new InputStreamReader(System.in));
		int u= Integer.parseInt(sd.readLine());//assing premative data types converting string into value
		System.out.println(u); //for throws exception checking removing it occurs an error
	 
	 /*****************************try catch method*******************************/
/*	public static void main(String[] args)throws Exception{//if throws exception removed it shows an error at readline
	
	BufferedReader sd =null;// declaring object 
	int u=0;
    try {
	sd=new BufferedReader(new InputStreamReader(System.in));//createing an object for constructor& reading input from user
	u= Integer.parseInt(sd.readLine()); }//
    catch(Exception e){
 		   
    }
    finally {
    	sd.close();//to close the source file & also interlikwith exception of throws
    }
    System.out.println(u);
	}}
     /*****************************try with source code method*******************************/
    public static void main(String[] args) throws Exception {//if throws exception removed it shows an error at readline
    	System.out.println("enter value");
	try(BufferedReader sd=new BufferedReader(new InputStreamReader(System.in))){//directly closeing source io file withaout define ing final value
		int u= Integer.parseInt(sd.readLine());//assing premative data types converting string into value
	System.out.println(u); }}}
 









