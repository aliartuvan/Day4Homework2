package entites.users.concreates;

public class Seller extends User {

    private String taxNumber;

    public Seller(int id, String nickName, String password, String taxNumber) {
        super(id, nickName, password);
        this.taxNumber = taxNumber;

    }

    public String getTaxNumber() {
        return taxNumber;
    }

    public void setTaxNumber(String taxNumber) {
        this.taxNumber = taxNumber;
    }
}
