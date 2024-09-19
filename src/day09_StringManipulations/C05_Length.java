package day09_StringManipulations;

import java.util.Locale;

public class C05_Length {
    public static void main(String[] args) {

        String str="Uzunkavaklaraltındayataruyumazoglu";

        System.out.println(str.length());// 34 harf varmış.

        //son karakteri yazdırın

        System.out.println(str.charAt(33)); // u

        System.out.println(str.charAt(str.length()-1));//Son karakteri elde etmek için kullanılır.//u

        //sondan 3.karakteri yazdırın

        System.out.println(str.charAt(str.length()-3)); //g




    }
}
