public class ToiletPaper extends HygieneItems {

    private int numOfLayers;

    public ToiletPaper(String name, int price, int quantity, int measure, int Amount, int numOfLayers) {
        super(name, price, quantity, measure, Amount);
        this.numOfLayers = numOfLayers;
    }

    @Override
    public String toString(){
        return super.toString() + ", Количество слоёв = " + numOfLayers;
    }
}
