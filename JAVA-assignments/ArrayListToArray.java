import java.util.ArrayList;
import java.util.List;

public class ArrayListToArray {

	public static void main(String[] args) {
		List<Integer> list= new ArrayList<>();
		list.add(5);
		list.add(6);
		list.add(2);
		//what ever the size of list i am creating an array
		Integer []intArray=new Integer[list.size()];
		list.toArray(intArray);//it return the all the element present in the list
		 for(Integer integer:intArray) {
			 System.out.println(integer);
		 }
		
		
		
	}
	
	

}
