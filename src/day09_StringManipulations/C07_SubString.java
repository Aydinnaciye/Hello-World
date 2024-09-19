package day09_StringManipulations;

public class C07_SubString {

    public static void main(String[] args) {

        String str = "Java gun geçtikce guzelleşiyor";

        str.substring(5,8);

        System.out.println(str.substring(5,8)); // gun
        //5. indexten baslar 8-5 karakter yazdırır.
        //5. index dahil(inclusive) , 8. index hariç (exclusive)


        //geçtikçe yazdırın

        System.out.println(str.substring(9,17));//geçtikçe

        System.out.println(str.substring(3,7));// a gu

        String isim="hasan";
        //verilen ismin ilk harfi buyuk geri kalan harflari buyuk olarak kaydedın

        isim = isim.substring(0,1).toUpperCase()+ //ilk harfi alıp buyuk harf yaptık

        isim.substring(1).toLowerCase(); //1. index ve sonrasını alıp kucuk harf yaptık

        System.out.println(isim);//Hasan

        System.out.println(isim.substring(2,5));//san

        //sadece 3.indexteki harfi yazdırın

        System.out.println(str.substring(3,4));//a

        System.out.println(isim.substring(2,2));//Hiç birşey yazdırmaz (hiçlik yazdırır)

        //System.out.println(isim.substring(5,2)); //Exeption fırlatır.


    }
}
