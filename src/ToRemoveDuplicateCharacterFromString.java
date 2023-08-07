import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ToRemoveDuplicateCharacterFromString {
	public static void main(String[] args) {
		String s="krishnaraddi";
		char[] c = s.toCharArray();
		int size = c.length;
		Map<Character, Integer> map= new LinkedHashMap<>();
		int i=0;
		while(i!=size) {
			if (map.containsKey(c[i])==false) {
				map.put(c[i], 1);
				
			}
			else {
				Integer oldval = map.get(c[i]);
				Integer newval=oldval+1;
				map.put(c[i], newval);
			}
			++i;
			
		}
		Set<Entry<Character, Integer>> entrySet = map.entrySet();
		String res="";
		for (Entry<Character, Integer> entry : entrySet) {
			res=res+entry.getKey();
		}
		System.out.println(res);
	}
}
