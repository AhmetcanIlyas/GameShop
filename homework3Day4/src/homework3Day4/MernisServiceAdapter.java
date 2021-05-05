package homework3Day4;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements CustomerCheckSerice{

	@Override
	public boolean checkIfRealPerson(Customer customer) {
		
		KPSPublicSoapProxy client = new KPSPublicSoapProxy();

        Long kimlik = Long.parseLong(customer.getNationalatyId(), 10);
        int dogumYili = customer.getBirthOfDay().getYear();

        try {
            return client.TCKimlikNoDogrula(kimlik, customer.getFirstName().toUpperCase(),
                    customer.getLastName().toUpperCase(), dogumYili);
        } catch (RemoteException e) {

            e.printStackTrace();
        }
        return false;

    }	

}
