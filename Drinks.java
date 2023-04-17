public class Drinks extends Product {

    private int Volume;
    
    public Drinks(String name, int price, int quantity, int measure, int Volume) {
        super(name, price, quantity, measure);
        this.Volume = Volume;
    }


    @Override
    public String toString(){
        return super.toString() + ", Объём = " + Volume;
    }
}
