package core.campaign.abstracts;

import core.campaign.concreates.Campaign;

abstract public class BaseCampaingManager {
    void makeDiscount(Campaign campaign) {
        System.out.println("indirim yapıldı");
    }


}
