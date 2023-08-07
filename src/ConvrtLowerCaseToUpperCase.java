
public class ConvrtLowerCaseToUpperCase {
	public static void main(String[] args) {
		
		String s="krishna";
		s=s.replace(" ", "");
		s = s.toLowerCase();
		char[] c = s.toCharArray();
		int size = c.length;
		char[]c1=new char[size];
		int i=0;
		while(i!=size) {
			c1[i]=(char) (c[i]-32);
			
			++i;
		}
		String s2 = String.valueOf(c1);
		System.out.println(s2);
	}

}
