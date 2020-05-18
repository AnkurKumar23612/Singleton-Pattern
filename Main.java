package temp;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
 
		
		Address a=new Address();
		
		a.setZipCode("123");
		
	     boolean ans=	AddressValidator.validate(a);
		System.out.println(ans);
	}

}
