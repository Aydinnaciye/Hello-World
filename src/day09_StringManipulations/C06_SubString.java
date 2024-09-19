package day09_StringManipulations;

public class C06_SubString {

    public static void main(String[] args) {

        String str ="Java ogren, işi kap";

        System.out.println(str.substring(5));//ogren işi kap

        System.out.println(str.substring(0)); // Java ogren işi kap

        System.out.println(str.length()); //19

        //Son harfi String olarak kaydedin
        String sonHarf=""+str.charAt(str.length()-1);

        sonHarf=str.substring(str.length()-1);
        System.out.println(sonHarf);//p

        //son indexteki karakteri uppercase olarak yazdırın

        System.out.println(str.substring(str.length()-1).toUpperCase());//P

        //son 3 harfi büyük harf olarak yazdırın

        System.out.println(str.substring(str.length()-3).toUpperCase());//KAP




    }
}
