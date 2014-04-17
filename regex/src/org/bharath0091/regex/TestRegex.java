package org.bharath0091.regex;

import java.util.UUID;
import java.util.regex.Pattern;

public class TestRegex {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String email = "bharath@klm.co,in";
		
			
        String regexOld = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*(.[_A-Za-z0-9-]+)";		
        String regex    = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)+";        
        String regexNew = "^[_A-Za-z0-9-]+(\\.[_A-Za-z0-9-]+)*@[A-Za-z0-9-]+(\\.[A-Za-z0-9-]+)*(\\.[A-Za-z0-9-]+)";	        
        System.out.println("valid ? " + email.matches(regexOld));
        
        
        
        String[] emailAddresses = email.split(",");
        for (String emailToValidate : emailAddresses) {
			assert(emailToValidate.matches(regex));
		}
        
        
        System.out.println("outpu" + "".split(",")[0]);
        
        
        System.out.println(UUID.randomUUID().toString().replaceAll("-", ""));
        
        
        
        System.out.println("result :" + Pattern.compile("^\\+?[0-9]+.*").matcher("311234567a").matches());
        
	}

}
