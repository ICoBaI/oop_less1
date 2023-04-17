public class Foods extends Product {

    private int BestDate;
    
    public Foods(String name, int price, int quantity, int measure, int BestDate) {
        super(name, price, quantity, measure);
        this.BestDate = BestDate;
    }


    @Override
    public String toString(){
        return super.toString() + ", Срок годности = " + BestDate;
    }
}
