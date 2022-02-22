package entites.games.concreates;

public class Games extends Product{
    private String gameName;
    private double price;

    public Games(int id, int productId, int stockAmount, String gameName, String typeOfGame, double price) {
        super(id, productId, stockAmount);
        this.gameName = gameName;
        this.typeOfGame = typeOfGame;
        this.setPrice(price);
    }

    private String typeOfGame;





    public String getGameName() {
        return gameName;
    }

    public void setGameName(String gameName) {
        this.gameName = gameName;
    }

    public String getTypeOfGame() {
        return typeOfGame;
    }

    public void setTypeOfGame(String typeOfGame) {
        this.typeOfGame = typeOfGame;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
