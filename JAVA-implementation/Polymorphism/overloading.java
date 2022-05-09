
public class overloading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		A obj =new A();
		obj.show(18); 

	}

}
class A{          //overloading ,early binding ,compiler time polymorphism
	public void show() {
		System.out.println("hello");
		
	}
	//if the two methods with the same name called it will show an error
	//because it confuses which one to call 
	//but we can achieve it by giving different parameters like
	//show()
	//show(int i)
	public void show(int i) {
		System.out.println("virat " +i);
	}
}
