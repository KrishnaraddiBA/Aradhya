
public class Panagram {
	public static void main(String[] args) {
		String s="the quick brawn fox jumps over a lazy dog";
		s=s.replace(" ", "");
		s=s.toUpperCase();
		char[] c = s.toCharArray();
		int size = s.length();
		int a[]= {0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0,0};
		int l = a.length;
		System.out.println(l);
		int i=0;
		while (i!=size) {
			int index=c[i]-65;
			a[index]=1;
			++i;
		}
		int j=0;
		while (j!=size) {
			if (a[i]==1) {
				++j;
			}
			else{
				System.out.println("It is not an Panagram");
				System.exit(0);
			}
			
			
		}
		System.out.println("Pangram");
	}

}
