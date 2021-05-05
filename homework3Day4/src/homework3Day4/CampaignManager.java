package homework3Day4;

public class CampaignManager implements CampaignService{

	@Override
	public void add(Campaign campaign) {
		
		System.out.println("Campaign added : " + campaign.getName());
	}

	@Override
	public void delete(Campaign campaign) {
		
		System.out.println("Campaign deleted : " + campaign.getName());
	}

	@Override
	public void update(Campaign campaign) {
		
		System.out.println("Campaign updated : " + campaign.getName());
	}
	
}
