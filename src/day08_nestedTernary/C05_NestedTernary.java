package day08_nestedTernary;

public class C05_NestedTernary {

    public static void main(String[] args) {

        //Ornek:Kullanıcıdan bir tamsayı alın
        //Sayı pozıtıfse ,cıft dayı veya cıft sayı degıl seceneklerınden uygun olanı yazdırın
        //Sayı pozıtıf degılse ,3 basamaklı veya 3 basamaklı degıl seceneklerınden uygun olanı yazdırın.

        int sayi=20;

        if (sayi>0){

            System.out.println(sayi%2==0 ? "Cıft sayı" : "Cıft sayı degıl");

        }else {

            System.out.println(sayi<-99 && sayi>-1000 ? "Uc basamaklı" : "Uc basamaklı degil");
        }

        String sonuc = sayi>0
                ?
                sayi%2==0 ? "Cift sayi" : "Cift sayi degil"
                :
                sayi<-99 && sayi>-1000 ? "Uc basamakli" : "Uc basamakli degil";









    }
}
