package core.campaign.concreates;


import core.campaign.abstracts.BaseCampaingManager;

public class CampaignManager extends BaseCampaingManager {

    void makeDiscount(Campaign campaign) {
        System.out.println(campaign.getDiscount()+ " oranında indirim yapıldı");

    }
}
