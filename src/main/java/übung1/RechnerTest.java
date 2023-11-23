package übung1;

public class RechnerTest {
    public static void main(String[] args) {
        Rechner textRechner = new Rechner();

        System.out.println(textRechner.addMethode(10,20));
        System.out.println(textRechner.minusMethode(50,30));
        System.out.println(textRechner.malMethode(2,5));
        System.out.println(textRechner.durchMethode(8,2));

    }
}
