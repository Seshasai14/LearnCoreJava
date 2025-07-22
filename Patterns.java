import java.util.Scanner;
public class Patterns {
    public static void main(String[] args)
    {
        int number;
        Scanner sc = new Scanner(System.in);
        number = sc.nextInt();
        //First Pattern Equal Rows&Columns
        for(int i=0;i<number;i++)
        {
            for(int j=0;j<number;j++)
            {
                System.out.print("*");
            }
            System.out.println();
        }
        //Increasing Columns
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
        //Increasing Columns
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(j+1);
            }
            System.out.println();
        }
        //Increasing Columns
        for (int i = 0; i < number; i++) {
            for (int j = 0; j <= i; j++) {
                System.out.print(i+1);
            }
            System.out.println();
        }
//        for (int i = 0; i < ; i++) {
//
//        }
    }
}
