package d11loops;

public class WhileLoops01 {
    public static void main(String[] args) {

        /*__________for
       // for (baslangic degeri; loop calisma kurali; artirma/azaltma){
        //    calisacak kodlar
       }*/
        /*
        ----------While
        baslangic degeri
        While(loop calisma kurali){
        calisacak kodlar
        artirma/azaltma
        }
         */
        //Ornek1: 3 ten 6 ya kadar tamsayilari yazdiriniz.3 ve 6 dahil

        //1.yol:
        for (int i =3; i<7; i++){
            System.out.println(i);//3
                                  //4
                                  //5
                                  //&
        }
        System.out.println("___________");
        //2.yol:
        int i=3;
        while (i<7){
            System.out.println(i);
            i++;
        }
        //__________________
        //Ornek2:23 ten 12 ye kadar cift tamsayilari konsola yazdiriniz

        int k =23;
        while (k>11){
            if (k % 2==0){
                System.out.println(k);
            }
            k--;
        }
    }
}
