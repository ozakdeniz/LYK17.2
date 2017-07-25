package tr.org.linux.kamp.string;

public class HelloString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = Integer.toString(1555579256);
		System.out.println(str);
		String hello = "Hello world!";
		System.out.println(hello);
		System.out.println(hello.toUpperCase());
		System.out.println(hello);
		
		String a = "hello";
		String b = "hello";
		boolean karsi = "hello" == "hello" ;
		boolean karsiab = a == b;
		
		System.out.println(karsi);
		System.out.println(karsiab);
		
		String c = new String("hello");
		String d = new String("hello");
		
		System.out.println(c==d);
		
		System.out.println(hello.substring(hello.indexOf(' ')+1,hello.length()));
		
		System.out.println(hello.indexOf(' '));
		
		System.out.println(hello.charAt(hello.length()-1));
		
		System.out.println(hello.indexOf('e')); //ilk e nin değerini verir.
		System.out.println(hello.indexOf('l',3));
		
		
		
	}
	}





/*public class HelloString {
	
	public static void main(String[] args) {
		
		String str = "hello,world";
		
		/*String str = Integer.toString(115);
		System.out.println(str);*/
		
		/*System.out.println(str.charAt(11));
		
		String str = "hello world";
		System.out.println(str.substring(0, 11));
		
		System.out.println(str.indexOf("eleman"));
		System.out.println(str.indexOf("el"));
		System.out.println(str.indexOf("tri"));
	    
	    System.out.println(str.substring(str.indexOf(" ")+ 1, str.lastIndexOf(" ")));
		
		System.out.println(str.substring(0, 2)=="he");
		System.out.println(str.substring(0, 2).equals("he"));//equalsı tercih etmeliyiz
		
		//System.out.println(reverseString(str));
		
		System.out.println(ourToUpperCase(str).equals(str.toUpperCase()));

		
	
	
	public static String ourToUpperCase(String str) {
		String result = "";
		for(int i=0 ; i<str.length() ; i++) {
			result += Character.toUpperCase(str.charAt(i));
		}
		return result;
	}
	
	public static String reverseString(String str) {
		String result = "";
		/*for(int i =str.length()-1; i>= 0; i--) {
			result += str.charAt(i);
		}
		for(int i=0; i<str.length(); i++) {
			result+= str.charAt(str.length()-1-1);
		}
		
		return result;
	}
	}*/

