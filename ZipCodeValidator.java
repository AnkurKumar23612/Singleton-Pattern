package temp;

public class ZipCodeValidator {

	
	 public static boolean validate(String zip)
	 {
		 
		 return ResourceInitializer.getInstance().zipCode.containsKey(zip);
	 }
}
