package HomeWork;


import java.util.Scanner;

public class GunAdlari {
    public static void main(substringandlenght[] args) {
        Scanner input = new Scanner(System.in);

       //System.out.print("Bir harf girin: ");
       //String harf = input.next();


       //if (harf.equalsIgnoreCase("P")) {
       //    System.out.println("Pazartesi, Perşembe, Pazar");
       //} else if (harf.equalsIgnoreCase("S")) {
       //    System.out.println("Salı");
       //} else if (harf.equalsIgnoreCase("Ç")) {
       //    System.out.println("Çarşamba");
       //} else if (harf.equalsIgnoreCase("C")) {
       //    System.out.println("Cuma, Cumartesi"); ;
       //} else {
       //    System.out.println("Geçersiz Giriş");
       //}




        System.out.print("Bir gün adı girin: ");
        String gunAdi = input.next().toLowerCase();


        if (gunAdi.equals("pazartesi") || gunAdi.equals("salı") || gunAdi.equals("çarşamba") || gunAdi.equals("perşembe") || gunAdi.equals("cuma")) {
            System.out.println(" hafta içi");
        } else if (gunAdi.equals("cumartesi") || gunAdi.equals("pazar")) {
            System.out.println(" hafta sonu");
        } else {
            System.out.println("Geçersiz giriş");
                }
            }
        }







