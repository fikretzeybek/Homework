package HomeWork;

import java.util.Scanner;

public class if01 {

    public static void main(substringandlenght[] args) {

        //Example 2: Gun sayisini verdiginizde gun ismini yazan kodu yaziniz
        //  1==> Pazar, 2 ==> Pazartesi .....

        Scanner input = new Scanner(System.in);
        System.out.println("Lütfen kaçıncı gün olduğunu giriniz");
        byte num = input.nextByte();

        if(num==1){
            System.out.println("sunday");
        } else if (num ==2) {
            System.out.println("monday");
        } else if (num==3) {
            System.out.println("tuesday");
        } else if (num==4) {
            System.out.println("wednesday");
        } else if (num==5) {
            System.out.println("thursday");
        } else if (num==6) {
            System.out.println("friday");
        } else if (num==7) {
            System.out.println("saturday");
        }else {
            System.out.println("Lütfen 1 ile 7 arasında bir sayı giriniz");
        }


    }


    }






