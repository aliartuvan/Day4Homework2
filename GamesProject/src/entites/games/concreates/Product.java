package entites.games.concreates;

public class Product {
    private int id;
    private int productId;

    public Product(int id, int productId, int stockAmount) {
        this.id = id;
        this.productId = productId;
        this.stockAmount = stockAmount;
    }

    private int stockAmount;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getProductId() {
        return productId;
    }

    public void setProductId(int productId) {
        this.productId = productId;
    }

    public int getStockAmount() {
        return stockAmount;
    }

    public void setStockAmount(int stockAmount) {
        this.stockAmount = stockAmount;
    }
}
