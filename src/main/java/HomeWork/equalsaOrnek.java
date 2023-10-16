package HomeWork;

public class equalsaOrnek {

    public static void main(String[] args) {
        String str1 = "Merhaba";
        String str2 = "merhaba";
        String str3 = "Merhaba";

        boolean areEqual1And2 = str1.equals(str2); // false, büyük-küçük harf farklı
        boolean areEqual1And3 = str1.equals(str3); // true, içerik aynı

        System.out.println(areEqual1And2); // false
        System.out.println(areEqual1And3); // true
    }






}
