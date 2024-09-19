package day09_StringManipulations;

public class C02_Equals {

    public static void main(String[] args) {

        String str1="Ali";
        String str2="ali";

        String str3= new String("Ali");
        String str4="Ali";

        System.out.println(str1==str2);//false
        System.out.println(str1==str3);//false
        System.out.println(str1==str4);//true

    }
}
