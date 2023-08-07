import java.util.Arrays;

public class Anagrams {

	public static void main(String[] args) {
		String s="he is aradhya";
		String y="is he hradaya";
		
		
		s=s.replace(" ", "");
		y=y.replace(" ", "");
		
		s=s.toLowerCase();
		y=y.toLowerCase();
		
		char[] c = s.toCharArray();
		char[] c1 = y.toCharArray();
		Arrays.sort(c);
		Arrays.sort(c1);
		
		boolean b = Arrays.equals(c, c1);
		if (b==true) {
			System.out.println("Anagram");
			
		}
		else {
			System.out.println("Not an Anagram");
		}
	}
}
