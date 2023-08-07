
public class Palindrome {
	public static void main(String[] args) {
		String s="gadag";
		
		char[] c = s.toCharArray();
		int size = c.length;
		char c1[]=new char[size];
		int i=0;
		while(i!=size) {
			c1[size-1-i]=c[i];
			++i;
			
		}
		String s2 = String.valueOf(c1);
		if (s.equals(s2)) {
			System.out.println("It is palindrome");
			
		}
		else {
			System.out.println("It is not a Plaindrome");
		}
	}

}
