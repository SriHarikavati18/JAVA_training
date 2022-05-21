
import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class CheckTheArrayContainsGiveenValue {

	public static void main(String[] args) {
		//array
		String[] array = {"salim","vishnu","ram"};
		//first convert the values to hashset
		Set<String> Set=new HashSet<String>(Arrays.asList(array));
		boolean isValueExist =Set.contains("ram");
		if(isValueExist) {
			System.out.println("value existed");
		}else {
			System.out.println("value not existed");
		}
		

	}

}
