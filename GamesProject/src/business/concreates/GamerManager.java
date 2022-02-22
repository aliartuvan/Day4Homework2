package business.concreates;

import adapters.concreates.EDevletServiceAdapter;
import business.abstracts.BaseUserManager;
import entites.users.concreates.Gamer;

public class GamerManager extends BaseUserManager {

   EDevletServiceAdapter eDevletServiceAdapter = new EDevletServiceAdapter();



    public void add(Gamer gamer) {
        if(eDevletServiceAdapter.checkIfRealPerson(gamer)) {
            System.out.println(gamer.getNickName() + " sisteme kayıt oldu");
        }else {
            System.out.println("Böyle biri yok");
        }


    }

    @Override
    public void delete(Gamer gamer) {
        System.out.println(gamer.getNickName() + " kaydını sildi.");
    }

    @Override
    public void update(Gamer gamer) {
        System.out.println(gamer.getNickName() + " bazı güncellemeler yaptı.");
    }

    public EDevletServiceAdapter geteDevletServiceAdapter() {
        return eDevletServiceAdapter;
    }

    public void seteDevletServiceAdapter(EDevletServiceAdapter eDevletServiceAdapter) {
        this.eDevletServiceAdapter = eDevletServiceAdapter;
    }
}
