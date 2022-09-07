import java.util.Scanner;

public class Cake {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        if (a>1) {

            if (a % 2 == 0) {
                System.out.println(a / 2);
            } if (a % 2 != 0) {
                System.out.println(a);
            }
        } else {
            System.out.println(0);
        }
    }
}