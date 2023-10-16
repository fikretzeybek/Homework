package HomeWork;
import java.util.Scanner;

public class KutsalGunler {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir gün adı girin: ");
        String gunAdi = input.nextLine().toLowerCase();//toLowerCase yazilan büyük harf de olsa küçüğe çeviriyor

        input.close();

        if (gunAdi.equals("cuma")) {
            System.out.println("Müslümanlar için kutsal gün");
        } else if (gunAdi.equals("cumartesi")) {
            System.out.println("Yahudiler için kutsal gün");
        } else if (gunAdi.equals("pazar")) {
            System.out.println("Hristiyanlar için kutsal gün");
        } else {
            System.out.println("Belirtilen kutsal gün bilgisi yok");
        }
    }
}
