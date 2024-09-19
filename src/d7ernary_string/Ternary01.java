package d7ernary_string;

public class Ternary01 {
    public static void main(String[] args) {
        //Ornek:Bir sayinin mutlak degerini hesaplayan kodu yaziniz.
        //-4 ==>  -1*-4  a==> 4  0==>0
        //Bir gercek sayinin sayi dogrusundaki yerinin baslangic noktasina (0)
        // olan uzakligina  o sayinin mutlak degeri denir.0 in mutlak degeri 0 dir.
        //(c) ? (t) : (f)

        int c = -4;
                    //condition   ?    true  :  false;
          int result =   c < 0    ?  -1 * c  :  c;
        System.out.println(result);

      //---------------
        //Ornek: Iki sayinin isareti ayni ise bu sayilari carpan ,farkli ise  "Farkli isaretli sayilari carpamiyorum"
        // mesaji yazan kodu yaziniz

        int a = 7;
        int b = -4;

        Object result1 = (a>0  &&  b>0)  || (a<0  &&  b<0) ? (a*b) : ("Farkli isaretli sayilari carpamiyorum");//Farkli isaretlileri carpamiyorum.
        System.out.println(result1);
        //Object classin parenti yoktur.int ve String beraber olunca icin kullanilabilir.
        //primitivelerde parent chaild iliskisi yoktur.int in parenti yoktur.Arka planda java inti integere cevirdi.



    }
}
