package HomeWork;
import java.util.Scanner;

public class GunIsmiKontrol {
    public static void main(substringandlenght[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Bir gün ismi giriniz: ");
        String gunIsmi = scanner.nextLine().toLowerCase(); // Gün ismini küçük harfe çevirir


        if (gunIsmi.equals("pazartesi") || gunIsmi.equals("salı") || gunIsmi.equals("çarşamba") ||
                gunIsmi.equals("perşembe") || gunIsmi.equals("cuma") || gunIsmi.equals("cumartesi") ||
                gunIsmi.equals("pazar")) {

            char ilkHarf = Character.toUpperCase(gunIsmi.charAt(0)); // İlk harf büyük yapılır
            char ikinciHarf = gunIsmi.charAt(1); // İkinci harf zaten küçük kalır
            char ucuncuHarf = gunIsmi.charAt(2); // Üçüncü harf zaten küçük kalır

            System.out.println(ilkHarf + "" + ikinciHarf + "" + ucuncuHarf);
        } else {
            System.out.println("Geçerli gün ismi giriniz.");
        }
        //2.yol

        switch (gunIsmi) {
            case "pazartesi": case "salı": case "çarşamba": case "perşembe":
            case "cuma": case "cumartesi": case "pazar":
                char ilkHarf = Character.toUpperCase(gunIsmi.charAt(0)); // İlk harf büyük yapılır
                char ikinciHarf = gunIsmi.charAt(1); // İkinci harf zaten küçük kalır
                char ucuncuHarf = gunIsmi.charAt(2); // Üçüncü harf zaten küçük kalır
                System.out.println("Gün isminin 1., 2. ve 3. harfleri: " + ilkHarf + ikinciHarf + ucuncuHarf);
                break;
            default:
                System.out.println("Geçerli gün ismi giriniz.");
                break;


        }
    }
}