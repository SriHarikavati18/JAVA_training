import java.util.Set;
import java.util.HashSet;
import java.util.TreeSet;

public class Example {

	public static void main(String[] args) {
		Set<Integer> hashSet = new HashSet<>();
		hashSet.add(23);
		hashSet.add(4);
		hashSet.add(4);//here 4 is repeating twotimes so it will print ony one four due to rule of it 
		hashSet.add(4);
		hashSet.add(10);
		//System.out.println(hashSet);it is printing in form of list 
		for(int element:hashSet) {
			System.out.println(element + " ");
		}
		hashSet.isEmpty();     //return true if the set is empty
		hashSet.contains(10);  //returns true if the element is found
		hashSet.remove(23);    //returns true if the element was deleted
		hashSet.clear();       //clears all the elements
		 System.out.println("---------------");
		Set<Integer> treeSet = new TreeSet<>();
		treeSet.add(23);
		treeSet.add(4);
	    treeSet.add(4);//here 4 is repeating twotimes so it will print ony one four due to rule of it 
		treeSet.add(4);
		treeSet.add(10);
		treeSet.add(1);
		for(int element:treeSet) {
			System.out.println(element );// in this output we are getting outputs in ordered way like 1,4,10,23
		}
		
		
		/*
		 * set:Interface
		 * Hashset:Implementation
		 * treeset:Implementation [sorted]
		 * 
		 * properties:
		 *  1.unordered collection  
		 *  2.cannot store duplicate elements  
		 *  3.it has more implementation such as hashset,treehashset and TreeSet
		 */

	}

}
