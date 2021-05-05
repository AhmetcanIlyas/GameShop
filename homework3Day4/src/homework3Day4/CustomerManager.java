package homework3Day4;

public class CustomerManager implements CustomerService{

	@Override
	public void add(Customer customer) {
		System.out.println("Player added : " + customer.getFirstName());
		
	}

	@Override
	public void delete(Customer customer) {
		System.out.println("Player deleted : " + customer.getFirstName());
		
	}

	@Override
	public void update(Customer customer) {
		System.out.println("Player updated : " + customer.getFirstName());
		
	}

	@Override
	public void login(Customer customer) {
		System.out.println("Player logged in : " + customer.getFirstName());
		
	}

	@Override
	public void logout(Customer customer) {
		System.out.println("Player logged out : " + customer.getFirstName());
		
	}
	
}
