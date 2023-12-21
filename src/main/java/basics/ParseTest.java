package basics;

public class ParseTest {

    public static void main(String[] args) {

        Integer i1 = Integer.decode("0100"); // Andere Zahlensysteme (Oct,Hex,Bin) werden erkannt
        Integer i2 = Integer.parseInt("0100"); // Werte müssen im Dezimal eingegeben werden

        System.out.println(i1);
        System.out.println(i2);

        System.out.println();

        StringBuilder sb = new StringBuilder("ABCDEF");
        System.out.println(sb.capacity());
        sb.delete(4,6);
        System.out.println(sb.capacity());
        System.out.println(sb);

    }

}
