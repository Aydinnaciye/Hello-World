package day09_StringManipulations;

public class C03_EqualsIgnoreCase {

    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";
        String str3="ALİ";

        System.out.println(str1.equals(str2));//false
        System.out.println(str1.equals(str3));//false

        System.out.println(str1.equalsIgnoreCase(str2));//true
        System.out.println(str1.equalsIgnoreCase(str3));//true

        System.out.println(str1.equalsIgnoreCase("Ali "));//false

        //equalIgnoreCase aynı metnin büyük küçük harf kullanılarak oluşturulan farklı
        // yazılımları birbirine eşit olarak kabul eder.

        //yani equalIgnoreCase için ali, Ali, ALİ aynıdır.Ama yanında boşluk varsa aynı kabul etmez.


    }
}
