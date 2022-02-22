package business.abstracts;

import entites.games.concreates.Games;
import entites.users.concreates.Gamer;

public interface GamerService {
    void add(Gamer gamer);
    void delete(Gamer gamer);
    void  update(Gamer gamer);
}
