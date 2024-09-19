package day06_ifElseStatement;

import java.util.Scanner;

public class C04_IfElseStatements {

    public static void main(String[] args) {


        Scanner scan =new Scanner(System.in);
        System.out.println("Lütfen bir karakter giriniz");
        char krk=scan.next().charAt(0);

        if(krk >='A'&& krk<='Z'){
            System.out.println("Buyuk harf");


        }else {
            System.out.println("Buyuk harf degıl");
        }
    }
}
