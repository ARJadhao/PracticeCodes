package pack1;

import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class DuplicateString {

	
	public static void main(String[] args) {
		
		List<String> lst = Arrays.asList("AJ","JK","AJ","LI");
		
		Map<String, Integer> mp = new HashMap<>();
		
		lst.forEach(p->{
			Integer count = mp.get(p);
			mp.put(p, count == null ? 1 : count +1);
		});
		
		mp.entrySet().forEach(p->{
			System.out.println("Value: "+p.getKey()+" Count: "+p.getValue());
		});
	}
}
