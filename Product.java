public class Product {
    private String name;
    private int price;
    private int quantity;
    private int measure;
    
    public Product(String name, int price, int quantity, int measure) {
        this.name = name;
        this.price = price;
        this.quantity = quantity;
        this.measure = measure;
    }

    @Override
    public String toString(){
        return name +", Цена = "+ price +
                ", Количество = " + quantity + 
                ", Единица измерения = "+ measure;
    }
}

