import java.util.Scanner;

public class Cal {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("How many days are in the month?");
        int days = input.nextInt();
        System.out.println("What was the first day in the month? (-1 to quit, 0 for Monday, 1 for Tuesday, etc) ");
        int firstDay = input.nextInt();
        System.out.println("M\tT\tW\tTH\tF\tS\tSU\t");

        while (true) {
            if (firstDay == -1) {
                break;
            }
            for (int i = 0; i < firstDay; i++) {
                System.out.print("\t");
            }
            for (int j = 1; j <= days; j++) {
                System.out.print(j + "\t");
                if ((firstDay + j) % 7 == 0) {
                    System.out.println("");

                }
            }
        }
    }
}
