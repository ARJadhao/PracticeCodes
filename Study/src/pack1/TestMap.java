package pack1;

import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class TestMap {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Map<String, String> map = new HashMap<>();
		map.put("FirstName", "Ashish");
		map.put("LastName", "Jadhao");
	
		//System.out.println(map);
		Set<String> keys = map.keySet();
		
		for (String string : keys) {
			System.out.println(string);
		}
		
	}
}
