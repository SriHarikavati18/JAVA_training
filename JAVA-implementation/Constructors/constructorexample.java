package contructors;
// we should not create the Parametaraised constructor with out default constructor

public class constructorexample {
	String name;
	int rno;
	constructorexample(){
		name="sudeep";
		rno=25;
	}
	constructorexample(String str,int n){
		name =str;
		rno=n;
	}
	
	
public static void main(String []args)
{
	constructorexample obj1 =new constructorexample();// default constructor
	constructorexample obj2 =new constructorexample("rakesh",30);// parametaraised constructor
	
	System.out.println("name of the 1st person is: " +obj1.name);//output  is sudeep
	System.out.println("roll number of 1st person: "+ obj1.rno);// output is 25
	System.out.println("name of the 2nd person: "+obj2.rno);//output is rakesh
	System.out.println("roll number of 2nd person:" +obj2.rno);//output is 30
}
}