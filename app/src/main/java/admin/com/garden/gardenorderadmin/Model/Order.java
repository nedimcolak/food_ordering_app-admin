package admin.com.garden.gardenorderadmin.Model;

/**
 * Created by Faggot on 11/16/2017.
 */

public class Order {
    private String ProductId;
    private String ProductName;
    private String Quantity;
    private String Price;
    private String Toppings;

    public Order() {
    }

    public Order(String productId, String productName, String quantity, String price, String toppings) {
        ProductId = productId;
        ProductName = productName;
        Quantity = quantity;
        Price = price;
        Toppings = toppings;
    }

    public String getProductId() {
        return ProductId;
    }

    public void setProductId(String productId) {
        ProductId = productId;
    }

    public String getProductName() {
        return ProductName;
    }

    public void setProductName(String productName) {
        ProductName = productName;
    }

    public String getQuantity() {
        return Quantity;
    }

    public void setQuantity(String quantity) {
        Quantity = quantity;
    }

    public String getPrice() {
        return Price;
    }

    public void setPrice(String price) {
        Price = price;
    }

    public String getToppings() {
        return Toppings;
    }

    public void setToppings(String toppings) {
        Toppings = toppings;
    }
}
