package day05_concatenation_operatorler;

public class C01_Concatenation {

    public static void main(String[] args) {
        //sadece aşagıda verilen variableleri kullanarak istenen degerleri yazdıralım
        String s1="Java";
        String s2="Güzeldir";
        String s3=""; //hiçlik
        String s4=" "; //space
        int sayı1=4;
        int sayı2=3;
        //Java7 Güzeldir43
        System.out.println(s1+(sayı1+sayı2)+s4+s2+sayı1+sayı2);

        //34 Java
        System.out.println(sayı2+s3+sayı1+s4+s1);

        //Java Güzeldir 43
        System.out.println(s1+s4+s2+s4+sayı1+sayı2);



    }
}
