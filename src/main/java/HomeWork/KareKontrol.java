package HomeWork;
import java.util.Scanner;

public class KareKontrol {
    public static void main(String [] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Dikdörtgenin kısa kenar uzunluğunu giriniz:");
        double kisaKenar = input.nextDouble();

        System.out.println("Dikdörtgenin uzun kenarını giriniz:");
        double uzunKenar = input.nextDouble();

        if(uzunKenar <=0 || kisaKenar<=0) {
            System.out.println("Rakamlar pozitif olmalıdır");

        } else if (uzunKenar == kisaKenar) {
            System.out.println("Bu bir Karedir");
        }else {
            System.out.println("Bu bir Kare Değildir");
        }

        }
    }





