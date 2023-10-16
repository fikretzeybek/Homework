package HomeWork;

public class VariablesOdev {
    public static void main(String[] args) {

        char soyAdiBaslangic = 'Z' ;
        System.out.println(soyAdiBaslangic) ;
//Note: char data typeinda degerler tek tirnak icine konulmalidir
        boolean geceOldu = false ;
        System.out.println(geceOldu) ;

    byte ogrenciYasi = 15 ;
    System.out.println(ogrenciYasi) ;

        short siteNufusu = 258 ;
        System.out.println(siteNufusu) ;

    int ulkeNufusu = 300666 ;
    System.out.println(ulkeNufusu) ;

        long weightOfSun = 567656577 ;
        System.out.println(weightOfSun) ;

//Note:Eger long 'a atadiginiz deger int' lerin araliginda ise sonuna L koymaya gerek yok,
//ama int lerin araligi disinda ise bunun long oldugunu sonuna L koyarak javaya söylemeliyiz

        long cellNumberInHumanBody = 876777788676777L ;
        System.out.println(cellNumberInHumanBody) ;

    float gomlekFiyati = 299.99F ;
    System.out.println(gomlekFiyati) ;

//Note: float olusturdugunuzda sonuna F yada f koymalisiniz, cunku java ondalikli sayilari otomatik olarak double kabul eder

        double weightCell = 0.0000000000567 ;
        System.out.println(weightCell) ;

//Note ==> "E" exponent (üs demek) 1.5 carpi 10 uzeri -11;

     System.out.print("==================================================") ;
     System.out.println("                                                ") ;

    String ogrenciAdi = "Ahmet Fatih" + " ve " + "Bilal Cihangir" ;
    System.out.println(ogrenciAdi) ;

        byte fiyat1 = 120 ;
        byte fiyat2 = 50 ;
        byte fiyat3 = 115 ;
        System.out.println(fiyat1+fiyat2-fiyat3) ;



    }

}
