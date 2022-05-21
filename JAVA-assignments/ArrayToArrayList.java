package package2;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayToArrayList {

	public static void main(String[] args) {
		//list to array
	/* ArrayList<String> names= new ArrayList<>();
	 names.add("raju");
	 names.add("srinu");
	 names.add("pavan");
	 System.out.println("ArrayList: " +names);
	 
	 String[]arr = new String[names.size()];
	 names.toArray(arr);
	 System.out.println("Array is: ");
	 for(String element:arr) {
		 System.out.println(element +" ");*/
	 
	 //array to list
	 String[]arr1 = {"virat","dhoni","rohit"};
	 System.out.println("Array is:  " + Arrays.toString(arr1));
	 ArrayList<String> names2= new ArrayList<>(Arrays.asList(arr1));
	 System.out.println("ArrayList is:" + names2);
	 
	 
	 
	 
	 
	 
	 
	 
	 
	}

}
