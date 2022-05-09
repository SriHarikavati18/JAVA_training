package javabasics;

public class operators {

	public static void main(String[] args) {
		int x=2 + 3 - 4* 5 % 8 / 4;//left to right associativity,precedence
		//proirity mul,mod,div,+,- more than this first priority to bracket (  )
	//int x=10+2;
	int y=10-5;
	int z=10%5;
	//float a=7/2f;
	double a= (double)7/2;//here we are getting 3.5
	double b= 7/2;//here i am getting 3.0 because i have not used type cast and it is similar to the float
	float c= 8/3;//here i am getting 2.0
	float d= (float)8/3;//here we are getting 2.666667 becasue we used the type casting(0r)float c=8/3f;
	System.out.println(x);
	System.out.println(y);
	System.out.println(z);
	System.out.println(a);
	System.out.println(b);
	System.out.println(c);
	System.out.println(d);
	}

}
 