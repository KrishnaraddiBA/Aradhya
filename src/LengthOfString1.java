
public class LengthOfString1 {
	public static void main(String[] args) {
		String s="krishna";
		int count =0;
//		for (int i = 0; i < s.length(); i++) {
//			count++;
//		}
	
//		char[] c = s.toCharArray();
//		for (char d : c) {
//	count++;		
//		}
//		System.out.println(count);
//	}
	
		 s = s.concat("\0");
	System.out.println(s);
		 char[] c = s.toCharArray();
		 int i=0;
		 while(c[i]!='\0') {
			 count++;
			 ++i;
		 }
		 System.out.println(count);
	}

}
