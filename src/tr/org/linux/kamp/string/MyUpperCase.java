package tr.org.linux.kamp.string;

public class MyUpperCase {

	public static void main(String[] args) {

		String deneme = "HelloWorld";
		System.out.println(myToUpperCase(deneme).equals(deneme.toUpperCase()));

		System.out.println(reverseString(deneme));
		
		System.out.println(isPalindrome("abb"));

	}

	public static String myToUpperCase(String str) {
		String result = "";
		for (int i = 0; i < str.length(); i++) {
			result += Character.toUpperCase(str.charAt(i));
		}
		return result;
	}

	public static String reverseString(String str) {
		String result = "";
		/*for (int i = str.length() - 1; i >= 0; i--) {
			result += str.charAt(i);
		}
		*/
		for(int i = 0; i < str.length() ; i++) {
			result += str.charAt(str.length() - i -1);
		}
		return result;
	}
	
	public static boolean isPalindrome(String str) {
		return str.equals(reverseString(str));
	}

}
