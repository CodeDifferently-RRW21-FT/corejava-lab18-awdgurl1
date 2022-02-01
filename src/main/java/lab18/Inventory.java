package lab18;

public class Inventory {


    private static Integer stock = 10;
    private ItemsEnum item;
    private Integer price;


    public Inventory(ItemsEnum item, Integer price) {
        this.item = item;
        this.price = price;
        this.stock = stock;
        stock--;
    }

    public ItemsEnum getItem() {
        return item;
    }

    public Integer getPrice() {
        return price;
    }

    public static Integer getStock() {
        return stock;
    }

    public static void setStock(Integer stock) {
        Inventory.stock = stock;
    }

    @Override
    public String toString() {
        return item + ", price= " + price + " credits";
    }
}

