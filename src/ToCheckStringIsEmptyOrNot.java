
public class ToCheckStringIsEmptyOrNot {

	public static void main(String[] args) {
		String s="";
		int fwv = s.length();
		System.out.println(fwv);
		char[] c = s.toCharArray();
		int size = c.length;
	
		
			if(size==0) {
				System.out.println("String is empty");
			}
			else {
				System.out.println("String is not empty");
			}
			
		}
		
	}

