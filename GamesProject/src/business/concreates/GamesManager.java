package business.concreates;

import business.abstracts.BaseProductManager;
import core.campaign.concreates.Campaign;
import core.campaign.concreates.GameDiscount;
import entites.games.concreates.Games;
import entites.users.concreates.Gamer;

public class GamesManager extends BaseProductManager {

    @Override
    public void buy(Games games, Gamer gamer, Campaign campaign) {
    System.out.println(gamer.getNickName() +" tarafından " + games.getGameName() + " oyunu satın alındı.");
    System.out.println("Fiyat: " + games.getPrice());
    System.out.println(campaign.getCampaignName() + " kampanyası ile yeni fiyat " + GameDiscount.calculate(campaign,games));
    }


}
