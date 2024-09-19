package day02_dataTürleri;

import java.util.Scanner;

public class C06_Scanner {

    public static void main(String[] args) {

        //Kullanıcıdan bir dikdörtgenin iki kenar uzunlugunu alıp,
        //dikdörtgenin çevresini hesaplayın

        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen dikdörtgenin iki kenar uyunlugunu girin"+
                "\niki kenar uyunlugu arasında enter'a basın");

        int kenar1 =12;
        int kenar2 =18;

        System.out.println("Dikdörtgenin alanı :"+ (kenar1+kenar2+kenar1+kenar2)); //60


    }

}
