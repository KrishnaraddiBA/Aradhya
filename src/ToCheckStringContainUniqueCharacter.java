import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class ToCheckStringContainUniqueCharacter {
	public static void main(String[] args) {
		
		String s="krishnaraddi";
		char[] c = s.toCharArray();
		int size = c.length;
		int i=0;

		Map<Character, Integer> m=new HashMap<>();
		while(i!=size) {
			
			if(m.containsKey(c[i])==false) {
				m.put(c[i], 1);
			}
			else {
				Integer oldval = m.get(c[i]);
				oldval=oldval+1;
				Integer newval = m.put(c[i], oldval);
			}
			++i;
			
		}
		Set<Entry<Character, Integer>> entrySet = m.entrySet();
		for (Entry<Character, Integer> entry : entrySet) {
			if (entry.getValue()>1) {
				System.out.println("It doesnnot contain uniquecharacter");
				System.exit(0);
			}
		}	
				System.out.println("It contains unique character ");
			
			
		
	}

}
