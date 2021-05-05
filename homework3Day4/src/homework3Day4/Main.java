package homework3Day4;

import java.time.LocalDate;

public class Main {

	public static void main(String[] args) {
		
		Customer customer = new Customer(1, "Ahmetcan", "Ilyas", LocalDate.of(1999, 2, 23), "1234567890");
		
		Campaign pro = new Campaign(1,"Professional player campaign",1000);
		Campaign student = new Campaign(2,"Student campaign",200);
		
		CampaignManager campaignManager = new CampaignManager();
		CustomerManager customerManager = new CustomerManager();
		SellManager sellManager = new SellManager();
		
		campaignManager.add(pro);
		campaignManager.update(pro);
		campaignManager.delete(pro);
		customerManager.add(customer);
		sellManager.sell(student);
	}

}
