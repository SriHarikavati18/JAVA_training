
public class methodoverriding {

	public static void main(String[] args) {
		B obj =new B();
		obj.show();
		

	}
}
	class S{                      //overriding ,runtime polymorphism,late binding
		public void show() {
			System.out.println("hello");
		}
	}
	class B extends S{
		public void show () {
			System.out.println("virat");
		}//output is virat because even it has same method names in different classes it likes to jump to the 
		//class which obj name is declared
	}



