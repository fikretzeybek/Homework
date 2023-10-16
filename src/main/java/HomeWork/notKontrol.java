package HomeWork;

import java.util.Scanner;

public class notKontrol {
    public static void main(substringandlenght[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("100 üzerinden notunuzu giriniz:");


        int girilenNot = input.nextInt();

       if(girilenNot>100){
           System.out.println("Geçersiz not");

        } else if (girilenNot<50) {
            System.out.println("D");

        } else if ( girilenNot>50 && girilenNot<61) {
            System.out.println("C");
        } else if (girilenNot>60 && girilenNot<81) {
            System.out.println("B");

        } else if (girilenNot>80 ) {
            System.out.println("A");

            
        }


    }
        












    }





