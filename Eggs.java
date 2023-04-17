public class Eggs extends Foods {

    private int quantityEggs;

    public Eggs(String name, int price, int quantity, int measure, int BestDate, int quantityEggs) {
        super(name, price, quantity, measure, BestDate);
        this.quantityEggs = quantityEggs;
    }

    @Override
    public String toString(){
        return super.toString() + ", Количество в упаковке = " + quantityEggs;
    }
    
}
