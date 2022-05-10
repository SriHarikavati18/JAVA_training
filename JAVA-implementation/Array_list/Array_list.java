import java.util.ArrayList;

public class Array_list {

	public static void main(String[] args) {
		String[] fruits= new String[4];
		fruits[0]="Mango";
		fruits[1]="Apple";
		fruits[2]="Strawberry";
		fruits[3]="watermelon";// here if want to print the watermelon i need to increase the size of the array everytime 
		System.out.println(fruits[3]);
		
		ArrayList fruitlist =new ArrayList();
		fruitlist.add("mango");
		fruitlist.add("Apple");
		fruitlist.add("Strawberry");
		fruitlist.add("watermelon");// in Arraylist it doesnt care about size it will take aany number of values that we are giving
		//but  Array has fixed Size but  collections(Arraylist)is growable in Size 
		fruitlist.remove("Strawberry");
		

		System.out.println(fruitlist);
		
		
	}

}
