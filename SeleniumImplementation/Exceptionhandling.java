package Package1;

public class Exceptionhandling {

	public static void main(String[] args) {
		try{
			Demo();
			}catch(Exception e){
				e.printStackTrace();
			}
	}
	//throws is used to the throws the complete exception to other main method
	//throw is used to throw one particular exceptioin like (arthematic,IOexception etc.)
	
	//when we are not able to find particulAR ELEMENT bby using the exception we can move to next element
		
		
		public static void Demo()throws Exception{// when ever we add the throws exception it throws the exception to main method
		System.out.println("hello world ");
		try{int i=1/0;
		}catch(Exception e) {
			System.out.println("inside the catch block ");
			
			System.out.println("cause is: "+e.getCause());//give you the cause of exception
			e.printStackTrace();//it will give u which line exception occurs
			
		}
		//only having the try and finally blocks by skipping the catch is also ok 
		finally{
		System.out.println("completed ");//which execute whether it has the exception or not 
		}
		
	}

}
