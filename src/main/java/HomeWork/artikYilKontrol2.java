package HomeWork;
import java.util.Scanner;

public class artikYilKontrol2 {
    public static void main(substringandlenght[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Yılı girin: ");
        int yil = input.nextInt();

        if (yil % 4 == 0) {
            if (yil % 100 == 0) {
                if (yil % 400 == 0) {
                    System.out.println(yil + " bir artık yıldır.");
                } else {
                    System.out.println(yil + " bir artık yıl değildir.");
                }
            } else {
                System.out.println(yil + " bir artık yıldır.");
            }
        } else {
            System.out.println(yil + " bir artık yıl değildir.");
        }
    }
}
