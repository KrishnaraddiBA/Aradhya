import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MaxRepeatingCharacter {
	public static void main(String[] args) {
		String s="gaaadag";
		char[] c = s.toCharArray();
		int size= c.length;
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
		int maxval=0;
		char maxkey=' ';
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue()>maxval) {
				maxkey=entry.getKey();
				maxval=entry.getValue();
				
			}
			
		}
		System.out.println(maxkey);
		System.out.println(maxval);
	}

}
