package HomeWork;


import java.util.Scanner;

public class artikYilKontrol3 {
    public static void main(substringandlenght[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Bir yıl girin: ");
        int year = input.nextInt();

        if (year % 4 == 0 && (year % 100 != 0 || year % 400 == 0)) {
            System.out.println(year + " bir artık yıldır.");
        } else {
            System.out.println(year + " bir artık yıl değildir.");
        }
    }
}
