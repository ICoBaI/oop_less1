public class Diaper extends ProductsForChildren {

    private int size;
    private int minWeight;
    private int maxWeight;
    private String type;


    public Diaper(String name, int price, int quantity, int measure, int minimumAge, String hypoallergenic, int size, int minWeight, int maxWeight, String type) {
        super(name, price, quantity, measure, minimumAge, hypoallergenic);
        this.size = size;
        this.type = type;
        this.minWeight = minWeight;
        this.maxWeight = maxWeight;
    }

    @Override
    public String toString(){
        return super.toString() + ", Размер = " + size +
                ", Минимальный вес = " + minWeight +
                ", Максимальный вес = " + maxWeight +
                ", Тип = " + type;
    }
}
