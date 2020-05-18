package temp;

public class AddressValidator {

	
//	CityValidator c;
//	ZipCodeValidator z;
	
	public static boolean validate(Address a) {
		//here we can validate country ,city and many more
	return ZipCodeValidator.validate(a.zipCode);
	}
}
