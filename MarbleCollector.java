import java.util.*;

public class MarbleCollector {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int numberOfTestCase = input.nextInt();

        for (int i = 0; i < numberOfTestCase; i++) {
            int marblesWithMe = input.nextInt();
            int marbleTypes = input.nextInt();

            Set<Integer> marblesTypeIhave = new HashSet<>();

            for (int j = 0; j < marblesWithMe; j++) {
                int marble = input.nextInt();
                marblesTypeIhave.add(marble);
            }

            int uniqueMarblesIHave = marblesTypeIhave.size();
            int marblesIDontHave = marbleTypes - uniqueMarblesIHave;

            System.out.println(marblesIDontHave);
        }
        input.close();
    }
}
//Sample Input and Sample Output
/*
Sample Input
        3
        3 3
        1 1 2
        1 100
        42
        3 1
        1 1 1
Sample Output
        1

        99

        0
 */