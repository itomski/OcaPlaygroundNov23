package uebung4;

public class App {

    public static void main(String[] args) {

        ProductManagement management = new ProductManagement(10);

        management.add(new Product("Tasse, gelb", 100, 2.99));
        management.add(new Product("Tasse, rot", 10, 2.19));
        management.add(new Product("Tasse, blau", 1000, 1.99));
        management.add(new Product("Tasse, grün", 200, 3.99));

        management.show();

    }
}
