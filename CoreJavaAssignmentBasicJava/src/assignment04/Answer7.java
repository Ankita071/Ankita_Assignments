package assignment04;

import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.TreeMap;

public class Answer7 {
	public static void main(String[] args) {
		StringBuilder result=new StringBuilder();
		Map<Integer, String> map= new TreeMap<>();
		map.put(1, "I ");
		map.put(2, " Like ");
		map.put(3, " To ");
		map.put(4, " Play ");
		map.put(5, " Chess");
		Set<Entry<Integer, String>> entrySet = map.entrySet();
		entrySet.forEach(a->result.append(a));
		System.out.println(result);
	}
}
