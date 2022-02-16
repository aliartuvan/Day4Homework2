package Adapters;

import Abstract.CustomerCheckService;
import Entities.Customer;
import MernisService.IVDKPSPublicSoap;

public class MernisServiceAdapter implements CustomerCheckService {
    IVDKPSPublicSoap ivdkpsPublicSoap = new IVDKPSPublicSoap();

     public boolean checkIfRealPerson(Customer customer) {
         try {
             return ivdkpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(customer.getNationaltyId()),
                     customer.getFirstName(),customer.getLastName(),customer.getDateOfBirth().getYear());
         } catch (Exception e) {
             e.printStackTrace();
         }
         return false;
     }
}
