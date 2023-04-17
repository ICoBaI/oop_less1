public class HygieneItems extends Product{
    
    private int Amount;

    public HygieneItems(String name, int price, int quantity, int measure, int Amount) {
        super(name, price, quantity, measure);
        this.Amount = Amount;

    }

    @Override
    public String toString(){
        return super.toString() + ", Количество штук в упаковке = " + Amount;
    }
    
}
