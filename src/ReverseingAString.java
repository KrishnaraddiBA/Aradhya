
public class ReverseingAString {

	public static void main(String[] args) {
		String s="krishna";
//		char[] c = s.toCharArray();
//
//	int size = c.length;
//	char[]c1=new char[size];
//	
//	int i=0;
//	while(i!=size) {
//		c1[size-1-i]=c[i];
//		
//		++i;
//		
//	}
//	String s1 = String.valueOf(c1);
//	System.out.println(s1);
		String s2="";
		for (int i = s.length()-1; i >=0; i--) {
			s2=s2+s.charAt(i);
			
		}
		System.out.println(s2);
	}
}
