package basics;

import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.List;

public class ExceptionTest3 {

    public static void main(String[] args) {

        //Parent p = new Parent();
        //Parent p = new Sub();
        Parent p = new SubSub();
        try {
            p.doSomething();
        }
        catch(Exception e) {
            System.out.println("Problem");
        }

        System.out.println(10 + 15 + "x" + 17 + 100);

        int x = +1; // 2
        int y = 2; // 3
        int z = 3; // 6
        z = x++ + y++ + z++; // Durch zuweisung auf z geht das letzte Postfix verloren
        System.out.println(z);

        boolean b = !true;

        Object o = new ArrayList<>();
        System.out.println(o instanceof List);

    }
}

class Parent {

    public void doSomething() throws FileNotFoundException {
        System.out.println("PARENT");
        // throw new RuntimeException("...");
    }
}

class Sub extends Parent {

    public void doSomething() {
        System.out.println("SUB");
    }
}

class SubSub extends Parent {

    public void doSomething() throws FileNotFoundException {
        System.out.println("SUBSUB");
    }
}
