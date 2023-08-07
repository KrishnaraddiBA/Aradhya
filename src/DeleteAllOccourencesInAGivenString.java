
public class DeleteAllOccourencesInAGivenString {
	public static void main(String[] args) {
		String s="krishnaraddi";
		int size = s.length();
		char[] c = s.toCharArray();
		String newData="";
		int i=0;
		while (i!=size) {
		
			if(c[i]!='s') {
				newData=newData+c[i];
			}
			
			
			++i;
			
		}
		System.out.println(newData);
	}

}
