public class Bread extends Foods {

    private String flour;

    public Bread(String name, int price, int quantity, int measure, int BestDate, String flour) {
        super(name, price, quantity, measure, BestDate);
        this.flour = flour;
    }

    @Override
    public String toString(){
        return super.toString() + ", Тип муки = " + flour;
    }
    
}
