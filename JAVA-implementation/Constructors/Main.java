package contructors;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		shirt s = new shirt();
		s.putOn();
		s.setColor("White");
		s.setSize('L');
		s.TakeOff(); 
		System.out.println(s.color);
		System.out.println(s.size);
		
		

	}

}
