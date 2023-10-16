package HomeWork;

import java.util.Scanner;

public class ucgenKontrol {
    public static void main(substringandlenght[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Üçgenin ilk kenar uzunluğunu girin: ");
        double kenar1 = input.nextDouble();

        System.out.print("Üçgenin ikinci kenar uzunluğunu girin: ");
        double kenar2 = input.nextDouble();

        System.out.print("Üçgenin üçüncü kenar uzunluğunu girin: ");
        double kenar3 = input.nextDouble();

        boolean pozitifSayi = (kenar1 > 0) && (kenar2 > 0) && (kenar3 >0) ;
        boolean eskenarUcgen = (kenar1 == kenar2) && (kenar2 == kenar3);

        if(pozitifSayi&&eskenarUcgen){
            System.out.println("Bu bir Eşkenar Üçgendir");

        } else if (pozitifSayi) {
            System.out.println("Bu bir eşkenar üçgen değildir");

        } else {
            System.out.println("Kenar uzunlukları pozitif tam sayı olmalıdır");
        }



    }
}
