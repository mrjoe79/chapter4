import java.util.Scanner;
public class tri1 {
    public static void main(String[] args) {
        Scanner sc1 = new Scanner(System.in);
        int temp = sc1.nextInt();
        int i;
        int j;

        for (i = 1; i <= temp; i++) {
            for (j = 1; j < i + 1; j++) {
                System.out.print('*');
            }
          System.out.println("");

        }
    }
}