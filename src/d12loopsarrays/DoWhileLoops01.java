package d12loopsarrays;

public class DoWhileLoops01 {
    public static void main(String[] args) {
        //Do-while döngüsü blogundaki kodun en az bir kere calisacagindan emin olmak istedigimizde kullanilir
        //Yani döngüdeki kodlar ,kosul kontrolu yapilirken bile olsa ,en az 1 kez calisir.

        //---------------while

        /*baslangic degeri
        while(loop calisma kurali){
        calisacak kodlar
        artirma /eksiltme
        } */

        //_______________do-while
        /*baslangic degeri
        do{
        calisacak kodlar
        artirma/azaltma
        }while (loop calisma kurali);
         */
        //Örnek 1: 5 dahil den 3dahil  e kadar tamsayilari konsola yazdiriniz

        int i = 5;
        do {
            System.out.println(i);//5
                                  //4
                                  //3
            i--;
        }while (i>2);

        //_____________________
        //While loop ile while arasindaki fark nedir?
        //Asagidaki kodu inceleyinizBu kodda while döngüsüne giremez cünkü sart saglanmiyor.
        //While loopta loopun en basta kirilmasi mümkündür cünkü önce kural kontrol edilir sonra islem yapilir
        int k= 1;

        while (k<1){
            System.out.println("Ben while loopum");
            k++;
        }
        //_______________________
        //Asagidaki kodu inceleyiniz.do-while loopta loopun en basta kirilmasi mümkün degildir.
        //Önce 1 kez calistirilir(sonsuz döngüye sokulmazsa).Sonra kural kontrol edilir.

        int m=1;
        do {
            System.out.println("Ben do while loopum");
            m++;
        }while(m<1);












    }
}
