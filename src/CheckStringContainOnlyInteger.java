
public class CheckStringContainOnlyInteger {
	public static void main(String[] args) {
		String s="123";
		char[] c = s.toCharArray();
		
		int size = c.length;
		char[]c1=new char[size];
		int i=0;
		while(i!=size) {
			if (c[i]>=1&&c[i]<=100) {
				++i;
				
			}
			else{
				System.out.println("Not an integer");
				System.exit(0);
			}
			
		}
		System.out.println("It contain only integer");
		
	}

}
