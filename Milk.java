public class Milk extends Drinks{

    private int fatContent;
    private int BestDate;

    public Milk(String name, int price, int quantity, int measure, int Volume, int fatContent, int BestDate) {
        super(name, price, quantity, measure, Volume);
        this.BestDate = BestDate;
        this.fatContent = fatContent;
    }

    @Override
    public String toString(){
        return super.toString() + ", Срок годности = " + BestDate +
                ", Процент жирности = " + fatContent;
    }
    
}
