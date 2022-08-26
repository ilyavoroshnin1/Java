package lesson19;

public class Tovar implements Comparable <Tovar>{
    private String name;
    private int price;
    private int salePrice;
    private int buyCount; // кол-во покупок

    public Tovar() {
    }

    public Tovar(String name, int price, int salePrice, int buyCount) {
        this.name = name;
        this.price = price;
        this.salePrice = salePrice;
        this.buyCount = buyCount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getSalePrice() {
        return salePrice;
    }

    public void setSalePrice(int salePrice) {
        this.salePrice = salePrice;
    }

    public int getBuyCount() {
        return buyCount;
    }

    public void setBuyCount(int buyCount) {
        this.buyCount = buyCount;
    }

    @Override
    public String toString() {
        return "Tovar{" +
                "name='" + name + '\'' +
                ", price=" + price +
                ", salePrice=" + salePrice +
                ", buyCount=" + buyCount +
                '}';
    }

    @Override
    public int compareTo(Tovar o) {
        if (this.getPrice() != o.getPrice()) {
            return this.getPrice() - o.getPrice();
        }

        if (this.getSalePrice() != o.getSalePrice()){
            return this.getSalePrice() - o.getSalePrice();
        }

        if (this.getBuyCount() != o.getBuyCount()){
            return this.getBuyCount() - o.getBuyCount();
        }

        if (!this.getName().equals(o.getName())){
            return this.getName().compareTo(o.getName());
        }

        return 0;

    }
}
