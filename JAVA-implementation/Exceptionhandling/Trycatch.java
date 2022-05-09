
public class Trycatch {

	public static void main(String[] args) {
		System.out.println("program starts");
		int[] newArray= new int[] {1,2,3,4,5,6};
		try {
		System.out.println(newArray[10]);
	}catch(Exception e) {                       //(Exception e ) general class of exception which is used for
	System.out.println("Exception occured");	//every kind of exception
	}finally {     //this finally  block executes even their is a exxception or not 
		System.out.println("default execution");
	}
		
		String name =null;// no object
		System.out.println(name.length());//it shows an error because null has nothing to give the length
		//
	}

}
