package core.campaign.concreates;

import core.campaign.abstracts.ICampaign;

public class Campaign implements ICampaign {
    private int id;
    private String campaignName;
    private int discount;

    public Campaign(int id, String campaignName, int discount) {
        this.setId(id);
        this.setCampaignName(campaignName);
        this.setDiscount(discount);
    }


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getCampaignName() {
        return campaignName;
    }

    public void setCampaignName(String campaignName) {
        this.campaignName = campaignName;
    }

    public int getDiscount() {
        return discount;
    }

    public void setDiscount(int discount) {
        this.discount = discount;
    }
}
