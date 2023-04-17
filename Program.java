public class Program {
    public static void main(String[] args) {
        Product[] products = {new Product("banan", 0, 0, 0),
                                new Foods("banan", 1, 1, 1, 1),
                                new Drinks("sok", 1, 1, 1, 2),
                                new HygieneItems("milo", 1, 2, 3, 4),
                                new ProductsForChildren("gorshok", 1, 2, 3, 4, "da"),
                                new Milk("dom v dervne", 1, 1, 1, 1, 1, 1),
                                new Lemonade("sprite", 1, 1, 1, 1),
                                new Bread("yralskiu", 1, 1, 1, 1, "pshenichnaya"),
                                new Eggs("raba", 1, 1, 1, 1, 12),
                                new Masks("demon", 1, 1, 1, 12, "da"),
                                new ToiletPaper("zeva", 1, 1, 1, 1, 3),
                                new Diaper("hagis", 0, 0, 0, 0, "net", 11, 0, 0, "big"),
                                new Soother(null, 0, 0, 0, 0, null)};
        for (Product product:products) {
            getInfo(product);
        }
    }

    public static void getInfo(Product product) {
        System.out.println(product.toString());
    }
}
