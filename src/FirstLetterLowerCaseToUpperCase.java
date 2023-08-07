
public class FirstLetterLowerCaseToUpperCase {
	public static void main(String[] args) {
		String s1="krishnaraddi b alagawadi";
		char[] c = s1.toCharArray();
		int size = c.length;
		c[0]=(char) (c[0]-32);
		int i=0;
		while(i!=size) {
			if (c[i]==' ') {
				c[i+1]=(char) (c[i+1]-32);
				
			}
			++i;
		}
		String s2 = String.valueOf(c);
		System.out.println(s2);
	}

}
