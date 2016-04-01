package StringstoInt;

public class Main{
	public static void main(String[] args) {
	System.out.println(Strings.toInt("abc") == 0);
	System.out.println(Strings.toInt(" 3") == 3);
	System.out.println(Strings.toInt("a3") == 0);
	System.out.println(Strings.toInt("3a") == 0);
	System.out.println(Strings.toInt("3  ") == 3);
	System.out.println(Strings.toInt("76543") == 76543);
	System.out.println(Strings.toInt(" 76543") == 76543);
	System.out.println(Strings.toInt(" 76543   ") == 76543);
	System.out.println(Strings.toInt(" 765a43   ") == 0);
	System.out.println(Strings.toInt(" 765 43   ") == 0);
	System.out.println(Strings.toInt("87654321") == 87654321);
	
	}
}	