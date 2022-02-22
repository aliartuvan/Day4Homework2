package business.abstracts;

import core.campaign.concreates.Campaign;
import entites.games.concreates.Games;
import entites.users.concreates.Gamer;

abstract public class BaseProductManager implements ProductSevice {


    @Override
    public void buy() {

    }

    public abstract void buy(Games games, Gamer gamer, Campaign campaign);
}

