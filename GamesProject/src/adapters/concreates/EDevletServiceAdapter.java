package adapters.concreates;

import adapters.abstacts.UserCheckService;
import entites.users.concreates.Gamer;
import service.QSHKPSPublicSoap;


public class EDevletServiceAdapter implements UserCheckService {
    QSHKPSPublicSoap qshkpsPublicSoap = new QSHKPSPublicSoap();

    public boolean checkIfRealPerson(Gamer gamer
    ) {
        try {
            return qshkpsPublicSoap.TCKimlikNoDogrula(Long.valueOf(gamer.getNationaltyId()),
                    gamer.getFirstName(),gamer.getLastName(),gamer.getDateOfBirth().getYear());
        } catch (Exception e) {
            e.printStackTrace();
        }
        return false;
    }
}
