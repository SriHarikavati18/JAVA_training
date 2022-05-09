package javabasics;

public class logicaloperator {

	public static void main(String[] args) {
		int x=20;
		int y=10;
		 boolean num1 =x==y;
		 boolean num2=x!=y;
		
		 System.out.println(num1);//false
		 System.out.println(num2);//true
		 System.out.println(num1 && num2);//false
		 System.out.println(num1 || num2);//true
		 System.out.println(!(num1 || num2));//false
		 
		 

	}

}
