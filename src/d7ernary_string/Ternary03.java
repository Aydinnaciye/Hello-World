package d7ernary_string;

public class Ternary03 {
    public static void main(String[] args) {

        //Ornek:Verilen yilin "Leap year"(artik) olup olmadigini kontrol eden kodu yaziniz.
        //1-Yil 100 e bölününce 400 e de bölünmelidir. 1600 -->Leap   1800-->Leap degil
        //2-Yil 100 e bölünmüyorsa 4 e bölünmelidir.2004 -->Leao       2005 --> Leap degil

        //(c) ? (t) : (f)
        //(c) ? ( (c) ? (t) : (f) ) : (  (c) ? (t) : (f)  )

        int year = 2004;
        String result = (year % 100 == 0) ? ((year % 400 == 0) ? ("Leap year") : ("Leap year degil")) :
                ((year % 4 == 0) ? ("Leap year") : (" Leap year degil"));
        System.out.println(result);
      //----------------------

        int year1 = 1800;
        String result1 = (year1 % 100 == 0) ? ((year1 % 400 == 0) ? ("Leap year") : ("Leap year degil")) :
                ((year1 % 4 == 0) ? ("Leap year") : (" Leap year degil"));
        System.out.println(result1);
    }
}