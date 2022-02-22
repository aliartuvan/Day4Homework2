package adapters.abstacts;

import entites.users.concreates.Gamer;

public interface UserCheckService {
    default boolean checkIfRealPerson(Gamer gamer) {
        return true;
    }
}
