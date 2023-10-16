package HomeWork;
import java.util.Scanner;

public class artikYilKontrol {
    public static void main(substringandlenght[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yılı girin: ");
        int yil = input.nextInt();

        boolean artikYil = (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0);

        if (artikYil) {
            System.out.println(yil + " bir artık yıldır.");
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}
