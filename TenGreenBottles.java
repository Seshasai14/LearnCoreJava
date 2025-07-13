import java.util.*;
public class TenGreenBottles {
    public static void main(String[] args) {
        System.out.println("10 Green Bottles");
        Scanner sc = new Scanner(System.in);
        int initialBottles = 10;
        while (initialBottles > 0) {
            System.out.println(initialBottles + "green bottles hanging on the wall");
            System.out.println(initialBottles + "green bottles hanging on the wall");
            System.out.println("And if 1 green bottle should accidentally fall");
            initialBottles -= 1;
            System.out.println("There'll be" + initialBottles + "green bottles hanging on the wall.");
            if (initialBottles == 1) {
                System.out.println(initialBottles + "green bottle hanging on the wall");
                System.out.println(initialBottles + "green bottle hanging on the wall");
                System.out.println("And if 1 green bottle should accidentally fall");
                initialBottles -= 1;
                System.out.println("There'll be" + initialBottles + "green bottles hanging on the wall.");
            }
            if (initialBottles == 0) {
                System.out.println(initialBottles + "green bottle hanging on the wall");
                System.out.println(initialBottles + "green bottle hanging on the wall");
                System.out.println("And if 1 green bottle should accidentally fall");
                System.out.println("There'll be no green bottles hanging on the wall.");
            }
        }
    }
}




