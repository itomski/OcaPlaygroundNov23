package basics;

import java.util.Arrays;
import java.util.function.Predicate;

public class ParseTest {

    /*
    public ParseTest() {
        super();
    }
    */

    public static void main(String[] args) {

        // new ParseTest(); // Verwendet den default Konstruktor

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

        int i = 5;
        int j;
        boolean b = false;

        /*
        if(i > 10 && j < 10) { // j muss initialisiert sein
        }

        if(b && j < 10) { // j muss initialisiert sein
        }
        */

        final boolean b2 = false; // Kompiletime-Konstante

        if(b2 && j < 10) { // j muss NICHT initialisiert sein, da es gar nicht verwendet wird!
        }

        machWas(5,7,9,20,22);

        // String ejgStr[] = new String[][]{{null},new String[] {"a","b","c"},{new String()}}[0];

        String arr[][] = new String[][]{{null},new String[] {"a","b","c"},{new String()}};
        String ejgStr[] = arr[0];

        String check = "ABC";

        Predicate<String> pred = (wert) -> wert.equals(check);

        Abc[] arr2 = new Xyz[10];

        Object o = new String[5];
        Object[] oArr = new String[5];

    }

    static void machWas(int... zahlen) { // zahlen ist ein array von ints

        System.out.println(Arrays.toString(zahlen));

    }
}

interface Abc {
}

class Xyz implements Abc {
}