package javabasics;

public class incredecreOperators {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//two types 1.postfix =first operation and increment 
		//  2.prefix= first increment and nexxt operation
        //post fix
        /* int age = 10;
		 int newAge = age++;
		 //newage =age ;
		 //age =age +ut.1;
		 System.out.println(newAge);//output 10*/
		 //prefix 
		/* int age = 10;
		 int newAge =++age;
		  //age =age +1;
		//newage =age ;
		 System.out.println(newAge);//output 11*/
		
		
		 
		 
		 //same process for decrement operator
		/*int age = 10;// postfix
		 int newAge =age--;
		//newage =age ;
		  //age =age -1;
		
		 System.out.println(newAge);*/    //output 10
		
		int age = 10;//prefix
		 int newAge =--age;
		
		  //age =age -1;
		//newage =age ;
		
		 System.out.println(newAge);//output 9
		 
		 int salary =20;
		 System.out.println(salary++);//20
		 //execution 21
		 System.out.println(++salary);//22
		 //execution 22
		 System.out.println(salary++ + ++salary);//22+ 24= 46;
		 //same process for decrement 
		 

	}

}
