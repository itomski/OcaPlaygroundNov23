package basics;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Predicate;

public class PredicateTest {

    public static void main(String[] args) {

        String wort = "Puzzemuckel";

        check(wort, w -> w.toLowerCase().charAt(0) == 'b');

        check(wort, w -> w.length() > 5);

        check(wort, w -> w.indexOf("ö") >= 0);

        List<String> namen = new ArrayList<>();
        namen.addAll(List.of("Bob", "Tony", "Bruce", "Natasha", "Ed", "Scott"));
        System.out.println(namen);
        namen.removeIf(n -> n.length() < 4);
        System.out.println(namen);

        System.out.println();

        int[] zahlenArr = {1,6,10,4,5,2,9,8,3};
        Arrays.sort(zahlenArr);
        System.out.println(Arrays.toString(zahlenArr));
        System.out.println(Arrays.binarySearch(zahlenArr, -5));

        //List.of(); // Seit Java 1.9
        List<Integer> zahlen = Arrays.asList(1,6,10,4,5,2,9,8,3);
        Collections.sort(zahlen);
        System.out.println(zahlen);
        System.out.println(Collections.binarySearch(zahlen, -5));

        byte b = 10;
        Byte b2 = 10;
        char c = 'C';
        int[] arr = new int[c];

    }

    public static void check(String wort, Predicate<String> pred) {

        System.out.println(pred.test(wort) ? "OK" : "FEHLER");
    }
}
