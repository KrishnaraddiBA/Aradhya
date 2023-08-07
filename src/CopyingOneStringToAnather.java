
public class CopyingOneStringToAnather {

	public static void main(String[] args) {
		String s="krishna";
		char[] c = s.toCharArray();
		int size = c.length;
		char c1[]=new char[size];
		int i=0;
		while(i!=size) {
			c1[i]=c[i];
			++i;
		}
		String s1 = String.valueOf(c1);
		System.out.println(s1);
	}
	
	
}
