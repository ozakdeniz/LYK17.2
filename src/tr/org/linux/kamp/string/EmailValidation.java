package tr.org.linux.kamp.string;

/*public class EmailValidation {
	
	public static void main(String[] args) {
		
		String email = "oz@akden";
		
		System.out.println(emailVerify(email));
		
	}
	
	public static boolean emailVerify(String str) {
		
		if(str.contains(" ")|| !str.contains("@")|| str.startsWith(".")||
				str.endsWith(".") ||str.startsWith("@")||str.endsWith("@")) {
			
	
		return false;
		}
	
	return true;
	}
}*/

import java.util.Scanner;

public class EmailValidation {
	public static void main(String[] args) {
		
		String mail = "furkantahaonder@gmail.com";
		
		System.out.println(isValid(mail));
	}
	
	private static boolean isValid(String email) {
		
		if(email.contains(" ")){
			return false;
		}
		
		if(!email.contains("@")){
			return false;
		}
		
		if(!email.contains(".")){
			return false;
		}
		
		if(email.startsWith("@") || email.startsWith(".")){
			return false;
		}
		
		
		if(!(email.indexOf('@') + 1 < email.indexOf('.'))){
			return false;
		}
		
		if(!(email.lastIndexOf('.') + 2 < email.length() )){
			return false;
		}
		
		return true;
	}

}