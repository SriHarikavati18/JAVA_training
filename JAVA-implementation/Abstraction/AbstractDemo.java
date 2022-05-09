//u cannot create objects of abstract class
//abstract class and  abstract method
public class AbstractDemo {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		//Maheshphone obj = new Maheshphone();
		 //obj.call();
		suresh obj = new suresh();
		obj.call();
		obj.camera();
		obj.screenshot();
		obj.autoupdate();
		obj.calculation();

	}
}
abstract class Maheshphone{     //abstract class
	public void call() 
	{
     System.out.println("calling");
	}
	public abstract void camera();
	public abstract void screenshot(); 
	/*here Mahesh want this move,dance and cook features but he is not
	 able to perform those tasks so he is declaring it for some others to do this work
	 when we are declaring the methods that methods will became abstract 
	 */
	public abstract void autoupdate(); 
	//and this astract methods cannot instantiate the abstract class
}  


//where ever u extends u have to define all the methods
abstract class Ramesh extends Maheshphone{      //abstract class
	public void camera() {
		System.out.println("taking photos");//method of camera
	}
	public void screenshot() {
		System.out.println("taking screenshot");//method of screenshot
	}
	public void autoupdate() {
		System.out.println("automatically updating itself");//method of autoupdate
	}
	//now it has the 4 features including calling which is extends from Maheshphone
	//now mahesh dont know the how to perform calculation operation on phone 
	public abstract void calcualtion();
}


//now it has to define calculation method
 class suresh extends Ramesh{
	 public void calculation() {
			System.out.println("calculating the numbers");//method of calculation
		}

	@Override
	public void calcualtion() {
		// TODO Auto-generated method stub
		
	}
 }
