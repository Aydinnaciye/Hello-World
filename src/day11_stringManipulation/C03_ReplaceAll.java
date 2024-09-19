package day11_stringManipulation;

public class C03_ReplaceAll {

    public static void main(String[] args) {

        String str="J1ava2 G9uzel5dir8";

        //str deki sayıları sılıp metnı Java Guzeldır yapın

        //str.replaceAll sadece bir harf veya char sequence i degil genelleme
        // ile soyleyebilecegimız ortak ozellıktekı tum karakterlerı degıstırebılır.

        System.out.println(str.replaceAll("\\d",""));//Java Guzeldır
        //\\d = sayıları hiclıge cevırir
        //\\W = harf veye rakam
        //\\w = harf veye rakam olmayan hersey
        //\\s = space
        //\\s+ = yan yana bırden fazla space

        System.out.println(str.replaceAll("\\D",""));//12958
        //\\D = sadece sayıları yazdır

        String  s1="ilk urunfiyatı :1250 tl";
        String s2="ıkıncı urunun fıyatı :1500 tl";
        //ıkı urunun fıyatını toplayın

        s1=s1.replaceAll("\\D","");//1250
        s2=s2.replaceAll("\\D","");//1500

        System.out.println(s1+s2);//1251500
        System.out.println(Integer.parseInt(s1)+Integer.parseInt(s2));//2750

    }
}
