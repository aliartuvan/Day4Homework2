import adapters.concreates.EDevletServiceAdapter;
import business.concreates.GamerManager;
import business.concreates.GamesManager;
import core.campaign.concreates.Campaign;
import entites.games.concreates.Games;
import entites.users.concreates.Gamer;

import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        Gamer ali = new Gamer(1,"aliartuvan","123","ali","artuvan",
                LocalDate.of(1998,1,1),"buraya tc gelecek");

GamerManager gamerManager = new GamerManager();
gamerManager.add(ali); // doğruluğu mernis doğrulaması ile kontrol ediyor.
        Games metin2 = new Games(1,101,78,"Metin2","\n" +
                "strategy",300);

        Campaign campaign = new Campaign(1,"İlkbahar İndirimi",10); // kampanya bilgileri

        GamesManager gamesManager = new GamesManager();
        gamesManager.buy(metin2, ali,campaign);

    }
}
