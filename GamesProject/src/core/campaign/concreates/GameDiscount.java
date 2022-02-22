package core.campaign.concreates;

import core.campaign.concreates.Campaign;
import entites.games.concreates.Games;

public class GameDiscount {
    Games games;
    Campaign campaign;
    public GameDiscount(Campaign campaign) {
        this.campaign = campaign;
    }

    public GameDiscount(Games games) {
        this.games = games;
    }




    public static double calculate(Campaign campaign, Games games) {

        double newPrice = games.getPrice() - (games.getPrice()/100*campaign.getDiscount());
        System.out.println("Oyunun indirimden sonraki fiyatı");

        return newPrice;
    }
}
