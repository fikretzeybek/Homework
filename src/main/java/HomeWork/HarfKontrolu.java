package HomeWork;
import java.util.Scanner;

public class HarfKontrolu {
    public static void main(substringandlenght[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir karakter girin: ");
        char karakter = scanner.next().charAt(0);

        scanner.close();

        if (Character.isLetter(karakter)) {//Character den sonra "." ya bastığımızda çıkan "isLetter"
            System.out.println("Girilen karakter bir harf.");
        } else {
            System.out.println("Girilen karakter bir harf değil.");
        }
    }
}
