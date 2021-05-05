package homework3Day4;

public class SellManager implements SellService{

	@Override
	public void sell(Campaign campaign) {
		
		System.out.println("Campaign sold : " + campaign.getName());
	}

}
