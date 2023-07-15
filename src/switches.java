import java.util.Scanner;

public class switches {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int row;
        int columns;
        String symbol;

        System.out.println("Enter the no. of row: ");
        row = sc.nextInt();
        System.out.println("Enter the no. of columns: ");
        columns = sc.nextInt();
        System.out.println("Enter the symbol you want: ");
        symbol  = sc.next();

        for (int i = 1; i<=row; i++){
            System.out.println();
            for (int j = 1; j<=columns; j++){
                System.out.print(symbol);
            }
        }
    }
}
