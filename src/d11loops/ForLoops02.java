package d11loops;

public class ForLoops02 {
    public static void main(String[] args) {

        //Ornek 1:6 dan 10 a kadar tüm intlerin toplamini consola yazdiriniz.

        int sum = 0;
        for (int i = 6; i< 11; i++){
            sum = sum + i;
        }
        System.out.println(sum);//40


        //___________________
        //Ornek 2: 10 dan 7 ye kadar tüm tam sayilarin carpimini konsola yazdirin//5040

        int multiply = 1;//Carpmalarda 1 diyoruz
        for (int i= 10; i>6; i--){
            multiply = multiply*i;
        }
        System.out.println(multiply);//5040
    }
}
