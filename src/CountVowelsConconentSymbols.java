
public class CountVowelsConconentSymbols {
	
	public static void main(String[] args) {
		String s="krishnaraddi";
		s=s.toLowerCase();
		char[] c = s.toCharArray();
		int size = c.length;
		int i=0;
		int vowels=0;
		int conconent=0;
		int splchar=0;
		while(i!=size) {
			if (c[i]>='a'&&c[i]<='z') {
				
			
			if(c[i]=='a'||c[i]=='e'||c[i]=='o'||c[i]=='u')
			{vowels++;}
			else {
				conconent++;
			}
			
		}
			else {
				splchar++;
			}
			++i;
	}
	System.out.println(vowels);
	System.out.println(splchar);
	System.out.println(conconent);
	}
}
