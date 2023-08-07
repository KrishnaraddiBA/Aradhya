
public class CheckOneStringRotationOfAnatherString {
	public static void main(String[] args) {
		String s="krishna";
		String y="rishnak";
		String newString = s.concat(s);
		if (newString.contains(y)) {
			System.out.println("It is an rotationalString");
		}
		else {
			System.out.println("It is not a rotationalString");
		}
	}

}
