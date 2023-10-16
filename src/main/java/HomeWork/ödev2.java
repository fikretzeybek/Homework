package HomeWork;

import java.util.Scanner;

public class ödev2 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);


        System.out.print("Üç basamaklı bir sayı girin:\n ");
        int sayi = input.nextInt();

        if (sayi >= 100 && sayi <= 999) {
            int yuzler = sayi / 100;
            int onlar  = sayi % 100/10;
            int birler = sayi % 10;



            switch (yuzler) {
                case 1:
                    System.out.print(sayi +" : " + "yüz ");break;
                case 2:
                    System.out.print(sayi +" : " + "ikiyüz ");break;
                case 3:
                    System.out.print(sayi +" : " + "üçyüz ");break;
                case 4:
                    System.out.print(sayi +" : " + "dörtyüz ");break;
                case 5:
                    System.out.print(sayi +" : " + "beşyüz ");break;
                case 6:
                    System.out.print(sayi +" : " + "altıyüz ");break;
                case 7:
                    System.out.print(sayi +" : " + "yediyüz ");break;
                case 8:
                    System.out.print(sayi +" : " + "sekizyüz ");break;
                case 9:
                    System.out.print(sayi +" : " + "dokuzyüz ");break;
            }

            switch (onlar) {
                case 1:
                    System.out.print("on ");break;
                case 2:
                    System.out.print("yirmi ");break;
                case 3:
                    System.out.print("otuz ");break;
                case 4:
                    System.out.print("kırk ");break;
                case 5:
                    System.out.print("elli ");break;
                case 6:
                    System.out.print("altmıs ");break;
                case 7:
                    System.out.print("yetmis ");break;
                case 8:
                    System.out.print("seksen ");break;
                case 9:
                    System.out.print("doksan ");break;

            }
            switch (birler){
                case 1:
                    System.out.print(" bir");break;
                case 2:
                    System.out.print(" iki");break;
                case 3:
                    System.out.print(" üç");break;
                case 4:
                    System.out.print(" dört");break;
                case 5:
                    System.out.print(" beş");break;
                case 6:
                    System.out.print(" altı");break;
                case 7:
                    System.out.print(" yedi");break;
                case 8:
                    System.out.print(" sekiz");break;
                case 9:
                    System.out.print(" dokuz");break;




            }


            } else {
                 System.out.println("Geçersiz sayı girdiniz. Lütfen üç basamaklı birsayı girin.");

        }





    }

}



