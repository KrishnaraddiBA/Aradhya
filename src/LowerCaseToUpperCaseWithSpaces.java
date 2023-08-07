
public class LowerCaseToUpperCaseWithSpaces {

	public static void main(String[] args) {

		String s="krishna b alagawadi";
		char[] c = s.toCharArray();
		int size = c.length;
		char[]c1=new char[size];
		int i=0;
		while(i!=size) {
			if(c[i]!=' ') {
				c[i]=(char) (c[i]-32);
			}
			++i;
		}
		String s2 = String.valueOf(c);
		System.out.println(s2);
		
	}

}
