package HomeWork;

import java.util.Scanner;

public class if02 {

    public static void main(substringandlenght[] args) {

        //Example 1: Verilen bir sayinin pozitif, negatif veya notr oldugunu kontrol eden kodu yaziniz

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen bir sayı giriniz:");
        int num = input.nextInt();

        if(num>0){
            System.out.println("Sayı Pozitiftir!");

        } else if (num<0) {
            System.out.println("Sayı Negatiftir");
        }else{
            System.out.println("Sayı Nötrdür");
        }


    }



















}
