//to create a calculator
 class Calculator
 {                                //super class,Parent
	public int add(int a,int b)
	{
		return a+b;
	}
 }

 class CalcAdv extends Calculator 
 {                                    //subclass,child
		public int sub(int a,int b)  //singlelevel inheritance 
		{
			return a-b;
		}
		
	}
 class CalcveryAdv extends CalcAdv
 {
	 public int mul(int a, int b) // subclass,child
	                              //multilevel inheritance
	 {
		 return a*b;
		 
	 }
	 
 }

public class InheritanceDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		CalcveryAdv c1= new CalcveryAdv();//creating a object
		/*if i give this to the customer he can perform only one operation  in 
		that is addition*/
		/*if we create more classes more more features customer can use perform
		multiple tasks*/
		
		//create a variable 
		int result1 =c1.add(2,4);
		int result2=c1.sub(5,3);
		int result3=c1.mul(2,3);
        System.out.println(result1); 
        System.out.println(result2);
        System.out.println(result3);

	}

}
 
