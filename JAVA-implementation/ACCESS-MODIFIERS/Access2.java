package package1;

public class Access2  {

	public static void main(String[] args) {
		//if i want to get the  attributes of same package i donnt need to mention public 
		Access1 a= new Access1();// now u can access the attributes of other class
		System.out.println(a.hours);//getting this from others class attributes
		System.out.println(a.minutes);
		System.out.println(a.gethours());
	}

}
