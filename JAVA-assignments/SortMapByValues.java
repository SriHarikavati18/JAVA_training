import java.util.ArrayList;
		import java.util.HashMap;
		import java.util.List;
		import java.util.Map;
		import java.util.Map.Entry;
public class SortMapByValues {

	public static void main(String[] args) {
		

		
				Map<Integer, Integer> map = new HashMap<>();
				map.put(2, 1020);
				map.put(3, 300);
				map.put(1, 100);
				map.put(5, 500);
				map.forEach((k,v)->System.out.println(k+"="+v));
				System.out.println("After Sorting by value");
				List<Entry<Integer, Integer>> list = new ArrayList<>(map.entrySet());
				list.sort(Entry.comparingByValue());
				list.forEach(System.out::println);
			}
		

	}


