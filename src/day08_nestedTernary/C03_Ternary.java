package day08_nestedTernary;

public class C03_Ternary {

    public  static  void  main ( String [] args ) {

        int  a = 5 ;
        /*
        Üçlü operatör tek basina kullanamaz
        üçlü bize bir sonuc üretir
        bu sonunda ya direk yazdırmalı veya bir değişken'a atamaliyiz
         */
        String  sonuc = a % 2 == 0 ? "çift sayi" : "tek sayi" ;

        /*
          üçlü'nin üretmeyecek bir değişken'a atayacak
          doğru ve yanlış koşullarinda üretilecek sürecin
          ayni data turuna uygun olması gerekir.
          aksi halde CTE olusur
          ama ternary'i sout icinde kullanirsak
          sonuclarin data turunun ayni olmasi sart olmaz
         */

        String  sonuc2 = a > 10 ? "büyük sayi" : "" + 2 * a ; // CTE vermemesi için String'e cevirdik

        System. out . println ( a > 10 ? "büyük sayi" : 2 * a );
    }
}

