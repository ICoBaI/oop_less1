public class ProductsForChildren extends Product{

    private int minimumAge;
    private String hypoallergenic;

    public ProductsForChildren(String name, int price, int quantity, int measure, int minimumAge, String hypoallergenic) {
        super(name, price, quantity, measure);
        this.hypoallergenic = hypoallergenic;
        this.minimumAge = minimumAge;
    }

    @Override
    public String toString(){
        return super.toString() + ", Минимальный возраст = " + minimumAge + ", Гипоаллергенность = " + hypoallergenic;
    }
    
}
